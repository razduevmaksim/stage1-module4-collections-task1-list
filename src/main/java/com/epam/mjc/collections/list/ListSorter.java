package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int resultA = (5 * num1 * num1) + 3;
        int resultB = (5 * num2 * num2) + 3;

        if (resultA == resultB) return Integer.compare(num1, num2);
        else return Integer.compare(resultA, resultB);
    }
}
