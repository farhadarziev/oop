package org.example.assigment7.model;

public class Calculator {
    private double firstOperand = 0;
    private double secondOperand = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public void setOperator(String operator) {
        this.operator = operator;
        startNewNumber = true;
    }

    public void setFirstOperand(double value) {
        this.firstOperand = value;
    }

    public void setSecondOperand(double value) {
        this.secondOperand = value;
    }

    public double calculate() {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("Error you can not divide by zero");
                }
                return firstOperand / secondOperand;
            default:
                return secondOperand;
        }
    }

    public boolean isStartNewNumber() {
        return startNewNumber;
    }

    public void setStartNewNumber(boolean startNewNumber) {
        this.startNewNumber = startNewNumber;
    }
}
