package com.company;

public class NumbersStack {
    int[] numbers = new int[20];
    int count = 0;

    public NumbersStack() {
    }

    public int getCount() {
        return count;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        count--;
        return peak();
    }

    public void empty(){
        setNumbers(new int[20]);
        setCount(0);
    }

    public int peak() {
        return numbers[count-1];
    }
}
