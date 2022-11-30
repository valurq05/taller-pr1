
import java.util.Scanner;


public class Ejercicio14 {
 public static void main(String[] args) {
        
double grados;
double farenheit;

Scanner leer = new Scanner(System.in);

     System.out.println("Porfavor digite los grados");
     grados = leer.nextDouble();
     
     farenheit = grados * 1.8 + 32;
     
     System.out.println("La temperatura en grados centigrados es: " + grados);
     System.out.println("La temperatura dada en grados Farenheit: " + farenheit);
    
    }
    
}
