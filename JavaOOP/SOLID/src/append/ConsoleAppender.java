package append;

import layout.Layout;
import massageIO.ReportLevel;

public class ConsoleAppender implements Appender {
    protected Layout layout;
    protected ReportLevel reportLevel;
    private static int count = 0;

    public ConsoleAppender(ReportLevel reportLevel, Layout layout) {
        this.reportLevel = reportLevel;
        this.layout = layout;
    }

    public ConsoleAppender(Layout layout){
        this(ReportLevel.INFO,layout);
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        System.out.println(layout.format(date, reportLevel, message));
        count++;
    }

    public ReportLevel getReportLevel() {
        return reportLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appender type: ");
        sb.append(this.getClass().getSimpleName())
                .append(", Layout type: ")
                .append(this.layout.getClass().getSimpleName())
                .append(", Report level: ")
                .append(this.getReportLevel().toString())
                .append(", Messages appended: ")
                .append(count);
        return sb.toString();
    }
}
