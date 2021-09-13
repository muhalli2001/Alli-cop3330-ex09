package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        //length input
        Scanner length = new Scanner(System.in);
        System.out.println("What is the length of your room in feet?");
        String Length = length.nextLine();
        int LENGTH = Integer.parseInt(Length);
        //width input
        Scanner width = new Scanner(System.in);
        System.out.println("What is the width of your room in feet?");
        String Width = width.nextLine();
        int WIDTH = Integer.parseInt(Width);

        int areaf = LENGTH * WIDTH; //area in sq feet

        System.out.println("The area is: "+areaf);

        double converter = (350); //gallons -> paint cans

        double paintcans = Math.ceil(areaf/converter);

        System.out.println("you need "+paintcans+" paintcans");


    }

}
