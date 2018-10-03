package com.company;

public class NumbersStackTest {
    public static void main(String[] args) {
//        NumbersStack numbersStack = new NumbersStack();
//        if (numbersStack.getCount() == 0) {
//            System.out.println("success");
//        } else {
//            System.out.println("failed");
//        }

//        NumbersStack numbersStack = new NumbersStack();
//        if (numbersStack.getCount() == 0) {
//            System.out.println("success");
//        } else {
//            System.out.println("failed");
//        }
//        numbersStack.push(10);
//        if (numbersStack.getCount() == 1) {
//            System.out.println("success");
//        } else {
//            System.out.println("failed");
//        }

//        NumbersStack numbersStack = new NumbersStack();
////        testThat(numbersStack.getCount() == 0);
////        numbersStack.push(10);
////        testThat (numbersStack.getCount() == 1);
////        numbersStack.push(20);
////        testThat (numbersStack.getCount() == 2);

//        NumbersStack numbersStack = new NumbersStack();
//        testThat(numbersStack.getCount() == 0);
//        numbersStack.push(10);
//        testThat(numbersStack.getCount() == 1);
//        numbersStack.push(20);
//        testThat(numbersStack.getCount() == 2);
//        testThat(numbersStack.pop() == 20);

//        NumbersStack numbersStack = new NumbersStack();
//        testThat(numbersStack.getCount() == 0);
//        numbersStack.push(10);
//        testThat(numbersStack.getCount() == 1);
//        numbersStack.push(20);
//        testThat(numbersStack.getCount() == 2);
//        testThat(numbersStack.pop() == 20);
//        testThat(numbersStack.pop() == 10);

        NumbersStack numbersStack = new NumbersStack();
        numbersStack.push(10);
        numbersStack.push(20);
        numbersStack.push(30);
        testThat(numbersStack.getCount() == 3);
        numbersStack.pop();
        testThat(numbersStack.getCount() == 2);
        testThat(numbersStack.peak() == 20);
        numbersStack.empty();
        testThat(numbersStack.getCount() == 0);
    }

    public static void testThat(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
