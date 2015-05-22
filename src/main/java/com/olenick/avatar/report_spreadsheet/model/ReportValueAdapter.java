package com.olenick.avatar.report_spreadsheet.model;

import java.util.EnumMap;

import javax.validation.constraints.NotNull;

import com.olenick.avatar.icare2.model.ReportTab;
import com.olenick.avatar.icare2.model.report_values.ReportValue;

/**
 * ReportValue adapter for Get-System-Report-Values command.
 */
public class ReportValueAdapter {
    private EnumMap<ReportTab, ReportValueExtractor> extractors;

    public ReportValueAdapter() {
        this.extractors = new EnumMap<>(ReportTab.class);
        this.extractors.put(ReportTab.HCAHPS_NATIONAL,
                new HCAHPSNationalValueExtractor());
        this.extractors.put(ReportTab.OVERVIEW, new OverviewValueExtractor());
    }

    /**
     * Should be used for testing purposes only.
     * 
     * @param extractors
     */
    public ReportValueAdapter(
            EnumMap<ReportTab, ReportValueExtractor> extractors) {
        this.extractors = extractors;
    }

    public Number getValue(@NotNull final String itemName,
            @NotNull final ReportValue reportValue) {
        return this.extractors.get(reportValue.getTab()).getValue(itemName,
                reportValue);
    }
}
