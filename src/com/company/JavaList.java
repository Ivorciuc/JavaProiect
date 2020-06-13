package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaList {

    public void firstList(List<Integer> list) {
        for(int x = 0; x < list.size(); x++){
            System.out.println(list.get(x));
        }
    }

    public void addList(List<Integer> list, int number){
        list.add(number);
    }

    public void firstNumberToList(List<Integer> list, int number){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0, number);
    }

    public void fromTheEnd(List<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int x = list.size() -1; x >= 0; x--){
            System.out.println(list.get(x));
        }
    }

    public void stringList(List<String> list, int number, String om){
        list.add("sarpe");
        list.add("vaca");
        list.add("rata");
        list.add("caine");

        list.add(number, om);
    }

    public void ex6(List<Integer> list, int number){
        list.add(0, number);
    }

    public void ex7(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Pe pozitia 0 este valoarea: " + list.get(0));
        System.out.println("Pe pozitia 1 este valoarea: " + list.get(1));
        System.out.println("Pe pozitia 2 este valoarea: " + list.get(2));
        System.out.println("Pe pozitia 3 este valoarea: " + list.get(3));
        System.out.println("Pe pozitia 3 este valoarea: " + list.get(4));
    }

    public void biggestNumber(List<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("The Largest Number From The List Is: " + Collections.max(list));
    }
}
