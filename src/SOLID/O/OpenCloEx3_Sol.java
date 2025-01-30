package SOLID.O;

public class OpenCloEx3_Sol {

   static class  PdfReport implements  ReportGeneration{

        @Override
        public void generateReport() {
            System.out.println("Generating PDF report...");
        }
    }
    static  class ExcelReport implements  ReportGeneration{

        @Override
        public void generateReport() {
            System.out.println("Generating Excel report...");
        }
    }

    public static void main(String[] args) {

        ReportGeneration gen = new PdfReport();

    }
}
interface ReportGeneration{

    void generateReport();
}





