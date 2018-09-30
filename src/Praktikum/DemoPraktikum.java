/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DemoPraktikum {
    public static double Akar(double a, double b, double c)throws UjiDemoPraktikum{
        double A = 0;
        A=b*b-4*a*c;
        if (A<0){
            throw new UjiDemoPraktikum("A < A, Akar-akarnya Bil.persamaan, di rubah ke bil.kompleks\n");
            
        }
        double x1 = (-b+Math.sqrt(A))/2*a;
        double x2 = (-b-Math.sqrt(A))/2*a;
        System.out.printf("\tPersamaan kuadrat : %.ofX +(%.of)X2 +(%.if)",a,b,c);
        System.out.printf("\n\tAkar - Akar Persamaanya :\n\tX1 = %.1f v x2 = %.1f",a,x1,x2);
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.printf("\tInput Nilai a = ");a=input.nextDouble();
        System.out.printf("\tInput Nilai b = ");b=input.nextDouble();
        System.out.printf("\tInput Nilai c = ");c=input.nextDouble();
        double A = 0;
        A=b*b-4*a*c;
        try{
            System.out.printf("\t"+Akar(a,b,c));
        }catch(UjiDemoPraktikum ine){
            double e;
            e=Math.abs(A);
            System.out.printf("\n\tPersamaan Kuadrat : %ofX + (%.of)X2 +(%.if)\n",a,b,c);
            System.out.printf("\n\tAkar-Akar Persamaan (Bil.komplek) :\n\n\t\tX1 = "+(-b)+" + "+(Math.sqrt(e)/2)*a+"j V X2 = "+(-b)+" - "+(Math.sqrt(e)/2)*a+"j");
            System.out.println("\n\t------------------------------------------------------\n");
            ine.printStackTrace();
        }
    }
}