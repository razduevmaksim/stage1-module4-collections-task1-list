package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 1; i <= sourceList.size(); i++){
            if (i%3 == 0) {
                resultList.add(sourceList.get(i-1));
                resultList.add(sourceList.get(i-1));
            }
        }

        return resultList;
    }
}
