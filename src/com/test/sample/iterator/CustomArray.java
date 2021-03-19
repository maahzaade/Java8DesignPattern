package com.test.sample.iterator;


import java.util.Iterator;

public class CustomArray implements Iterable<Integer> {


    Integer[] customArray;
    int currentIndex = 0;


    public CustomArray(Integer[] customArray) {
        this.customArray = customArray;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {


            @Override
            public boolean hasNext() {
                return currentIndex+2 < customArray.length && customArray[currentIndex+2] != null;
            }

            @Override
            public Integer next() {
                currentIndex +=2;
                return customArray[currentIndex];
            }

        };
        return it;
    }
}
