/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJEM;

import java.util.Scanner;

/**
 *
 * @author Nando
 */
public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saldo inicial
        double saldo = 1000.0;

        // Menú de opciones
        System.out.printf("Bienvenido al Cajero Rápido \n"
         + "Su saldo actual es: S/. 1000.0\n"
         + "[1]. Depósito\n"
         + "[2]. Retiro\n"
         + "[3]. Salir\nIngrese el número de la opción deseada: ");

        // Leer la opción del usuario
        int opcion = scanner.nextInt();

        // Procesar la opción del usuario
        switch (opcion) {
            case 1 -> {
                // Depósito
                System.out.println("Ingrese el monto a depositar:");
                double montoDeposito = scanner.nextDouble();
                if (montoDeposito > 0) {
                    saldo += montoDeposito;
                    System.out.println("Depósito exitoso. Su nuevo saldo es: S/. " + saldo);
                } else {
                    System.out.println("El monto a depositar debe ser mayor que cero.");
                }
            }
            case 2 -> {
                // Retiro
                System.out.println("Ingrese el monto a retirar:");
                double montoRetiro = scanner.nextDouble();
                if (montoRetiro > 0 && montoRetiro <= saldo) {
                    saldo -= montoRetiro;
                    System.out.println("Retiro exitoso. Su nuevo saldo es: S/. " + saldo);
                } else if (montoRetiro > saldo) {
                    System.out.println("Fondos insuficientes.");
                } else {
                    System.out.println("El monto a retirar debe ser mayor que cero.");
                }
            }
            case 3 -> {
                // Salir
                System.out.println("Gracias por utilizar el Cajero Rápido.");
            }
            default -> System.out.println("Opción inválida. Por favor ingrese una opción válida.");
        }
    }
}  
