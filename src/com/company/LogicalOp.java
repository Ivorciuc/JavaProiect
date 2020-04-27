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
}






