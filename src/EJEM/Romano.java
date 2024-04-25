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
public class Romano {
    public static void main(String[] args){
        int numero,unidad,decena,tipoLetra;
        String romanoD,romanoU,resultado;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingresa un numero (1-50)");
        numero=lector.nextInt();
        
        if(numero>=1 && numero<=50){
            
            System.out.println("El resultado en mayuscula (1) o minuscula (2)");
            tipoLetra=lector.nextInt();
            
            unidad=numero%10;
            decena=numero/10;
            
            romanoD=switch(decena){
                case 0->"";
                case 1->"X";
                case 2->"XX";
                case 3->"XXX";
                case 4->"XL";
                case 5->"L";
                default->"Error";    
            };
                    
            romanoU=switch(unidad){
                case 0->"";
                case 1->"I";
                case 2->"II";
                case 3->"III";
                case 4->"IV";
                case 5->"V";
                case 6->"VI";
                case 7->"VII";
                case 8->"VIII";
                case 9->"IX";    
                default->"Error";   
            };    
                 
            resultado=romanoD+romanoU;        
            
            String resultadoFinal= tipoLetra==1 ? resultado.toUpperCase(): resultado.toLowerCase();
            
            System.out.println(resultadoFinal);
            
            
            
        }else{
            System.out.println("NUMERO INCORRECTO");
        }
    }
}

