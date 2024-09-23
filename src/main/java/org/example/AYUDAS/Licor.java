package org.example.AYUDAS;

public class Licor {
    public String nombre;
    public String marca;
    public String tipoLicor;
    public Double porcentajeAlcohol;
    public Double precio;

    public Licor() {
    }

    public Licor(String nombre, String marca, String tipoLicor, Double porcentajeAlcohol, Double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipoLicor = tipoLicor;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.precio = precio;
    }
}
