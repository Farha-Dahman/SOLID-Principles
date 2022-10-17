package edu.najah.O;


import edu.najah.O.constant.Operation;
import edu.najah.O.interf.IOperationResult;
import edu.najah.O.operations.*;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> numbers = null;

    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }
    private IOperationResult operationResult;

    public int getOperationResult(Operation operation){
        return operationResult.getOperationResult(operation, numbers);
    }
}