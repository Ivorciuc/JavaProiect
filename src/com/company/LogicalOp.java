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

    public void whichIsBigger(int number, int number1) {
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
            System.out.println(total);
        }
    }

    public void theAvarage(int number) {
        float total = 0;
        for (int x = number; x <= 100; x++) {
            total += x;
        }
        float avarage = total / 100;
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
}