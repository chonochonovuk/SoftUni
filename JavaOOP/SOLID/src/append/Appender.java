package append;

import massageIO.ReportLevel;

public interface Appender {
   void append(String date, ReportLevel reportLevel, String message);
   ReportLevel getReportLevel();
}
