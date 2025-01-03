package com.example.step4;
import java.util.Scanner;

abstract class AbstractOperation{
    abstract double operate(int firstNumber, int secondNumber);
}


class Calculator{
    private AbstractOperation operation;
    public Calculator(){
        this.operation = null;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }

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
        return firstNumber + secondNumber;
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



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        if(inputArray.length == 3){
            String operator = inputArray[1];

            int firstNumber = Integer.parseInt(inputArray[0]);
            int secondNumber = Integer.parseInt(inputArray[2]);

            Calculator calculator = new Calculator();

            switch(operator){
                case "+":
                    calculator.setOperation(new AddOperation()); break;
                case "-":
                    calculator.setOperation(new SubstractOperation()); break;
                case "*":
                    calculator.setOperation(new MultiplyOperation()); break;
                case "/":
                    if(secondNumber == 0){
                        System.out.println("[오류] 0으로 나눌 수 없음");
                    }
                    calculator.setOperation(new DivideOperation()); break;
                default:
                    System.out.println("[오류] 유효하지 않은 연산자");
            }
            System.out.println(calculator.calculate(firstNumber, secondNumber));

        } else {
            System.out.println("유효하지 않은 입력: \"숫자1 연산자 숫자2\" 형태로 입력해주세요");
        }
        scanner.close();
    }
}

