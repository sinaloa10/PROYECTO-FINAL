const express = require('express');
const sql = require('mssql');

const app = express();
const port = 3000;

// Configuración de la conexión a SQL Server
const config = {
  user: 'DESKTOP-ENVLS9T\ACER',
  password: '',
  server: 'DESKTOP-ENVLS9T\SQLEXPRESS',
  database: 'Prueba',
  options: {
    encrypt: true, // Si tu servidor SQL Server requiere conexión segura
  },
};

// Ruta para registrar un usuario
app.post('/registro', async (req, res) => {
  try {
    await sql.connect(config);

    const { name, lastname, email, password } = req.body;

    // Insertar el nuevo usuario en la base de datos
    const result = await sql.query`INSERT INTO Usuarios (nombreUsuario, apellidoUsuario, correoElectronico, contraseña) 
                                   VALUES (${name}, ${lastname}, ${email}, ${password})`;

    res.status(201).json({ message: 'Usuario registrado correctamente' });
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Error interno del servidor' });
  } finally {
    sql.close();
  }
});

app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});