package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero entre 0 y 99 y el programa lo mostrara en texto");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número entero dentro del rango 0 y 99");
        //Guardamos en la variable el primer valor
        int num = sc.nextInt();

        String unidades [] = {"cero","uno","dos","tres","cuatro","cinco","seis", "siete", "ocho", "nueve","diez"};
        String especiales [] = {"once","doce","trece","catorce","quince","dieciseis","diecisiete", "dieciocho", "diecinueve"};
        String decenas [] = {"veinte" , "treinta" , "cuarenta" , "cincuenta" , "sesenta" , "setenta" , "ochenta" , "noventa"};

        if (num >= 0 && num<11)
            System.out.println(unidades[num]);
        else if (num<20 && num>10)
            System.out.println('\n' + especiales[num - 11]);
        else if (num<100 && num>19) {
            int unid = num % 10;
            int dec = num / 10;
            if (unid == 0)
                System.out.println(decenas[dec -2]);
            else
                System.out.println(decenas[dec - 2] + " y " + unidades[unid]);
        }
        else
            System.out.println("El número introducido no es correcto");


    }

}
