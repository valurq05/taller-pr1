
import java.util.Scanner;


public class Ejercicio20 {

   
    public static void main(String[] args) {
       
float divisorUno;
float dividendoUno;
float divisorDos;
float dividendoDos;
float cocienteUno;
float cocienteDos;

Scanner leer = new Scanner(System.in);

        System.out.println("Porfavor ingrese el divisor de su primera fracción");
        divisorUno = leer.nextFloat();
        System.out.println("Porfavor ingrese el dividendo de su primera fracción");
        dividendoUno = leer.nextFloat();
        System.out.println("Porfavor ingrese el divisor de su segunda fracción");
        divisorDos = leer.nextFloat();
        System.out.println("Porfavor ingrese el dividendo de su segunda fracción");
        dividendoDos = leer.nextFloat();
        
       cocienteUno = divisorUno / dividendoUno;
       cocienteDos = divisorDos / dividendoDos;
       
        if (cocienteUno == cocienteDos) {
            
            System.out.println("Sus fracciones son equivalentes");
            
        }else{
        
            if (cocienteUno != cocienteDos ) {
                
                System.out.println("Sus fracciones no son equivalentes");
                
            }
        }
        
    }
    
}
