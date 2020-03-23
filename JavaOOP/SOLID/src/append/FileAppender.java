package append;

import layout.File;
import layout.Layout;
import logger.LogFile;
import massageIO.ReportLevel;

public class FileAppender extends ConsoleAppender {
    private File file;
    private static int count = 0;

    public FileAppender(ReportLevel reportLevel,Layout layout) {
        super(reportLevel, layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String text = String.format("%s - %s - %s",date,reportLevel.toString(),message);
        this.file.write(text);
        count++;
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
                .append(count)
                .append(", File size: ")
                .append(this.file.getSize());
        return sb.toString();
    }
}
