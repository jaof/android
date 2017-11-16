package edu.itla.tripdom.Entity;

import java.util.Date;

/**
 * Created by jose ariel on 15/11/17.
 */

public class Publicacion_Detalles {

        int id;
        Date fecha;
        int publicidadId;
        String descripcion;
        String lugar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPublicidadId() {
        return publicidadId;
    }

    public void setPublicidadId(int publicidadId) {
        this.publicidadId = publicidadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    String imagen;




}
