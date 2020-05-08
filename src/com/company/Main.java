package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {


        public static void main(String[] args) {

                printmyname();
                int x = 1;
                int y = 3;
                int z = 5;
                Calculator cal = new Calculator();

                System.out.println("1.");
                cal.printInt();
                cal.printInt1();
                cal.printInt2();
                cal.printInt3();
                cal.printInt4();
                cal.printInt5();


                System.out.println("2.");
                System.out.println("  " + cal.adunare());
                System.out.println("  " + cal.impartire());
                System.out.println("  " + cal.scadere());
                System.out.println("  " + cal.inmultire());

                System.out.println("3.");
                cal.medianumerelor();
                cal.restulimpartirii();
                cal.Celsius();
                cal.Metri();
                cal.Distanta();


                LogicalOp log = new LogicalOp();

                System.out.println("4.");
                int biggest = log.checkBiggerNumber(1,3);
                System.out.println("  The biggest number is: " + biggest);

                System.out.println("5.");
                String name = "FastTrackIt";
                System.out.println(log.checkiftextisFastTrackIt(name));

                System.out.println("6.");
                String text = "FastTrackIt";

                System.out.println(log.checkiftextisFastTrackItandnumbers(text, x, y));

                System.out.println("7.");
                x = 6;
                System.out.println(log.snow(x));

                System.out.println("8.");
                x = 5;
                System.out.println(log.numberisgreater(x));

                System.out.println("9.");
                log.thisisthenumber();

                System.out.println("10.");
                x = 2;
                System.out.println(log.isNumberEven(x));

                System.out.println("11.");
                x= 19;
                System.out.println(log.isEligibleToVote(x));

                System.out.println("12.");
                x= 3;
                y= 2;
                z= 5;
                System.out.println(log.threeNumbers(x, y, z));


                System.out.println("\n-- TEMA JAVA FOR LOOPS: -- ");

                System.out.println("\n1." );
                log.OneToOneHunDred(1);

                System.out.println("\n2.");
                log.oneToMinusOneHundred(0);

                System.out.println("\n3.");
                log.oneToTen(1, 50);

                System.out.println("\n4.");
                log.whichIsBigger(23,18);

                System.out.println("\n5.");
                log.evenNumbers(1);

                System.out.println("\n6.");
                log.oddNumbers(1);

                System.out.println("\n7.");
                log.allOneHundred(1);

                System.out.println("\n8.");
                log.theAvarage(1);

                System.out.println("\n9.");
                log.pattern(7);























        }
                public static void printmyname() {
                System.out.println("Hello \nAdrian \n");
        }


                public static void JavaPaint () {

                        System.out.println("     J         a        v     v       a");
                        System.out.println("     J        a a        v   v       a a");
                        System.out.println("  J  J       aaaaa        v v       aaaaa");
                        System.out.println("   JJ       a     a        v       a     a");
                }


                public static void JavaPaint1 () {
                        System.out.println("   +'''''''''+ ");
                        System.out.println("  [|  o   o  |]");
                        System.out.println("   |    ^    |");
                        System.out.println("   |  ' _ '  |");
                        System.out.println("   +---------+");


        }




}












