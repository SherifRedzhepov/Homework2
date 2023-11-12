package org.example;

import java.util.Scanner;

public class ReplaceString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "My name is David";
        System.out.println(name);//print name before change

        System.out.println("Please insert your name");
        String userName = scanner.nextLine();//Learning name by console

        String fixName = name.replace("David" , userName);//replace David in string name with name by console

        System.out.println(fixName);// Print changed name David with name by console.

    }
}