package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

        public static <list> void main(String[] args) {
                int x = 1;
                int y = 3;
                int z = 5;
                printmyname();

                Calculator cal = new Calculator();
                System.out.println("1.");
                System.out.println(" " + cal.sum(1, 4));

                System.out.println("2.");
                System.out.println(" " + cal.sum((byte)126, 1.5F));

                System.out.println("3.");
                System.out.println(" " + cal.multipli(5, (short) 3));

                System.out.println("4.");
                System.out.println(" " + cal.multipli(55, (byte)9, (short)9));

                System.out.println("5. ");
                System.out.println(" " + cal.division(55, 10));

                System.out.println("6. ");
                System.out.println(" " + cal.division(55, 1, 10));

                System.out.println("7. ");
                System.out.println(" " + cal.numbersAvarage(25, 5));

                System.out.println("8. ");
                System.out.println(" " + cal.numbersAvarage(10, 2));

                System.out.println("9. ");
                System.out.println(" " + cal.restulimpartirii(25, 1.5f));

                System.out.println("10. ");
                System.out.println(" " + cal.restulimpartirii(12, 22));

                System.out.println("\nCelsius:" );
                cal.celsius();

                System.out.println("\nMeters:");
                cal.metri();

                System.out.println("\nDistance:");
                cal.distance();




                LogicalOp log = new LogicalOp();

                System.out.println("\n--DE AICI INCEPE LOGICAL OP--");

                System.out.println("1.");
                int biggest = log.getHigherNumber(1,3);
                System.out.println("  The biggest number is: " + biggest);

                System.out.println("2.");
                String name = "FastTrackIt";
                System.out.println(log.checkIfText(name));

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
                log.oneToOneHunDred(1);

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
                System.out.println(Arrays.toString(log.arrayEven(myArray)));


                System.out.println("\n4.");
                System.out.println(log.arrayAvarage(myArray));

                System.out.println("\n5.");
                System.out.println(log.arrayFind(new String[] {"casa", "masa", "terasa", "plasa"}, "casa"));

                System.out.println("\n6.");
                System.out.println(log.arrayCheckNumber(new int[] {3, 5, 6, 7}, 5));

                System.out.println("\n7.");
                log.drawLines();

                System.out.println("\n8.");
                System.out.println( Arrays.toString(log.removeNrFromArray((new int[] {2, 4, 6, 8}), 6)));



                System.out.println("\n\n-- TEMA JAVA LISTS: -- ");
                JavaList javaList = new JavaList();
                List<Integer> myList = new ArrayList();
                myList.add(1);
                myList.add(2);
                myList.add(3);
                myList.add(4);
                myList.add(5);


                System.out.println("\n1.");
                javaList.firstList(myList);

                System.out.println("\n2.");
                javaList.addList(myList, 7);
                System.out.println(myList);

                System.out.println("\n3.");
                List<Integer> list1 = new ArrayList();
                javaList.firstNumberToList(list1, 8);
                System.out.println(list1);

                System.out.println("\n4.");
                List<Integer> list2 = new ArrayList();
                javaList.fromTheEnd(list2);

                System.out.println("\n5.");
                List<String> list3 = new ArrayList();
                javaList.stringList(list3, 2, "om");
                System.out.println(list3);

                System.out.println("\n6.");
                javaList.ex6(myList, 10);
                System.out.println(myList);

                System.out.println("\n7.");
                List<Integer> list4 = new ArrayList();
                javaList.ex7(list4);

                System.out.println("\n8.");
                List<Integer> list5 = new ArrayList();
                javaList.biggestNumber(list5);























                









































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












