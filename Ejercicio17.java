
import java.util.Scanner;


public class Ejercicio17 {
public static void main(String[] args) {
       
float calificacion;

Scanner leer = new Scanner(System.in);

    System.out.println("Porfavor digite su calificación");
    calificacion = leer.nextFloat();
    
    if ((calificacion>0)&&(calificacion<=2.9)) {
        
        System.out.println("Su ponderación es: Insuficiente"); 
        
    }
     if ((calificacion>=3.0)&&(calificacion<=3.5)) {
        
       System.out.println("Su ponderación es: Regular"); 
        
    }
     if ((calificacion>=3.6)&&(calificacion<=4.0)) {
        
        System.out.println("Su ponderación es: Bien"); 
        
    } 
    if ((calificacion>=4.1)&&(calificacion<=4.5)) {
        
        System.out.println("Su ponderación es: Muy bien"); 
        
    } 
    if ((calificacion>=4.6)&&(calificacion<=5.0)) {
       
       System.out.println("Su ponderación es: Excelente");  
    }
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
