package com.sergio_emroutlook.cuartaapp.adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sergio_emroutlook.cuartaapp.R;
import com.sergio_emroutlook.cuartaapp.domain.Secciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergio on 19/01/2016.
 */
public class adaptador_secciones extends RecyclerView.Adapter<adaptador_secciones.seccionesViewHolder> {

    List<Secciones> items;
    Context context;


    public class seccionesViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView avance;

        public seccionesViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.img_seccion);
            nombre = (TextView) v.findViewById(R.id.txt_Seccion);
            avance = (TextView) v.findViewById(R.id.txt_avance);
        }
    }

    public adaptador_secciones(List<Secciones> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public seccionesViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new seccionesViewHolder(v);
    }

    @Override
    public void  onBindViewHolder(seccionesViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.avance.setText(items.get(i).getAvance());

    }
}
