package com.example.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){

        String[] array = { "Please","let ","me","take","a","walk","outside"};
        System.out.println("First array:");

        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        int count = array.length;
        String temp;

        for (int i = 0; i < count/2; i++) {
            temp = array[count-i-1];
            array[count-i-1] = array[i];
            array[i] = temp;
        }

        System.out.println("\nThe resulting array:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n----------------------------------------");

        double sum_ar1=0;
        double sum_ar2=0;
        double[] array1 = new double[5];
        double[] array2 = new double[5];
        System.out.print("\nFirst array: ");
        for(int i=0;i<array1.length;i++) {
            array1[i] = (double) Math.floor((Math.random() * 6)*100)/100;
            System.out.print(array1[i] + " ");
            sum_ar1+= array1[i];
        }
        System.out.print("\nThe average mean of array1 is "+ (Math.floor((sum_ar1/5)*100)/100) +"\n\n");

        System.out.print("Second array: ");
        for(int i=0;i<array2.length;i++) {
            array2[i] = (double) Math.floor((Math.random() * 6)*100)/100;
            System.out.print(array2[i] + " ");
            sum_ar2+= array2[i];
        }
        System.out.print("\nThe average mean of array2 is "+ (Math.floor((sum_ar2/5)*100)/100));

        System.out.println("\n----------------------------------------");

        ArrayList<String> employees= new ArrayList<String>();
        employees.add("Uliana");
        employees.add("Mariana");
        employees.add("Rostuslav");
        employees.add("Igor");
        employees.add("Semen");
        employees.add("Natalia");

        System.out.printf("\nCompany employees to downsizing\n", employees.size());
        for(String person : employees){
            System.out.println(person);
        }
        employees.remove("Igor");
        employees.remove("Rostuslav");

        System.out.printf("\nCompany employees after downsizing\n", employees.size());
        for(String person : employees){
            System.out.println(person);
        }

    }
}
