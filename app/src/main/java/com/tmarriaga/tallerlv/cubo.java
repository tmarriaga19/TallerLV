package com.tmarriaga.tallerlv;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cubo extends AppCompatActivity {

    private TextView res;
    private EditText n1;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        n1 = (EditText)findViewById(R.id.txtAreaUnLado);
        res = (TextView)findViewById(R.id.txtResultado);
        resources = this.getResources();

    }

    public boolean validar (){

        if (n1.getText().toString().isEmpty()) {
            n1.setError(resources.getString(R.string.mensaje_de_error_uno));
            return false;
        }
        return true;
    }

    //Estructura para llamar a un botón
    public void calcular (View v){

        int num1, resultado=0;
        res.setText("");

        if (validar()){

            num1 = Integer.parseInt(n1.getText().toString()) ;
            resultado = (num1 * 6);

            String ope,dat,result;
            ope = resources.getString(R.string.area_del_cubo);
            dat = "Area un lado: "+num1;
            result = ""+resultado;

            operacion o = new operacion(ope,dat,result);
            o.guardar();
            Toast.makeText(this,resources.getString(R.string.operacion_registrada), Toast.LENGTH_SHORT).show();

            res.setText("\n\n"+"Resultado "+"\n"+ "Area: "+ resultado);
        }

    }

    //Estructura para llamar a un botón
    public void borrar (View v){

        res.setText("");
        n1.setText("");
        n1.requestFocus();

    }
}
