package com.company;

public class Calculator {
    public int add(int x, int y) {
        int rezultat = x + y;
        return rezultat;
    }

    public float add(byte x, float y) {
        float rezultat = x + y;
        return rezultat;
    }

    public int multipli( int y, short z){
        int rezultat = y * z;
        return rezultat;
    }

    public int multipli(int x, byte y, short z) {
        int rezultat = (x * y) * z;
        return rezultat;
    }

    public int division(int x, int y) {
        int rezultat = x / y;
        return rezultat;
    }

    public float division(int x, float y, float z) {
        float rezultat = x / y / z;
        return rezultat;
    }

    public double medianumerelor(int x, int y, int z) {
        int Calcul = x + y + z;
        double Media = Calcul / 3;
        return Media;
    }

    public double medianumerelor(int x, short y, short z) {
        int Calcul = x + y + z;
        double Media = Calcul / 3;
        return Media;
    }

    public  float restulimpartirii(int x, float y) {
        float Calcul = x % y;
        return Calcul;
    }

    public  int restulimpartirii(short x, short y) {
        int Calcul = x % y;
        return Calcul;
    }

    public void celsius() {
        double x = 5;
        double y = 9;
        double z = 32;
        double F = 33.8f;
        double Celsius = x / y * (F - z);
        System.out.println("  Fahrenheit: " + F);
        System.out.println("  Celsius: " + Celsius);
    }

    public  void metri() {
        // 1 Inch = 0.0254 Metri
        double Inch = 1;
        double UnMetru;
        UnMetru = Inch / 39.370;

        System.out.println("  Un inch in Metri este: " + UnMetru);
    }

        public  void distance () {
            double DistantaInMetri = 100000;
            double TimpulInSecunde = 4 * 60 * 60;
            double MetriPeSecunda;
            double KmPeOra;
            double MilePeOra;

            MetriPeSecunda = DistantaInMetri / TimpulInSecunde;
            KmPeOra = (DistantaInMetri / 1000) / (TimpulInSecunde / 60) / 60;
            MilePeOra = ((DistantaInMetri / 1000) * 1.609) / ((TimpulInSecunde / 60) / 60);

            System.out.println("  Distanta in metri pe sencunda este: " + MetriPeSecunda);
            System.out.println("  Distanta in km pe ora este: " + KmPeOra);
            System.out.println("  Distanta in MilePeOra este: " + MilePeOra);

        }

}

