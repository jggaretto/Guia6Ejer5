/*
Escribir un programa en Java que juegue con el usuario a adivinar un número.
La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor
que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e
imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si
el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo
por pantalla. En este último caso también se debe contar el carácter fallido como un
intento.
 */
package guia6ejer5;

import java.util.Random;
import java.util.Scanner;


public class Guia6Ejer5 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinar el número!");

        while (true) {
            System.out.print("Introduce un número entre 1 y 500: ");

            try {
                String input = scanner.nextLine();
                int numeroUsuario = Integer.parseInt(input);
                intentos++;

                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("¡Felicitaciones! Has adivinado el número.");
                    System.out.println("Número de intentos: " + intentos);
                    break;
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
                intentos++;
            }
        }

        scanner.close();
    }
}
