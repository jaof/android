package edu.itla.tripdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          txtNombre = findViewById(R.id.txtNombre);
        final Button btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast Message = Toast.makeText( MainActivity.this,"Hola "+txtNombre.getText(),Toast.LENGTH_SHORT);
             //   setContentView(R.layout.activity_visualizar);
             //   Message.show();

               Intent visualizar = new Intent( MainActivity.this, Visualizar.class);

                visualizar.putExtra("Nombre:",txtNombre.getText().toString());
               startActivity(visualizar);

            }
        });


    }



}
