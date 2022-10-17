package edu.najah.O.operations;

import edu.najah.O.interf.IMin;

import java.util.ArrayList;

public class Min implements IMin {

    public int findMin(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}
