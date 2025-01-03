package com.example.hw4;

abstract class AbstractOperation {
    abstract double operate (int firstNumber, int secondNumber);
}

class AddOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}