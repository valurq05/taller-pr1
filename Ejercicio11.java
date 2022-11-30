
import java.util.Scanner;


public class Ejercicio11 {
public static void main(String[] args) {
       
float base;
float altura;
float area;

Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor ingrese la altura del triangulo");
    altura = leer.nextFloat();
    System.out.println("Porfavor ingrese la base del triangulo");
    base = leer.nextFloat();
    
    area = base * altura;
    
    System.out.println("El area del triangulo es: " + area );
    
    }
    
}
