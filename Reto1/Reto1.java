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
        double masa = Double.parseDouble(entrada[0]);
        double altura = Double.parseDouble(entrada[1]);
        int edad = Integer.parseInt(entrada[2]);

        double imc = masa / (altura * altura);
        imc = Math.round(imc*10)/10.0;

        if (masa > 0 && masa < 150 && altura > 0.1 && altura < 2.5 && edad > 0 && edad < 110) {
            
            if (imc < 22) {
                System.out.println(imc+" Bajo");
            } else if (imc >= 22) {
                if(edad >= 45){
                    System.out.println(imc+" Alto");
                }else
                    System.out.println(imc+" Medio");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        Reto1 reto1 = new Reto1();
        reto1.run();
    }
}
