package SOLID.I;

public class ISPEx1_Sol {
}
interface Printable {
    void print(String document);
}

interface Scannable {
    void scan(String document);
}

class MultiFunctionPrinter1 implements Printable, Scannable {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}

class OldPrinter1 implements Printable {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
    // No need to implement scan
}

 class ISPExample {
    public static void main(String[] args) {
        Printable printer = new OldPrinter1();
        printer.print("Old Document");

        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print("MultiFunction Document");
        multiPrinter.scan("MultiFunction Document");
    }
}
