package com.sergio_emroutlook.cuartaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sergio_emroutlook.cuartaapp.adaptadores.adaptador_secciones;
import com.sergio_emroutlook.cuartaapp.domain.Secciones;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List items = new ArrayList();

        items.add(new Secciones(R.drawable.basicos, "Conceptos Basicos"));
        items.add(new Secciones(R.drawable.material_design, "Material Design"));
        items.add(new Secciones(R.drawable.disenio_grafico, "Diseño Grafico"));
        items.add(new Secciones(R.drawable.desarrollo, "Desarrollo"));
        items.add(new Secciones(R.drawable.publicacion, "Publicación"));
        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new adaptador_secciones(items);
        recycler.setAdapter(adapter);
    }
}
