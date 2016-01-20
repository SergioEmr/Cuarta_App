package com.sergio_emroutlook.cuartaapp.domain;

/**
 * Created by sergio on 19/01/2016.
 */
public class Secciones {
    private int imagen;
    private String seccion;
    private String avance;

    public Secciones(int imagen, String seccion, String avance) {
        this.imagen = imagen;
        this.seccion = seccion;
        this.avance = avance;
    }

    public String getNombre() {
        return seccion;
    }

    public int getImagen() {

        return imagen;
    }

    public String getAvance() {
        return avance;
    }
}
