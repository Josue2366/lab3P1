/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_josuerivera;
import java.util.Scanner;
/**
 *
 * @author josue
 */
public class Lab3p1_JosueRivera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. ejercicio(sucesiones y mas sucesiones!)");
        System.out.println("2. ejercicio(pocket monsters)");
        System.out.println("3. ejercicio(Asterisco en casa!)");
        int ejercicio = input.nextInt();
        while (ejercicio < 1 || ejercicio > 3){
            System.out.println("error, opcion incorrecta");
            System.out.println("1. ejercicio(sucesiones y mas sucesiones!)");
            System.out.println("2. ejercicio(pocket monsters)");
            System.out.println("3. ejercicio(Asterisco en casa!)");
            ejercicio = input.nextInt();
        }
        while (ejercicio <4 && ejercicio >0 ){
            switch (ejercicio){
                case 1:{
                    System.out.println("opcion 1");
                    System.out.println("Introduzca la diferencia "
                            + "ente los numeros:");
                    int dif = input.nextInt();
                    System.out.println("Introduzca el numero inicial:");
                    int ini = input.nextInt();
                    System.out.println("cuantos numero desea ver:");
                    int can = input.nextInt();
                    int valor = ini;
                    int dif2 = dif;
                    for (int contador = 1; contador < can; contador++){
                        if (contador ==1){
                            System.out.print(ini+",");
                            valor += dif;
                            dif++;
                            System.out.print(valor);
                        }
                        else{
                            valor += dif;
                            dif++;
                            System.out.print(valor);
                        }
                        if (contador == can -1){
                            System.out.println(" ");
                        }
                        else{
                            System.out.print(",");
                        }
                    }
                    int valor2 = ini;
                    System.out.println("Introduzca numero que desea ver "
                            + "mas adelante en la sucesion");
                    int ade = input.nextInt();
                    while (ade < can){
                        System.out.println("error, el numero ya "
                                + "fue presentado, introduzca otra opcion");
                        ade = input.nextInt();
                    }
                    for (int contador1 =1; contador1 < ade;contador1++){
                        valor2+=dif2;
                        dif2++;
                    }
                    System.out.println("el numero seria:"+valor2);
                    break;
                }
                case 2:{
                    System.out.println("opcion 2");
                    System.out.println("Ingrese el tipo de pelea que desea:");
                    System.out.println("1. hasta la muerte");
                    System.out.println("2. por rondas");
                    int opcion = input.nextInt();
                    
                    break;
                }
                case 3:{
                    System.out.println("opcion 3");
                    System.out.println("introdusca un numero");
                    int numero = input.nextInt();
                    int linea = (numero /2)-1;
                    for (int contador = 1; contador <= numero; contador++){
                        if (contador == 1 || contador == numero){
                            for (int contador2 = 1; contador2 < numero;contador2++){
                                System.out.print("*");
                            }
                        }
                        else{
                            for(int contador3 = 1;contador3 <= numero;contador3++){
                                if (contador3 == linea){
                                    System.out.print("|");
                                }
                                if (contador3 == 1||contador3 == numero-1){
                                    System.out.print("*");
                                }
                                else {
                                    System.out.print(" ");
                                }
                                
                            }
                        }
                        System.out.println(" ");
                       
                    
                    }
                }
             System.out.println("1. ejercicio(sucesiones y mas sucesiones!)");
             System.out.println("2. ejercicio(pocket monsters)");
             System.out.println("3. ejercicio(Asterisco en casa!)");
             System.out.println("4. salir");
             ejercicio = input.nextInt();
            }
        System.out.println("el programa termino");
        
        
        }
    
    }
}
