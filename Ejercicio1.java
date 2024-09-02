
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Ingrese una palabra: ");
            String entrada = sc.nextLine();
            
          
            String palabraLimpia = "";
            for (char c : entrada.toLowerCase().toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    palabraLimpia += c;
                }
            }
            
            
            String palabraInversa = "";
            for (int i = palabraLimpia.length() - 1; i >= 0; i--) {
                palabraInversa += palabraLimpia.charAt(i);
            }
            
            if (palabraLimpia.equals(palabraInversa)) {
                System.out.println("Es un palíndromo, waowaoao");
            } else {
                System.out.println("Me decepcionas, Eso no es un palindromo");
            }
            
            System.out.println("Quieres intentar otra vez?");
            String respuesta = sc.nextLine();
            
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }        
    }
}
// El fernando no sabe de codigos, muejejeje

	
