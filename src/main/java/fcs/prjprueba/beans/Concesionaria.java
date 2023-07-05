package fcs.prjprueba.beans;

import java.util.ArrayList;

public class Concesionaria {

    private String nombre;
    private String direccion;
    private ArrayList<Vehiculo> en_servicio;

    public Concesionaria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getEn_servicio() {
        return en_servicio;
    }

    public void setEn_servicio(ArrayList<Vehiculo> en_servicio) {
        this.en_servicio = en_servicio;
    }

}
