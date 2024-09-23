package org.example.MODELOS;

public class Cliente {
    private String nombre;
    private Integer edad;
    private String ciudad;
    private String cedula;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, Integer edad, String ciudad, String cedula, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
