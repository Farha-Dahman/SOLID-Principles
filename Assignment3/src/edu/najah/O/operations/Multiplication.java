package edu.najah.O.operations;

import edu.najah.O.interf.IMultiplication;

import java.util.ArrayList;

public class Multiplication implements IMultiplication {

    public int findMultiplication(ArrayList<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }
}
