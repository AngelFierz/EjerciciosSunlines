/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Propietario
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejercicio2 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listaNumeros = new ArrayList<>();

        int sumaTotal = 0;
        int cantidadPares = 0;
        int cantidadPrimos = 0;

        // Generar la lista de 10 números al azar
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100) + 1; // Números entre 1 y 100
            listaNumeros.add(numero);
            sumaTotal += numero;

            // Verificar si es par
            if (numero % 2 == 0) {
                cantidadPares++;
            }

            // Verificar si es primo
            if (esPrimo(numero)) {
                cantidadPrimos++;
            }
        }

        // Determinar el número mayor y menor
        int numeroMayor = listaNumeros.get(0);
        int numeroMenor = listaNumeros.get(0);
        
        for (int numero : listaNumeros) {
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }


        double promedio = sumaTotal / (double) listaNumeros.size();

        // Mostrar resultados en consola
        System.out.println("Lista de números generados: " + listaNumeros);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de números primos: " + cantidadPrimos);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Número mayor: " + numeroMayor);
        System.out.println("Número menor: " + numeroMenor);
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
