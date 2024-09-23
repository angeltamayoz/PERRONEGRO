package org.example;

import org.example.AYUDAS.Licor;
import org.example.MODELOS.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Licor licor = new Licor();

        Cliente clienteLleno = new Cliente("Marcos", 18, "Medellín", "1017857655", "3204567896");
        Licor licorLleno = new Licor("Whiskey", "Jack Daniels", "Whiskey", 40.0, 50000.0);

        System.out.println("-----CLIENTES-----");
        System.out.println(clienteLleno.nombre);
        System.out.println(clienteLleno.edad);
        System.out.println(clienteLleno.ciudad);
        System.out.println(clienteLleno.cedula);
        System.out.println(clienteLleno.telefono);

        System.out.println("-----LICORES-----");
        System.out.println(licorLleno.nombre);
        System.out.println(licorLleno.marca);
        System.out.println(licorLleno.tipoLicor);
        System.out.println(licorLleno.porcentajeAlcohol);
        System.out.println(licorLleno.precio);
    }
}