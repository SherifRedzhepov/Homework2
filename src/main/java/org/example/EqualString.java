package org.example;

import java.util.Scanner;

public class EqualString {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Please enter car model: ");
        String firstCarModel = scaner.nextLine();//enter car model

        System.out.println("Please again enter some car model: ");
        String secondCarModel = scaner.nextLine();//again enter some car model

        System.out.print("Your cars are the same model : ");
        System.out.println(firstCarModel.equals(secondCarModel)); // print true or false


    }
}
