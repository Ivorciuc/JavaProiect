package com.company;

public class Main {


        public static void main(String[] args) {
                System.out.println("1.");
                printMyName();
                printInt();
                printInt1();
                printInt2();
                printInt3();
                printInt4();
                printInt5();
                System.out.println("2.");
                System.out.println("  Rezultatul adunarii este: " + adunare(2, (short) 3));
                System.out.println("  Rezultatul impartirii este: " + impartire());
                System.out.println("  Rezultatul scaderii este: " + scadere());
                System.out.println("  Rezultatul inmultirii este: " + inmultire());
                System.out.println("3.");
                JavaPaint();
                System.out.println("4.");
                numere();
                System.out.println("5.");
                JavaPaint1();
                System.out.println("6.");
                numere1();
                System.out.println("7.");
                numere2();
                System.out.println("8.");
                numere3();
                System.out.println("9.");
                numere4();






        }


        public static void printMyName() {
                System.out.println("  Hello \n  Adrian");
        }

        public static void printInt() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                int rezultat = MyInt + MyShort;
                long MyLong = 15;
                double MyDouble = 2.33;
                System.out.println("  " + rezultat);


        }

        public static void printInt1() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                long MyLong = 15;
                double MyDouble = 2.33;
                float rezultat1 = MyByte / MyFloat;

                System.out.println("  " + rezultat1);
        }

        public static void printInt2() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                long MyLong = 15;
                double MyDouble = 2.33;

                MyInt = 8;
                MyByte = -5;
                MyShort = 6;

                float rezultat2 = MyByte + MyInt * MyShort;
                System.out.println("  " + + rezultat2);
        }

        public static void printInt3() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                long MyLong = 15;
                double MyDouble = 2.33;


                MyInt = 55;
                MyByte = 9;
                MyShort = 9;

                float rezultat3 = (MyInt + MyByte) % MyShort;
                System.out.println("  " + rezultat3);
        }

        public static void printInt4() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                long MyLong = 15;
                double MyDouble = 2.33;


                MyInt = 20;
                MyByte = -3;
                MyShort = 5;
                MyFloat = 8F;

                float rezultat4 = MyInt + MyByte * MyShort / MyFloat;
                System.out.println("  " + rezultat4);
        }

        public static void printInt5() {
                int MyInt = 100;
                byte MyByte = 125;
                short MyShort = 10;
                float MyFloat = 1.5F;
                long MyLong = 15;
                double MyDouble = 2.33;
                MyInt = 5;
                MyByte = 15;
                MyShort = 3;
                MyFloat = 2F;
                MyLong = 8;
                MyDouble = 3;

                float rezultat5 = (float) (MyInt + MyByte / MyShort * MyFloat - MyLong % MyDouble);

                System.out.println("  " + rezultat5);
        }


        public static int adunare(int primulNumar, short alDoileaNumar) {

                int rezultat = 100 + 10;
                return rezultat;
        }

        public static float impartire() {


                int rezultat1 = 100 / 25;
                return rezultat1;


        }

        public static int scadere() {


                int rezultat2 = 100 - 30;
                return rezultat2;
        }

        public static int inmultire() {


                int rezultat3 = 100 * 30;
                return rezultat3;
        }

        public static void JavaPaint() {

                System.out.println("     J         a        v     v       a");
                System.out.println("     J        a a        v   v       a a");
                System.out.println("  J  J       aaaaa        v v       aaaaa");
                System.out.println("   JJ       a     a        v       a     a");
        }

        public static void numere() {
                int x = 25;
                int y = 5;
                int z = 22;
                int Calcul = x + y + z;
                double Media = Calcul / 3;
                System.out.println("  Media Numerelor este: " +Media);

        }

        public static void JavaPaint1(){
                System.out.println("   +'''''''''+ ");
                System.out.println("  [|  o   o  |]");
                System.out.println("   |    ^    |");
                System.out.println("   |  ' _ '  |");
                System.out.println("   +---------+");

        }
        public static void numere1() {
                int x = 21;
                int y = 5;
                int Calcul = x % y;
                System.out.println("  Restul impartirii a doua numere este: " + Calcul);
        }
        public static void numere2(){
                 double x = 5;
                 double y = 9;
                 double z = 32;
                 double F = 33.8f;
                 double Celsius = x/y * (F - z);
                 System.out.println("  Fahrenheit: " + F );
                 System.out.println("  Celsius: " + Celsius);
        }
        public static void numere3(){
                // 1 Inch = 0.0254 Metri
                        double Inch = 1;
                        double UnMetru;
                        UnMetru = Inch/39.370;

                        System.out.println("  Un inch in Metri este: " + UnMetru);
        }
        public static void numere4(){
                double DistantaInMetri = 100000;
                double TimpulInSecunde = 4*60*60;
                double MetriPeSecunda;
                double KmPeOra;
                double MilePeOra;

                MetriPeSecunda = DistantaInMetri / TimpulInSecunde;
                KmPeOra = (DistantaInMetri/1000) / (TimpulInSecunde/60) / 60;
                MilePeOra = ((DistantaInMetri/1000)*1.609) / ((TimpulInSecunde/60)/60);

                System.out.println("  Distanta in metri pe sencunda este: " + MetriPeSecunda);
                System.out.println("  Distanta in km pe ora este: " + KmPeOra);
                System.out.println("  Distanta in MilePeOra este: " + MilePeOra);


        }







}












