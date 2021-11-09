package com.example.calculator.method;

import java.util.ArrayList;

public class TimesTableCalculator {

    public ArrayList<Integer> timesTable (int x) {
        ArrayList<Integer> table = new ArrayList<>();
        for ( int i = 1; i <= 10; i++) {
            int multiplication;
            multiplication = x * i;
            table.add(multiplication);
        }
        return table;
    }
}
