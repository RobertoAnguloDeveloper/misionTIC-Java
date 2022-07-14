package Reto1;

import java.util.Scanner;

public class Reto1 {
    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * método principal
    */
    public void run(){
        String [] entrada = read().split(" ");
        double n1 = Double.parseDouble(entrada[0]);
        double n2 = Double.parseDouble(entrada[1]);

        System.out.println((n1 + n2)+" "+(n1 * n2));
    }

    public static void main(String[] args) {
        
    }
}
