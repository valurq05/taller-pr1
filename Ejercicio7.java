
import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
       
        
float metros;

Scanner leer = new Scanner(System.in);

        System.out.println("Porfavor ingrese el valor a convertir (en metros)");
        metros = leer.nextFloat();
        
        System.out.println("La unidad en km es: " + (metros/1000));       
        System.out.println("La unidad en Hm es: " + (metros/100));       
        System.out.println("La unidad en Dc es: " + (metros/10));       
        System.out.println("La unidad en dc es: " + (metros*10));       
        System.out.println("La unidad en cm es: " + (metros*100));    
        System.out.println("La unidad en mm es: "+ (metros*1000));       

        
        
        
        
        
        
        
    }
    
}
