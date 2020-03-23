package layout;

import massageIO.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportLevel, String massage);
}
