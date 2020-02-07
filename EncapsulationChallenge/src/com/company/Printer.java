package com.company;

public class Printer {
    private double tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(double tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        if (pagesPrinted >= 0 ) {
            this.pagesPrinted = pagesPrinted;
        }

        this.duplex = duplex;
    }

    public void fillToner() {
        tonerLevel = 100;
    }

    public void printPage() {

        if (tonerLevel <= 0) {
            System.out.println("Out of Ink!");
        } else {
            pagesPrinted += 1;
            tonerLevel -= 1;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
