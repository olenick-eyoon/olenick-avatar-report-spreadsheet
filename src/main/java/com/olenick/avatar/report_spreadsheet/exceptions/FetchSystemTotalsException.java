package com.olenick.avatar.report_spreadsheet.exceptions;

/**
 * Fetch System Totals exception.
 */
public class FetchSystemTotalsException extends Exception {
    public FetchSystemTotalsException() {}

    public FetchSystemTotalsException(String message) {
        super(message);
    }

    public FetchSystemTotalsException(String message, Throwable cause) {
        super(message, cause);
    }

    public FetchSystemTotalsException(Throwable cause) {
        super(cause);
    }

    public FetchSystemTotalsException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
