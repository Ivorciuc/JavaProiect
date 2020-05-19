package com.company;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (1 > 3) {
            return first;
        } else {
            return second;
        }
    }

    public String checkiftextisFastTrackIt(String name) {
        if (name.equals("FastTrackIt")) {
            return "  Learning text comparison.";
        } else {
            return "  Go to try some more.";
        }
    }

    public String checkiftextisFastTrackItandnumbers(String text, int x, int y) {
        if (text.equals("FastTrackIt") && x <= y) {
            return "  " + text + x;
        } else if (x >= y) {
            return "  " + x + text;
        } else {
            return "  Mai incearca";
        }
    }

    public String snow(int x) {
        if (x > 8) {
            return "  The amount of snow this winter was " + x;
        } else if (x == 6) {
            return "  The amount of snow this winter was " + x;
        } else {
            return "  The forecast snow is " + x;
        }
    }

    public String numberisgreater(int x) {
        if (x > 4) {
            return "  The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "  The number is equal to 4.";
        } else if (x < 3) {
            return "  The number is lower than 3.";
        } else {
            return "  Mission accomplished.";
        }
    }

    public void thisisthenumber() {
        int Number = 3;
        switch (Number) {
            case 1:
                System.out.println("  The number is: 1");
                break;
            case 2:
                System.out.println("  The number is: 2");
                break;
            case 3:
                System.out.println("  The number is: 3");
                break;
            case 4:
                System.out.println("  The number is: 4");
                break;

        }
    }

    public Boolean isNumberEven(int x) {
        if ((x % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public Boolean isEligibleToVote(int x) {
        if (x >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int threeNumbers(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && x > z) {
            return y;
        } else {
            return z;
        }
    }

    public void OneToOneHunDred(int number) {
        for (int x = number; x <= 100; x++) {
            System.out.println(x);
        }
    }


    public void oneToMinusOneHundred(int number) {
        for (int x = number; x >= -100; x--) {
            System.out.println(x);
        }
    }

    public void oneToTen(int number, int number1) {
        for (int x = number; x <= number1; x++) {
            System.out.println(x);
        }
    }

    public void whichOneIsBigger(int number, int number1) {
        if (number < number1) {
            for (int x = number; x <= number1; x++) {
                System.out.println(x);
            }
        } else {
            for (int y = number1; y <= number; y++) {
                System.out.println(y);
            }
        }
    }

    public void evenNumbers(int number) {
        for (int x = number; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    public void oddNumbers(int number) {
        for (int x = number; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    public void allOneHundred(int number) {
        int total = 0;
        for (int x = number; x <= 100; x++) {
            total += x;
        }System.out.println(total);
    }

    public void theAvarage(int number) {
        float total = 0;
        for (int x = number; x <= 100; x++) {
            total += x;

        }float avarage = total / 100;
        System.out.println(avarage);


    }

    public void pattern(int number) {
        for (int x = number; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void w1To100(){
        int x = 1;
        while ( x <= 100){
            System.out.println(x);
            x++;
        }
    }

    public void w1ToMinus100(){
        int x = 0;
        while ( x >= -100){
            System.out.println(x);
            x--;
        }
    }

    public void wBetween(){
        int x = 1;
        int y = 9;
        while ( x <= y){
            System.out.println(x);
            x++;
        }
    }

    public void wWhichOneIsBigger(){
        int x = 100;
        int y = 23;
        if ( x > y){
            while ( y <= x){
                System.out.println(y);
                y++;
            }
        }else{
            while ( x <= y){
                System.out.println(x);
                x++;
            }
        }
    }

    public void wEvenNumbers(){
        int x = 1;
        while ( x <= 100){

            if (x % 2 == 0){

                System.out.println(x);
            }x++;
        }
    }

    public void wOddNumbers(){
        int x = 1;
        while ( x <= 100){

            if (x % 2 != 0){

                System.out.println(x);
            }x++;
        }
    }

    public void wTheAvarage(){
        float total = 0;
        int x = 111;
        int y = 8898;
        while( x <= y){
            x++;
            total += x;
        }float  average = total / 8787;
        System.out.println(average);
    }

    public void wDivide7(){
        float total = 0;
        int x = 7;
        int y = 200;
        while (x <= y ){
            x++;
            total += x;
            if (x % 7 == 0){
            }
        }float avarage = total / 193;
        System.out.println(avarage);
    }

    public void wfibonacci(){
        int total = 20;
        int n1 = 0;
        int n2 = 1;
        int x = 1;
        while (x <= total){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            x++;
            System.out.println(n1 + "");
        }
    }

    public void wCozaLoza() {
        int x = 1;
        while (x <= 110) {
            if ((x % 3 == 0) && (x % 5 == 0) && (x % 7 == 0)) {
                System.out.print("CozaLozaWoza");
            } else if ((x % 7 == 0) && (x % 5 == 0)) {
                System.out.print("WozaLoza");
            } else if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.print("CozaLoza");
            } else if ((x % 3 == 0) && (x % 7 == 0)) {
                System.out.print("CozaWoza");
            } else if (x % 5 == 0) {
                System.out.print("Loza");
            } else if (x % 7 == 0) {
                System.out.print("Woza");
            } else if (x % 3 == 0) {
                System.out.print("Coza");
            } else {
                System.out.print(x +"");
            }
            x++;
            if (x % 11 == 0) {
                System.out.println();
            }

        }
    }


    public int[] arrayto100(){
        int[] array = new int[100];
        for (int x = 0; x < 100; x++){
            array[x] = x+1;
        }
        return array;
    }

    public void printArray(int[] array){
        for (int x = 0; x < array.length; x++){
            System.out.println(array[x]);
        }
    }

    public int[] arrayEven(int[] arrayEvenPrint){
        int[] array = new int[100];
        for (int x = 0; x < 100; x++){
            if(x % 2 == 0){
                System.out.println(x);
            }
        }
        return array;
    }

    public float arrayAvarage(int[] arrayAvarage){
        float sum = 0;
        for (int x = 0; x < arrayAvarage.length; x++){
            sum += arrayAvarage[x];
        }
       return  sum / arrayAvarage.length;
    }

    public boolean arrayFind(String[] array, String object) {
        for (String line : array){
            if(object.equals(line)){
                return true;
            }
        }
        return false;
    }

    public int[] arrayCheckNumber(int[] check, int number ){
        int[] array = new int[3];
        for (int rule : check){
            if(number == rule){
                return new int[]{array[2]};
            }
        }
        return new int[]{0};
    }

    public void pattern (){
        String[] mystring = new String[10];
        for ( int x = 0; x < mystring.length; x++){
            System.out.println("-----------");
        }
    }





}















