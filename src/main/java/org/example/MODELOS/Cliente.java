package org.example.MODELOS;

public class Cliente {
    public String nombre;
    public Integer edad;
    public String ciudad;
    public String cedula;
    public String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, Integer edad, String ciudad, String cedula, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.cedula = cedula;
        this.telefono = telefono;
    }
}
