package dip1;

import dip1.model.Report;
import dip1.model.ReportManager;
import dip1.model.util.DisplayReporter;
import dip1.model.util.PrinterReporter;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager reportManager = new ReportManager(new DisplayReporter());
        reportManager.output(report.getItems());
    }
}
