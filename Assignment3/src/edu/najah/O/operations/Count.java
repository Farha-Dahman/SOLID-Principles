package edu.najah.O.operations;

import edu.najah.O.interf.ICount;

import java.util.ArrayList;

public class Count implements ICount {

    public int findCount(ArrayList<Integer> numbers) {
        return numbers.size();

    }

}
