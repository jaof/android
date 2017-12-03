package edu.itla.tripdom.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.Entity.TipoUsuario;
import edu.itla.tripdom.Entity.Usuarios;

/**
 * Created by MESCyT on 26/11/2017.
 */

public class UsuarioDbo {
    private DboConnection connection;

    public UsuarioDbo(Context context) {

        connection =  new DboConnection(context);
    }
    public  void crear(Usuarios usuarios){
        ContentValues cv =new ContentValues();
        cv.put("nombre",usuarios.getNombre());
        cv.put("tipoUsuario", String.valueOf(usuarios.getTipoUsuario()));
        cv.put("imagen",usuarios.getImagen());

        SQLiteDatabase db = connection.getReadableDatabase();
        Long id = db.insert("Usuario",null,cv);
        usuarios.setId(id.intValue());
        db.close();


    }

    public List<Usuarios> buscar (){
        //lista donde se va ir agregado los usuario
        List<Usuarios> usuarios = new ArrayList<>();
        //Colunna a buscar en la base de datos
        String Columnas[] = new String[]{"id","nombre","tipoUsuario","imagen"};
        //abrir conexion ala base de datos solo lectura
        SQLiteDatabase db =  connection.getReadableDatabase();
        //ejectamos el consulta



        Cursor cursor =db.query("Usuario",Columnas,null,null,null,null,null);
        cursor.close();

        while (!cursor.isAfterLast()){
            Usuarios u = new Usuarios() {
                @Override
                public void setTipoUsuario(String tipoUsuario) {

                }
            };
            u.setId(cursor.getInt(cursor.getColumnIndex("id")));
            u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setTipoUsuario(TipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipoUsuario"))));

        }
        db.close();
        return  usuarios;
    }
}
