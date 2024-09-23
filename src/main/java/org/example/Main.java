package org.example;

import org.example.AYUDAS.Licor;
import org.example.MODELOS.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Licor licor = new Licor();

        Cliente clienteLleno = new Cliente("Marcos", 18, "Medellín", "1017857655", "3204567896");
        Licor licorLleno = new Licor("Whiskey", "Jack Daniels", "Whiskey", 40.0, 50000.0);


        //Accediendo a los atributos
        System.out.println("-----CLIENTES-----");
        System.out.println(clienteLleno.getNombre());
        System.out.println(clienteLleno.getEdad());
        System.out.println(clienteLleno.getCiudad());
        System.out.println(clienteLleno.getCedula());
        System.out.println(clienteLleno.getTelefono());

        System.out.println("-----LICORES-----");
        System.out.println(licorLleno.getNombre());
        System.out.println(licorLleno.getNombre());
        System.out.println(licorLleno.getTipoLicor());
        System.out.println(licorLleno.getPorcentajeAlcohol());
        System.out.println(licorLleno.getPrecio());
    }
}