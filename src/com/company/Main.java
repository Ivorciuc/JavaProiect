package com.company;

public class Main {


        public static void main(String[] args) {
                int x = 1;
                int y = 3;
                int z = 5;
                printmyname();

                Calculator cal = new Calculator();
                System.out.println("1.");
                System.out.println(" " + cal.add(1, 4));

                System.out.println("2.");
                System.out.println(" " + cal.add((byte)126, 1.5F));

                System.out.println("3.");
                System.out.println(" " + cal.multipli(5, (short) 3));

                System.out.println("4.");
                System.out.println(" " + cal.multipli(55, (byte)9, (short)9));

                System.out.println("5. ");
                System.out.println(" " + cal.division(55, 10));

                System.out.println("6. ");
                System.out.println(" " + cal.division(55, 1, 10));

                System.out.println("7. ");
                System.out.println(" " + cal.medianumerelor(25, 5, 22));

                System.out.println("8. ");
                System.out.println(" " + cal.medianumerelor(10, 2, 2));

                System.out.println("9. ");
                System.out.println(" " + cal.restulimpartirii(25, 1.5f));

                System.out.println("10. ");
                System.out.println(" " + cal.restulimpartirii(12, 22));

                System.out.println("\nCelsius:" );
                cal.Celsius();

                System.out.println("\nMeters:");
                cal.Metri();

                System.out.println("\nDistance:");
                cal.Distance();




                LogicalOp log = new LogicalOp();

                System.out.println("\n--DE AICI INCEPE LOGICAL OP--");

                System.out.println("1.");
                int biggest = log.checkBiggerNumber(1,3);
                System.out.println("  The biggest number is: " + biggest);

                System.out.println("2.");
                String name = "FastTrackIt";
                System.out.println(log.checkiftextisFastTrackIt(name));

                System.out.println("3.");
                String text = "FastTrackIt";

                System.out.println(log.checkiftextisFastTrackItandnumbers(text, x, y));

                System.out.println("4.");
                x = 6;
                System.out.println(log.snow(x));

                System.out.println("5.");
                x = 5;
                System.out.println(log.numberisgreater(x));

                System.out.println("6.");
                log.thisisthenumber();

                System.out.println("7.");
                x = 2;
                System.out.println(log.isNumberEven(x));

                System.out.println("8.");
                x= 19;
                System.out.println(log.isEligibleToVote(x));

                System.out.println("9.");
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
                log.whichOneIsBigger(23,18);

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



                System.out.println("\n-- TEMA JAVA WHILE LOOPS: -- ");
                System.out.println("\n1.");
                log.w1To100();

                System.out.println("\n2.");
                log.w1ToMinus100();

                System.out.println("\n3.");
                log.wBetween();

                System.out.println("\n4.");
                log.wWhichOneIsBigger();

                System.out.println("\n5.");
                log.wEvenNumbers();

                System.out.println("\n6.");
                log.wOddNumbers();

                System.out.println("\n7.");
                log.wTheAvarage();

                System.out.println("\n8.");
                log.wDivide7();

                System.out.println("\n9.");
                log.wfibonacci();

                System.out.println("\n10.");
                log.wCozaLoza();


                System.out.println("\n\n-- TEMA JAVA ARRAYS: -- ");

                System.out.println("\n2.");
                int[] myArray = log.arrayto100();
                log.printArray(myArray);


                System.out.println("\n3.");
                int[] arrayEvenPrint = new int[100];
                log.arrayEven(arrayEvenPrint);


                System.out.println("\n4.");
                System.out.println(log.arrayAvarage(myArray));

                System.out.println("\n5.");

                System.out.println("\n6.");


                System.out.println("\n7.");
                log.pattern();
                









































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












