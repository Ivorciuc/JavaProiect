package com.company;

public class Lab15{
        public static void main(String[] args){
                Read read = new Read();
                read.intNmb();
                read.doubleNmb();
                read.floatNmb();
                read.longNmb();
                read.arrayPosition();
                read.findlist();


                LogicalOp log = new LogicalOp();
                log.array(new int[]{2, 3, 5, 6, 7}, 2);
                log.waitting(2500);


        }
}

