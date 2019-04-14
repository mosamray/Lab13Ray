/*
Project: Lab 13
Purpose Details: Java Exception
Course: IST 242
Author: Mosam Ray
Date Developed: 4/12/19
Last Date Changed: 4/11/19
Rev: 2
 */


package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab13Ray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean inputError = true;
        int intInput = 0;
        float floatInput = 0.0f;
        String StringInput = "";
        Pattern str = Pattern.compile(("[a-zA-Z]+"));
        int[] Arraylist = new int[3];
        String fileName = "";

        do {
            try {
                System.out.println("Input an integer: ");
                intInput = in.nextInt();
                inputError = false;
            } catch (InputMismatchException e) {
                System.out.println("The program does not recognize the number as an integer, be sure you are not typing in a float or alpha character. Please try again.");
                in.nextLine();
            }
        }

        while (inputError);
        System.out.println("Result: " + intInput);
        inputError = true;
        do {
            try {
                System.out.println("Input a Float: ");
                StringInput = in.nextLine();
                Matcher m = str.matcher(StringInput);
                if (m.find() && StringInput.matches("[a-zA-Z]+")) {
                    inputError = false;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("The program does not recognize the number as an integer, be sure you are not typing in a float or alpha character. Please try again.");
            }
        }
        while (inputError);
        System.out.println("Result: " + intInput);
        inputError = true;
        do {
            try {
                System.out.println("Input a string: ");
                StringInput = in.nextLine();
                Matcher m = str.matcher(StringInput);
                if (m.find() && StringInput.matches("[a-zA-Z]+")) {
                    inputError = false;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Do not enter more than 3 integers or a alpha character. Please try again.");
            }
        }
        while (inputError);
        System.out.println("String: " + StringInput);
        inputError = true;

        do {
            System.out.println("Input the integers: ");
            StringTokenizer st = new StringTokenizer(in.nextLine());
            int counter = 0;
            int[] intArrayInput = new int[0];
            while (st.hasMoreTokens()) {
                try {
                    intArrayInput = new int[0];
                    intArrayInput[counter] = Integer.parseInt(st.nextToken());
                    counter++;
                    inputError = false;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter only three integers.");
                    st = new StringTokenizer(in.nextLine());
                    counter = 0;
                }
            }
        }
        while (inputError);
        System.out.println("The integers ");
        for (int I = 0; I < I++; ) {
            System.out.println(in + "");
        }
        System.out.println();
        inputError = true;
        do {
            try {
                System.out.println("Input a file name:");
                fileName = in.nextLine();
                if (fileName.matches("[a-zA-Z]+"))
                    throw new Exception();
                else {
                    inputError = false;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

                    System.out.println("Input invalid. There are some characters that can be used in a file name.");
                    System.out.println("Invalid characters are: " + "Please try again.");
                }
                while (inputError);
                System.out.println("File name: " + fileName);
        }
    }

















