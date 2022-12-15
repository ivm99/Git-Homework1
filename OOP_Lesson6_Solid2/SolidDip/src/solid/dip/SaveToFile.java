package solid.dip;

import java.util.List;

import solid.iPrint;

public class SaveToFile implements iPrint{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Save to file");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
    
}
