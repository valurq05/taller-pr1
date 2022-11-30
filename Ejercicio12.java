
import java.util.Scanner;


public class Ejercicio12 {
public static void main(String[] args) {
     
double radio;
double area;

Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor digite el radio del circulo");
    radio = leer.nextDouble();
   
    area = 3.1416 * (radio*radio);
    
    System.out.println("El área del circulo es: " + area);
    
}
}


