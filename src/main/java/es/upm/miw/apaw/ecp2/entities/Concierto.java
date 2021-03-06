package es.upm.miw.apaw.ecp2.entities;

import java.time.LocalDateTime;

public class Concierto  {
    int id;
    int duracionEnMinutos;
    String nombre;
    double precio;
    LocalDateTime momento;


    public Concierto(int id, LocalDateTime momento,
                     int duracionEnMinutos,
                     String nombre, double precio) {
        this.id = id;
        this.momento = momento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
