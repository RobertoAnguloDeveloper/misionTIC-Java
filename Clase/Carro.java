package Clase;

import java.util.Scanner;

public class Carro {
    String marca;
    String modelo;
    String color;
    double cilindraje;
    int numeroPuertas;
    int numeroAsientos;
    
    public void pasajeros(int cantidadPasajeros){
        if(cantidadPasajeros <= numeroAsientos){
            System.out.println("HAY CUPO");
        }else{
            System.out.println("NO HAY CUPO");
        }
    }

    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cilindraje=" + cilindraje + ", numeroPuertas=" + numeroPuertas + '}';
    }

    public static void main(String[] args) {
        Carro coupe = new Carro(); // Nuevo Objeto de tipo Carro
        coupe.marca = "Mazda";
        coupe.modelo = "MX-5";
        coupe.color = "Rojo Escarlata";
        coupe.cilindraje = 2.0;
        coupe.numeroPuertas = 2;
        coupe.numeroAsientos = 4;

        Carro sedan = new Carro(); // Nuevo Objeto de tipo Carro
        sedan.marca = "Chevrolet";
        sedan.modelo = "Camaro";
        sedan.color = "Rojo";
        sedan.cilindraje = 3.0;
        sedan.numeroPuertas = 4;
        sedan.numeroAsientos = 5;

        Scanner teclado = new Scanner(System.in); //ENTRADA DE DATOS
        long pasajeros;

        System.out.println("Ingrese la cantidad de pasajeros: ");
        pasajeros = teclado.nextInt();
    }
}