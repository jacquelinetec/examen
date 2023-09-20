/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_u1_u2;

import java.util.Scanner;

/**
 *
 * @author Jacqueline Sarabia
 */
public class examen_u1_u2 {

    public static void main(String[] args) {

        Scanner porcentaje = new Scanner(System.in);
        System.out.println("Ingresa el primer instrumento ");
        String instrumento1 = porcentaje.nextLine();

        System.out.println("Ingresa el segundo instrumento ");
        String instrumento2 = porcentaje.nextLine();

        System.out.println("Ingresa el tercer  instrumento ");
        String instrumento3 = porcentaje.nextLine();

        System.out.println("Ingresa el precio compra del intrumento 1 ");
        Double i1 = porcentaje.nextDouble();

        System.out.println("Ingresa el precio compra del intrumento 2 ");
        Double i2 = porcentaje.nextDouble();

        System.out.println("Ingresa el precio compra del intrumento 3 ");
        Double i3 = porcentaje.nextDouble();
        porcentaje.close();

        double ganancia1 = 1250.45 - i1;
        double ganancia2 = 3743.00 - i2;
        double ganancia3 = 2683.78 - i3;

        double total = (ganancia1 / i1) * 100;
        double tota2 = (ganancia2 / i1) * 100;
        double tota3 = (ganancia3 / i1) * 100;

        System.out.println("La ganacia de " + instrumento1 + "es" + total);
        System.out.println("La ganacia de " + instrumento2 + "es" + tota2);
        System.out.println("La ganacia de " + instrumento3 + "es" + tota3);
    


}
}
