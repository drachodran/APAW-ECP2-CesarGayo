package es.upm.miw.apaw.ecp2.dtos;

import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Album;
import es.upm.miw.apaw.ecp2.entities.ArtistaBuilder;
import es.upm.miw.apaw.ecp2.entities.Profesional;

import java.util.ArrayList;
import java.util.List;

public class ArtistaDto {

    int idArtista;
    boolean anonimo;
    String nombre;
    String pseudonimo;
    Profesional suAgente;
    List<Album> susAlbumes;

    public ArtistaDto() {
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }

    public Profesional getSuAgente() {
        return suAgente;
    }

    public void setSuAgente(Profesional suAgente) {
        this.suAgente = suAgente;
    }

    public List<Album> getSusAlbumes() {
        return susAlbumes;
    }

    public void setSusAlbumes(List<Album> susAlbumes) {
        this.susAlbumes = susAlbumes;
    }
}
