package EJEM;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Tienda {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de docenas compradas:");
        int cantidadDocenas = scanner.nextInt();
        
        double precioPorDocena = 10; // Precio por docena
        
        double montoCompra = cantidadDocenas * precioPorDocena;
        double montoDescuento;
        
        // switch mejorado
        switch (cantidadDocenas) {
            case 1, 2, 3 -> montoDescuento = montoCompra * 0.10; // Descuento del 10% para 1, 2 o 3 docenas
            default -> {
                montoDescuento = montoCompra * 0.15; 
                
                // Calcular unidades de obsequio por cada docena en exceso sobre 3
                int docenasExtras = cantidadDocenas - 3;
                int unidadesObsequio = docenasExtras * 12; 
                System.out.println("Usted recibirá " + unidadesObsequio + " unidades de obsequio.");
            }
        }
        
        double montoTotal = montoCompra - montoDescuento;
        
        String tienda = """
        
                   BOLETA ELECTRÓNICA 
        ...........................................
             CANT. DOCENAS     %d       TOTAL     
        ...........................................
        
               Monto de la compra:  %d docenas x S/. %.2f = S/. %.2f
              Monto del descuento:  %.2f%% de descuento = S/. %.2f
                    Monto a pagar:  S/. %.2f
                       
                       """.formatted(cantidadDocenas, cantidadDocenas, precioPorDocena, montoCompra, (montoDescuento * 100) / montoCompra, montoDescuento, montoTotal);
        
        System.out.println(tienda);
    }
}