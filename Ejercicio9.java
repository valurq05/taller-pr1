
import java.util.Scanner;


public class Ejercicio9 {
public static void main(String[] args) {
       
        
double monto;    
double porcentaje;
double montoMas;
double montoMenos;
        
        
Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor ingrese un monto en pesos");
    monto = leer.nextDouble();
    
    porcentaje = (monto * 0.15);
    
    montoMas = monto + porcentaje;
    montoMenos = monto - porcentaje;
    
    System.out.println("El monto inicial es: " + monto);
    System.out.println("El monto con el descuento es: " + montoMenos);
    System.out.println("El monto con el aumento es: " + montoMas);

    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
