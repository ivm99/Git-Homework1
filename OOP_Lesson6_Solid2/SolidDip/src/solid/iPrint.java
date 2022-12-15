package solid;

import java.util.List;

import solid.dip.ReportItem;

public interface iPrint {
    public void output (List<ReportItem> items);
}
