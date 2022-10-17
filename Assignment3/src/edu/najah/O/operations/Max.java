package edu.najah.O.operations;

import edu.najah.O.interf.IMax;

import java.util.ArrayList;

public class Max implements IMax{
    public int findMax(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}
