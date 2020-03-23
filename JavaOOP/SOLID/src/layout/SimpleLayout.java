package layout;

import massageIO.ReportLevel;

public class SimpleLayout implements Layout {

    @Override
    public String format(String date, ReportLevel reportLevel, String massage) {
        return String.format("%s - %s - %s",date,reportLevel.toString(),massage);
    }
}
