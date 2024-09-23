package org.example.AYUDAS;

public class Licor {
    private String nombre;
    private String marca;
    private String tipoLicor;
    private Double porcentajeAlcohol;
    private Double precio;

    public Licor() {
    }

    public Licor(String nombre, String marca, String tipoLicor, Double porcentajeAlcohol, Double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipoLicor = tipoLicor;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
