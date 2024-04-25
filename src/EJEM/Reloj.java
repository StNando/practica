package EJEM;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese horas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese segundos: ");
        int segundos = scanner.nextInt();

        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            System.out.printf("La hora después de un segundo será: %d:%02d:%02d%n", horas, minutos, segundos);
        } else {
            System.out.println("Error: La hora ingresada es incorrecta.");
        }
    }
}