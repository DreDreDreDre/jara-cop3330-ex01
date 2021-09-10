package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String name;
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");

        input.close();

    }
}
