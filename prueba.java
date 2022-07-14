import java.util.Scanner;

public class prueba {
    private Scanner scanner = new Scanner(System.in);
    public String [] read(){
        return this.scanner.nextLine().split(" ");
    }
	public static void main(String[] args) {
        //Captura dos números separados por un espacio y muestra el resultado de la suma y el producto de ambos.
        prueba p = new prueba();
        String [] datos = p.read(); 
        
        float n1 = Float.parseFloat(datos[0]);
        float n2 = Float.parseFloat(datos[1]);
        System.out.printf(String.format("%.1f", (n1 + n2))+" ");
        System.out.printf(String.format("%.1f", (n1 * n2))+" ");
	}
}