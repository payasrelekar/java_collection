package com.seed.library.utility;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {

    List<T> records = new ArrayList<>();

    public void addRecords(T b) {
        this.records.add(b);
    }

    public List<T> getRecords() {
        return records;
    }

    public int getNoOfRecords() {
        return records.size();
    }
}
