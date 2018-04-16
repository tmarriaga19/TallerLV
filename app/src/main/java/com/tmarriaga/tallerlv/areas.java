package com.tmarriaga.tallerlv;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class areas extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        lv = (ListView)findViewById(R.id.lstAreas);
        resources = this.getResources();
        opc =resources.getStringArray(R.array.Areas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(areas.this,cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(areas.this,rectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(areas.this,triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(areas.this,circulo.class);
                        startActivity(in);
                        break;
                }
            }
        });

    }
}
