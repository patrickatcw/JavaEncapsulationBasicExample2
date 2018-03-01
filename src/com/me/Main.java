package com.me;
//directions
/*
- create a class and demonstrate proper encapsulation techniques
- the class will be called printer, it will simulate a real computer printer
- it should have fields for the toner level, number of pages printed,
and also whether it's a duplex printer(capable of printing on both sides of the paper)
- add methods to fill up the toner (up to a max. of 100%), and another
method to simulate printing a page (which should increase the number
of pages printed)
- decide on the scope, whether to use constructors, and anything else you think
is needed (remember scope is determining when the code is compiled, order)
 */

public class Main {

    public static void main(String[] args) {

        //step 9 from step 8 in Printer class
        //step 10, creating instance
        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " +
                printer.getPagesPrinted());

        //step 11 instance for pagesPrinted
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total" +
                " print count for printer = " + printer.getPagesPrinted());

        //step 12 run....
        //results
        /*
        initial page count = 0
        Printing in duplex mode  //boolean true
        Pages printed was 2 new total print count for printer = 2
        */

        //step 13 testing again
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total" +
                " print count for printer = " + printer.getPagesPrinted());
        //step 14 then run....
        //results;
        /*
        initial page count = 0
        Printing in duplex mode
        Pages printed was 2 new total print count for printer = 2
        Printing in duplex mode
        Pages printed was 1 new total print count for printer = 3
         */

        //step 15 change true to false for a test to see what happens?

    }
}

