package com.olenick.avatar.report_spreadsheet;

import com.olenick.avatar.report_spreadsheet.command.GetSystemReportValuesCommand;

/**
 * Main.
 */
public class Main {
    private static final int ERROR_IN_ARGUMENTS = -1;

    private static void printUsage(String errorMessage, int returnValue) {
        System.err.println(errorMessage);
        System.err.println();
        System.err
                .println("Usage: java -jar {THIS_JAR_NAME.jar} {SPEC_CSV_FILENAME} {EXCEL_FILENAME}");
        System.err.println();
        System.err
                .println("  E.g.: java -jar avatar.jar specs.csv report.xlsx");
        System.exit(returnValue);
    }

    public static void main(String[] args) throws Exception {
        // TODO: Clean this mental stuff up.
        if (args.length < 1 || args[0] == null) {
            printUsage("No arguments provided.", ERROR_IN_ARGUMENTS);
        }

        if (args[0].toLowerCase().endsWith(".csv")) {
            if (args.length < 2 || args[1] == null) {
                printUsage("No Excel filename provided.", ERROR_IN_ARGUMENTS);
            } else if (args.length > 2) {
                printUsage("Too many arguments.", ERROR_IN_ARGUMENTS);
            }
            new GetSystemReportValuesCommand(args[0], args[1]).execute();
        } else {
            printUsage("Unexpected argument" + (args.length > 1 ? "s" : "")
                    + ".", ERROR_IN_ARGUMENTS);
        }
    }
}
