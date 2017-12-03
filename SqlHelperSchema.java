package edu.itla.tripdom.dao;

/**
 * Created by MESCyT on 26/11/2017.
 */

public class SqlHelperSchema {

    public static final String Crear_Tabla_Usuario="CREATE TABLE Usuario(id INTEGER ,nombre TEXT, tipoUsuario TEXT,imagen TEXT)";
    public static  final String Crear_Tabla_Publicaciones_Detalles =("CREATE TABLE PublicacionDetalles (id INTEGER, DATETIME fecha,INTEGER idPublicaciones,TEXT descripcion,TEXT lugar)");
    public static final String Crear_Tabla_Publicacion = ("CREATE TABLE Publicacion(id INTEGER,DATETIME fecha,DATETIME fechaViaje,DOUBLE costo,TEXT descripcion,TEXT estatus,INTEGER usuarioId,TEXT origen,TEXT imagen, INTEGER cupo)");
}
