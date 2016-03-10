package com.example.winchester.parques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarEventos();
    }
private void registrarEventos(){
ListView parques = (ListView) findViewById(R.id.ListaParque);

    parques.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            String itemSeleccionado = adapterView.getItemAtPosition(i).toString();

            Toast.makeText(getApplicationContext(), "Haz hecho click en " + itemSeleccionado, Toast.LENGTH_SHORT).show();
        }
    });
}

@Override
    public boolean onCreateOptionsMenu (Menu menu){
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
}

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.ListaParque){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
