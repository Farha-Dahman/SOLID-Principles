package edu.najah.O;

import edu.najah.O.constant.Operation;
import edu.najah.O.interf.IOperationResult;
import edu.najah.O.operations.*;

import java.util.ArrayList;

public class OperationResult implements IOperationResult {

    public int getOperationResult(Operation operation, ArrayList<Integer> numbers){

        if (operation.equals(Operation.Count)){
            Count count = new Count();
            return count.findCount(numbers);
        }
        if (operation.equals(Operation.Addition)){
            Addition addition = new Addition();
            return addition.findAddition(numbers);
        }

        if (operation.equals(Operation.Multiplication)){
            Multiplication multiplication = new Multiplication();
            return multiplication.findMultiplication(numbers);
        }
        if (operation.equals(Operation.Max)){
            Max max = new Max();
            return max.findMax(numbers);
        }
        if (operation.equals(Operation.Min)){
            Min min = new Min();
            return min.findMin(numbers);
        }
        System.err.println("Invalid operation");
        return -1111111;
    }
}
