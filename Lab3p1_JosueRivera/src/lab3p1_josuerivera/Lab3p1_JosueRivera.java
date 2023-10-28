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
                    double syl_vida = 280.0;
                    double syl_ataq = 80.0;
                    double syl_def = 15/100;
                    double gya_vida = 300.0;
                    double gya_ataq = 50.0;
                    double gya_def = 10/100;
                    double gira_vida = 250.0;
                    double gira_ataq = 70.0;
                    double gira_def = 25/100;
                    double drag_vida = 250.0;
                    double drag_ataq = 75.0;
                    double drag_def = 20/100;
                    System.out.println("opcion 2");
                    System.out.println("Ingrese el tipo de pelea que desea:");
                    System.out.println("1. hasta la muerte");
                    System.out.println("2. por rondas");
                    int opcion = input.nextInt();
                    while (opcion <= 0 || opcion > 2){
                        System.out.println("error, introduzca otra vez");
                        opcion = input.nextInt();
                    }
                    System.out.println("estadisticas de los pokemones");
                    System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15&");
                    System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                    System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                    System.out.println("");
                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1. Sylveon vrs Dragonite");
                    System.out.println("2. Gyarados vrs Giratina");
                    System.out.println("3. Dragonite vrs Giratina");
                    System.out.println("4. Giratina vrs Sylveon");
                    int pelea = input.nextInt();
                    while (pelea <= 0 || pelea > 4){
                        System.out.println("Error, introduzca otra vez");
                        pelea= input.nextInt();
                        
                    }
                    switch (opcion){
                        case 1:{
                            switch (pelea){
                                case 1:{
                                    while (syl_vida > 0 || drag_vida > 0){
                                        syl_vida -= drag_ataq-(drag_ataq*syl_def);
                                        if (syl_vida < 0){
                                            syl_vida = 0;
                                            System.out.println("Dragonite gana");
                                            break;
                                        }
                                        drag_vida -= syl_ataq-(syl_ataq*drag_def);
                                        if (drag_vida < 0){
                                            drag_vida = 0;
                                            System.out.println("Sylveon gana");
                                            break;
                                        }
                                        System.out.println("vida de Sylvion"+syl_vida);
                                        System.out.println("vida de dragonite"+drag_vida);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("opcion 3");
                    System.out.println("introdusca un numero");
                    int numero = input.nextInt();
                    int g = (numero/2)+1;
                    for (int contador = 1; contador <= numero; contador++){
                        for(int contador2 = 1; contador2 <= numero;contador2++){
                            if (contador==1||contador==numero){
                                System.out.print("*");
                            }else if (contador2 ==1||contador2 ==numero){
                                System.out.print("*");
                            }else if(contador2 == g){
                                System.out.print("|");
                            }else if (contador2 + contador == numero +1){
                                System.out.print("<");
                            }else{
                                System.out.print(" ");
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
