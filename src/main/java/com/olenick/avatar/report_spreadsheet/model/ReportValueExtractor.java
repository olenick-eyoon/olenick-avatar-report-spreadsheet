package com.olenick.avatar.report_spreadsheet.model;

import javax.validation.constraints.NotNull;

import com.olenick.avatar.icare2.model.report_values.ReportValue;

/**
 * Report value extractor for Get-System-Report-Values command.
 */
public interface ReportValueExtractor<T extends ReportValue> {
    public Number getValue(@NotNull final String itemName,
            @NotNull final T overviewValue);
}
