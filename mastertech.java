import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/

class Calculadora{
    public void suma(float n1, float n2){
        System.out.printf(String.format("%.1f", (n1 + n2))+" ");
    }

    public void producto(float n1, float n2){
        System.out.printf(String.format("%.1f", (n1 * n2))+" ");
    }
}

class Reto0{

    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String [] read(){
        return this.scanner.nextLine().split(" ");
    }

    /**
    * método principal
    */
    public void run(){
        /*
        solución propuesta
        */
        String [] nums = this.read();
        Calculadora calculadora = new Calculadora();
        float n1 = Float.parseFloat(nums[0]);
        float n2 = Float.parseFloat(nums[1]);
        calculadora.suma(n1, n2);
        calculadora.producto(n1, n2);
    }
}

public class mastertech{
    public static void main(String[] args) {
        Reto0 reto = new Reto0();
        reto.run();
    }
}