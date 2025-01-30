package SOLID.I;

public class ISPEx1_Problem {
}
interface Printer {
    void print(String document);
    void scan(String document);
}

class MultiFunctionPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}

class OldPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        // Old printers can't scan, but they are forced to implement this method
        throw new UnsupportedOperationException("Scan not supported!");
    }
}
