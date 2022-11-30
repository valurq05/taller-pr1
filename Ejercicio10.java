
import java.util.Scanner;


public class Ejercicio10 {
public static void main(String[] args) {
       
float lado;
float area;

Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor digite la longitud del lado del cuadrado");
    lado = leer.nextFloat();
   

    area = lado * lado;
    
    System.out.println("El area del cuadrado es: " + area );
        
    }
    
}
