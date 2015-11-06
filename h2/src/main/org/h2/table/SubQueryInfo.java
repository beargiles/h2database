/*
 * Copyright 2004-2014 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */

package org.h2.table;

import org.h2.result.SortOrder;

/**
 * Information about current sub-query being prepared.
 * 
 * @author Sergi Vladykin
 */
public class SubQueryInfo {

    private int[] masks;
    private TableFilter[] filters;
    private int filter;
    private SortOrder sortOrder;
    private boolean preliminary;

    /**
     * @param masks index conditions masks
     * @param filters table filters
     * @param filter current filter
     * @param sortOrder sort order
     * @param preliminary if this is a preliminary query optimization 
     *          without global conditions
     */
    public SubQueryInfo(int[] masks, TableFilter[] filters, int filter, 
            SortOrder sortOrder, boolean preliminary) {
        this.masks = masks;
        this.filters = filters;
        this.filter = filter;
        this.sortOrder = sortOrder;
        this.preliminary = preliminary;
    }

    public int[] getMasks() {
        return masks;
    }

    public TableFilter[] getFilters() {
        return filters;
    }

    public int getFilter() {
        return filter;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public boolean isPreliminary() {
        return preliminary;
    }
}
