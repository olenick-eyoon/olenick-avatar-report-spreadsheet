package com.olenick.avatar.report_spreadsheet.model;

import javax.validation.constraints.NotNull;

import com.olenick.avatar.icare2.model.report_values.OverviewValue;

/**
 * Overview value extractor for Get-System-Report-Values command.
 */
public class OverviewValueExtractor implements
        ReportValueExtractor<OverviewValue> {
    private static final String TOTAL = "Total";

    public Number getValue(@NotNull final String itemName,
            @NotNull final OverviewValue overviewValue) {
        if (TOTAL.equals(itemName)) {
            return overviewValue.getCount();
        } else {
            return overviewValue.getTopBoxPercentage();
        }
    }
}
