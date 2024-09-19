package org.example;

import java.util.Scanner;
/**
 *
 * */
public class Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de casos");
        int casesNum= sc.nextInt();

        while (casesNum>0){
            System.out.println("Introduce el número de pasos totales y los que se pueden recorrer de cada vez");
            int totalSteps=sc.nextInt();
            int stepsOnce=sc.nextInt();

            int minimun=totalSteps/stepsOnce;
            if (minimun<1){

                minimun=1;
            }
            System.out.println(minimun);

            casesNum--;


        }


        }
    }
