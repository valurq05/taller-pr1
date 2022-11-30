
import java.util.Scanner;


public class Ejercicio13 {
public static void main(String[] args) {
       
float base;
float altura;
float area;

Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor digite la base del rectangulo");
    base = leer.nextFloat();

    System.out.println("Porfavor digite la altura del rectangulo");
    altura = leer.nextFloat();
    
    area = base * altura;
    
    System.out.println("El área del rectangulo es: " + area);
        
    }
    
}
