package readerWriter;

import utils.LogHelper;

public class writer implements Runnable {
    private final Database db;

    public writer(Database db) {
        this.db = db;
    }

    @Override
    public void run() {
        LogHelper.printThreadLog("write:");
        this.db.writeDataSet( 10, 20, 30);
        LogHelper.printThreadLog("finished");

    }
}
