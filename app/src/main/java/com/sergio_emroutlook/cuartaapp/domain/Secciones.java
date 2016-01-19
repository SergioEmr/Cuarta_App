package com.sergio_emroutlook.cuartaapp.domain;

/**
 * Created by sergio on 19/01/2016.
 */
public class Secciones {
    private int imagen;
    private String seccion;

    public Secciones(int imagen, String seccion) {
        this.imagen = imagen;
        this.seccion = seccion;
    }

    public String getNombre() {
        return seccion;
    }

    public int getImagen() {
        return imagen;
    }
}
