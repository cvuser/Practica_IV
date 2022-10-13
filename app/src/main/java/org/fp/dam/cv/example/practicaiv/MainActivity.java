package org.fp.dam.cv.example.practicaiv;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity implements aa {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Centro> centros = new ArrayList<Centro>();
        centros.add(new Centro("IES DOCTOR FLEMING", "Calle Doctor Fleming,1,33009", R.drawable.ic_launcher_background));
        centros.add(new Centro("IES MONTE NARANCO", "Calle Pedro Caravia,9,33012", R.drawable.ic_launcher_background));
        CentrosArrayAdapter adaptador = new CentrosArrayAdapter(this, R.layout.imagen, centros);
        setListAdapter(adaptador);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Centro elemento = (Centro) getListAdapter().getItem(i);
                Toast.makeText(MainActivity.this, elemento.nombre + "seleccionado", Toast.LENGTH_LONG).show();
            }
        });

    }
}



