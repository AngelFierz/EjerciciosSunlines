/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Propietario
 */
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
//YOU SHOULD LOVE YOURSELF, NOW!!!!!!!!
        while (continuar) {

            System.out.println("No es el SAT e");
            System.out.print("ingrese su apellido paterno: ");
            String apellido1 = scanner.nextLine().trim();

            System.out.print("ingrese su apellido materno: ");
            String apellido2 = scanner.nextLine().trim();

            System.out.print("Por favor, ingrese su nombre: ");
            String nombre = scanner.nextLine().trim();

           
            System.out.print("Ingrese el año de nacimiento: ");
            String year = scanner.nextLine().trim();

            System.out.print("Ingrese el mes de nacimiento: ");
            String month = scanner.nextLine().trim();

            System.out.print("Ingrese el día de nacimiento: ");
            String day = scanner.nextLine().trim();

            // jajaja, kfc
            String parteApellido1 = apellido1.substring(0, 2).toUpperCase();
            String parteApellido2 = apellido2.substring(0, 1).toUpperCase();
            String parteNombre = nombre.substring(0, 1).toUpperCase();
            String parteAnio = year.substring(year.length() - 2);
            String parteMes = (month.length() == 1 ? "0" + month : month);
            String parteDia = (day.length() == 1 ? "0" + day : day);

            String rfc = parteApellido1 + parteApellido2 + parteNombre + parteAnio + parteMes + parteDia;

            System.out.println("\nEl RFC es: " + rfc);

            
            System.out.print("\n¿Desea generar otro RFC? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals("n")) {
             System.out.print("Jo tio, tan aburrido esta el codigo?");
                continuar = false;
            }
        }
    }
}
