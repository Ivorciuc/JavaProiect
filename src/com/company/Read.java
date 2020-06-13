package com.company;

import java.util.*;

public class Read {

    public int intNmb() {
        boolean rep = true;
        int number = 0;
        do {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your number here: " );
                number = scanner.nextInt();
                rep = false;
            } catch (InputMismatchException error){
                System.out.println("Incorrect value entered, you should try again!");
            }
        } while ( rep == true);
            return number;
    }

    public double doubleNmb() {
        boolean rep = true;
        double number = 0;
        do {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your number here:");
                number = scanner.nextDouble();
                rep = false;
            } catch (InputMismatchException error){
                System.out.println("Incorrect value entered, you should try again!");
            }
        } while ( rep == true);
        return number;
    }

    public float floatNmb() {
        boolean rep = true;
        float number = 0f;
        do {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your number here:");
                number = scanner.nextFloat();
                rep = false;
            } catch (InputMismatchException error){
                System.out.println("Incorrect value entered, you should try again!");
            }
        } while ( rep == true);
        return number;
    }

    public long longNmb() {
        boolean rep = true;
        long number = 0;
        do {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your number here:");
                number = scanner.nextLong();
                rep = false;
            } catch (InputMismatchException error){
                System.out.println("Incorrect value entered, you should try again!");
            }
        } while ( rep == true);
        return number;
    }

    public int arrayPosition(){
        Scanner scanner = new Scanner(System.in);
        try{
            int[] array = new int[]{1, 2, 3, 5};
            System.out.println("Enter your position here:");
            System.out.println("The value is: " + array[scanner.nextInt()]);

        } catch (IndexOutOfBoundsException error){
            System.out.println("Incorrect position!");
        } catch (InputMismatchException error){
            System.out.println("Incorrect value!");
        }

        return arrayPosition();
    }

    public void findlist(){
        Scanner scanner = new Scanner(System.in);
        try {
            List<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(3);
            list.add(4);
            System.out.println("Enter your position:");
            System.out.println(list.get(scanner.nextInt()));
        } catch (InputMismatchException error){
            System.out.println("The reading has stopped.");
        }
    }



}





