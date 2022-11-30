
import java.util.Scanner;


public class Ejercicio19 {
 public static void main(String[] args) {
      
int seleccion;
float hipotenusa;
float catetoAd;
float catetoOp;

Scanner leer = new Scanner(System.in);

     System.out.println("Porfavor ingrese lo que desea calcular");
     System.out.println("1- Hipotenusa");
     System.out.println("2- Cateto Adyacente");
     System.out.println("3- Cateto Opuesto");
     seleccion = leer.nextInt();
    
     if (seleccion == 1) {
        
         System.out.println("Porfavor digite el valor del cateto adyacente");
         catetoAd = leer.nextFloat();
         
         System.out.println("Porfavor digite el valor del cateto opuesto");
         catetoOp = leer.nextFloat();
         
         hipotenusa = (float) Math.sqrt((catetoAd * catetoAd)+(catetoOp * catetoOp));
         
         System.out.println("El valor de la hipotenusa es: " + hipotenusa);
     }
    
    if (seleccion == 2) {
        
         System.out.println("Porfavor digite el valor de la hipotenusa");
         hipotenusa = leer.nextFloat();
         
         System.out.println("Porfavor digite el valor del cateto opuesto");
         catetoOp = leer.nextFloat();
         
         catetoAd = (float) Math.sqrt((hipotenusa * hipotenusa)-(catetoOp * catetoOp));
         
         System.out.println("El valor del cateto adyacente es:" + catetoAd);
     }
   
    if (seleccion == 3) {
        
         System.out.println("Porfavor digite el valor de la hipotenusa");
         hipotenusa = leer.nextFloat();
         
         System.out.println("Porfavor digite el valor del cateto adyacente");
         catetoAd = leer.nextFloat();
         
         catetoOp = (float) Math.sqrt((hipotenusa * hipotenusa)-(catetoAd * catetoAd));
         
         System.out.println("El valor del cateto opuesto es:" + catetoOp);
         
         
     }
}
        }   
     
     
   
