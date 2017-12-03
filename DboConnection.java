package edu.itla.tripdom.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by MESCyT on 26/11/2017.
 */

public class DboConnection extends SQLiteOpenHelper {

    public static String DATA_BASE_NAME ="tripDom.db";
    public static String LOG_T ="BdoConnection";

    public DboConnection(Context context){
        super(context,DATA_BASE_NAME, null , 1 );
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_T, "Iniciando OnCreate..");
        db.execSQL(SqlHelperSchema.Crear_Tabla_Usuario);
        /* Poner todas las sentecias de las entidades restantes */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
