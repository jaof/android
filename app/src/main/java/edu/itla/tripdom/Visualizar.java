package edu.itla.tripdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Visualizar extends AppCompatActivity {

    TextView txtVisualizarN ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        Bundle parametros = getIntent().getExtras();

       TextView txtVisualizarN = findViewById(R.id.txtVisualizarN);
        txtVisualizarN.setText(parametros.getString("Nombre"));

    }
}
