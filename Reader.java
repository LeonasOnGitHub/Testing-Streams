package readerWriter;

import utils.LogHelper;

public class Reader implements Runnable{
    private final Database db;

    public Reader(Database db) {
        this.db = db;
    }

    @Override
    public void run() {
        DataSet reult= this.db.readDataSet();
        StringBuilder sb = new StringBuilder();
        sb.append(" \nread a:");
        sb.append(reult.a);
        sb.append("\nread b:");
        sb.append(reult.b);
        sb.append("\nread c:");
        sb.append(reult.c);

        LogHelper.printThreadLog(sb.toString());
    }
}
