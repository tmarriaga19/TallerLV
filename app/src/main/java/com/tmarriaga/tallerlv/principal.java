package com.tmarriaga.tallerlv;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class principal extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lv = (ListView)findViewById(R.id.lstOpciones);
        resources = this.getResources();
        opc =resources.getStringArray(R.array.Opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(principal.this,areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(principal.this,volumenes.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(principal.this,operaciones.class);
                        startActivity(in);
                        break;
                }
            }
        });
        
    }
}
