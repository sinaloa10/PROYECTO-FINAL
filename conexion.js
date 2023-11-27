const express = require('express');
const bodyParser = require('body-parser');
const { Connection, Request, TYPES } = require('tedious');


const app = express();
const port = 5174;  // Puerto en el que está ejecutando tu servidor

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

const config = {
    server: "DESKTOP-ENVLS9T",
    authentication: {
        type: "default",
        options: {
            userName: "Oscar",
            password: "NuevaContraseña"
        }
    },
    options: {
        port: 1433,
        database: "Prueba",
        trustServerCertificate: true
    }
}

const connection = new Connection(config);

connection.connect();

connection.on('connect', (err) => {
    if (err) {
        console.log("Error al conectarse a la base de datos");
        throw err;
    }

    app.listen(port, () => {
        console.log(`Servidor escuchando en http://localhost:${port}`);
    });
});

// Ruta para el formulario de registro
app.get('/registro/registrar.html', (req, res) => {
    res.sendFile(__dirname + '/registro/registrar.html');
});

app.use(express.static(__dirname));


// Ruta para la inserción de registros
app.post('/registro/registrar', (req, res) => {
    const { name, lastname, email, password } = req.body;

    const request = new Request(`
        INSERT INTO Usuarios (Nombre, Apellido, Correo, Contraseña)
        VALUES (@Nombre, @Apellido, @Correo, @Contraseña);
    `, (err, rowCount) => {
        if (err) {
            console.error(err.message);
            res.status(500).send('Error al insertar el registro en la base de datos');
        } else {
            res.status(200).send('Registro exitoso');
        }
        connection.close();
    });

    request.addParameter('Nombre', TYPES.VarChar, name);
    request.addParameter('Apellido', TYPES.VarChar, lastname);
    request.addParameter('Correo', TYPES.VarChar, email);
    request.addParameter('Contraseña', TYPES.VarChar, password);

    connection.execSql(request);
});
