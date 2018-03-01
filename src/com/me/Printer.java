package com.me;
//step 1 make printer class
public class Printer {

    //step 2 making the fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //step 3 create constructor only for tonerLevel and
    // boolean (use control button to tag through menu)
    //duplex is printing on both sides
    public Printer(int tonerLevel, boolean duplex) {
        //step 5 if else statement, (validation)
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        //step 4 set pagesPrinted ourselves because we set value
        this.pagesPrinted = 0;
    }

    //step 6 add method for addToner, not void b/c returning something
    //understand this!!!
    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    //step 7 add method for number of pages to print
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    //step 8 add getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

}

//now go to main step 9
