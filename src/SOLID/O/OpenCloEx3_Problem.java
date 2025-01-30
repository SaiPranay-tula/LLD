package SOLID.O;

public class OpenCloEx3_Problem {
}
class ReportGenerator {
    public void generateReport(String type) {
        if (type.equals("PDF")) {
            System.out.println("Generating PDF report...");
        } else if (type.equals("Excel")) {
            System.out.println("Generating Excel report...");
        }
    }
}

