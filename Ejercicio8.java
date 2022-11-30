
import java.util.Scanner;


public class Ejercicio8 {

 public static void main(String[] args) {
        
int numeroUno;
int numeroDos;
int numeroTres;

Scanner leer = new Scanner(System.in);

     System.out.println("Porfavor ingrese el primer número: ");
     numeroUno = leer.nextInt();
     System.out.println("Porfavor ingrese el segundo número: ");
     numeroDos = leer.nextInt();
     System.out.println("Porfavor ingrese el tercer número: ");
     numeroTres = leer.nextInt();
     
     if ((numeroUno % 2 == 0)&&(100<numeroUno)&&(numeroUno<200)) {
        
         System.out.println("El numero uno es par y se encuentra dentro del rango:" + numeroUno);     
     }
     if ((numeroDos % 2 == 0)&&(100<numeroDos)&&(numeroDos<200)) {
        
         System.out.println("El numero dos es par y se encuentra dentro del rango:" + numeroDos);     
     }
     
     if ((numeroTres % 2 == 0)&&(100<numeroTres)&&(numeroTres<200)) {
        
         System.out.println("El numero tres es par y se encuentra dentro del rango:" + numeroTres);     
     }
    }
    
}
