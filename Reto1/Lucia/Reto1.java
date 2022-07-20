package Reto1.Lucia;

import java.util.Scanner;

public class Reto1 {

    public static String Calcular_Riesgo(double imc, int edad) {
        String riesgo = "";
        if (imc < 22) {
            riesgo = "Bajo";
        } else if (imc >= 22) {
            if (edad >= 45) {
                riesgo = "Alto";
            } else {
                riesgo = "Medio";
            }
        }
        System.out.println("alo");
        return riesgo;
    }

    public static double Calcular_IMC(double masa, double altura) {
        double IMC = masa / (altura * altura);
        return IMC;
    }

    public static boolean validacion(double masa, double altura, int edad) {
        if ((masa < 0 || masa > 150) || (altura < 0.1 || altura > 2.5) || (edad < 0 || edad > 110)) {
            return false;
        }
        return true;
    }

    public void run() {
        {
            Scanner sc = new Scanner(System.in);
            String[] entradas = sc.nextLine().split(" ");

            double masa = Double.parseDouble(entradas[0]);
            double altura = Double.parseDouble(entradas[1]);
            int edad = Integer.parseInt(entradas[2]);

            double imc = Calcular_IMC(masa, altura);

            if (validacion(masa, altura, edad)) {
                System.out.println(String.format("%.1f", imc) + " " + Calcular_Riesgo(imc, edad));
            } else {
                System.out.println("ERROR");
            }
            sc.close();
            Calcular_Riesgo(imc, edad);
        }
    }
}
