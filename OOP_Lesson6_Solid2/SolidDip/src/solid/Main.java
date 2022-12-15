package solid;

import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.SaveToFile;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        iPrint reportPrint = new PrintReport();
        reportPrint.output(report.getItems());
        iPrint file= new SaveToFile();
        file.output(report.getItems());
    
    }
}
