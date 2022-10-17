package edu.najah.O.operations;

import edu.najah.O.interf.IAddition;

import java.util.ArrayList;

public class Addition implements IAddition {
    public int findAddition(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
}
