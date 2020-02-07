package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(5, 50, false);

        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("Pages Printed: " + printer.getPagesPrinted());

        for (int i = 10; i >= 0; i--) {
            printer.printPage();
        }

        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("Pages Printed: " + printer.getPagesPrinted());
        System.out.println("Filling up the Toner");
        printer.fillToner();

        for (int i = 10; i >= 0; i--) {
            printer.printPage();
        }

        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("Pages Printed: " + printer.getPagesPrinted());
    }
}
