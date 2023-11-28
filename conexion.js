const express = require('express');
const bodyParser = require('body-parser');
const { Connection, Request, TYPES } = require('tedious');


const app = express();
const port = 5174;  // Puerto en el que está ejecutando tu servidor

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

const config = {
    server: "DESKTOP-36GHE4O",
    authentication: {
        type: "default",
        options: {
            userName: "Carlos",
            password: "ViejaContraseña"
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
        // No cierres la conexión aquí
    });
    

    request.addParameter('Nombre', TYPES.VarChar, name) ;
    request.addParameter('Apellido', TYPES.VarChar, lastname);
    request.addParameter('Correo', TYPES.VarChar, email);
    request.addParameter('Contraseña', TYPES.VarChar, password);

    // Mueve esta línea fuera del evento 'requestCompleted'
    connection.execSql(request);

    // Cierra la conexión después de completar la solicitud
    connection.on('requestCompleted', function () {
        connection.close();
    });
});


// Ruta para el formulario de registro
app.get('/registro/registrar.html', (req, res) => {
    res.sendFile(__dirname + '/registro/registrar.html');
});

app.use(express.static(__dirname));


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
        // No cierres la conexión aquí
    });
    

    request.addParameter('Nombre', TYPES.VarChar, name) ;
    request.addParameter('Apellido', TYPES.VarChar, lastname);
    request.addParameter('Correo', TYPES.VarChar, email);
    request.addParameter('Contraseña', TYPES.VarChar, password);

    // Mueve esta línea fuera del evento 'requestCompleted'
    connection.execSql(request);

    // Cierra la conexión después de completar la solicitud
    connection.on('requestCompleted', function () {
        connection.close();
    });
});



// Ruta para el formulario de inicio de sesión
app.get('/index.html', (req, res) => {
    res.sendFile(__dirname + '/index.html');
});

// Ruta para el inicio de sesión
app.post('/iniciar-sesion', (req, res) => {
    const { email, password } = req.body;

    const request = new Request(`
        SELECT Correo, Contraseña FROM Usuarios WHERE Correo = @Correo AND Contraseña = @Contraseña;
    `, (err, rowCount) => {
        if (err) {
            console.error(err.message);
            res.status(500).send('Error al realizar el inicio de sesión');
        } else {
            if (rowCount > 0) {
                // Inicio de sesión exitoso
                res.redirect('/menu/menu.html'); // Redirige a la página de menú
            } else {
                // Credenciales incorrectas
                res.status(401).send('Correo electrónico o contraseña incorrectos');
            }
        }
        // No cierres la conexión aquí
    });

    request.addParameter('Correo', TYPES.VarChar, email);
    request.addParameter('Contraseña', TYPES.VarChar, password);

    // Mueve esta línea fuera del evento 'requestCompleted'
    connection.execSql(request);

    // Cierra la conexión después de completar la solicitud
    connection.on('requestCompleted', function () {
        connection.close();
    });
});
