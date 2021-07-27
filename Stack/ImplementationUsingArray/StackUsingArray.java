package ImplementationUsingArray;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackUsingArray {
    
    private int[] array;
    private int topIndex;

    public StackUsingArray() {
        array = new int[10];
        topIndex = -1;
    }

    private void DoubleCapacity() {
        int[] newArray = new int[array.length*2];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void push(int data) {
        if(topIndex == array.length-1){ 
            DoubleCapacity();
        }
        array[++topIndex] = data;
    }

    public int pop() {
        if(topIndex == -1)
            throw new EmptyStackException();
        return array[topIndex--];
    }

    public boolean isEmpty() {
        // if(topIndex == -1) return true;
        // return false;
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public int peek() {
        if(topIndex == -1) throw new EmptyStackException();
        return array[topIndex];
    }

    @Override
    public String toString() {
        var s = Arrays.copyOfRange(array, 0, topIndex);
        return Arrays.toString(s);
    }

}