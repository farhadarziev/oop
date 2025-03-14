package org.example.assigment7.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import org.example.assigment7.model.Calculator;

public class CalculatorController {
    @FXML
    private Label displayLabel;

    private Calculator model = new Calculator();
    private String currentNumber = "";

    @FXML
    private void handleButtonClick(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();

        if (buttonText.matches("[0-9]")) {
            if (model.isStartNewNumber()) {
                currentNumber = buttonText;
                model.setStartNewNumber(false);
            } else {
                currentNumber += buttonText;
            }
            displayLabel.setText(currentNumber);
        } else if (buttonText.equals(".")) {
            if (!currentNumber.contains(".")) {
                currentNumber += ".";
                displayLabel.setText(currentNumber);
            }
        } else if (buttonText.matches("[+\\-x/]")) {
            model.setFirstOperand(Double.parseDouble(currentNumber));
            model.setOperator(buttonText.equals("x") ? "*" : buttonText);
            model.setStartNewNumber(true);
        } else if (buttonText.equals("=")) {
            model.setSecondOperand(Double.parseDouble(currentNumber));
            try {
                double result = model.calculate();
                displayLabel.setText(String.valueOf(result));
                currentNumber = String.valueOf(result);
                model.setStartNewNumber(true);
            } catch (ArithmeticException e) {
                displayLabel.setText("Error");
                currentNumber = "";
            }
        } else if (buttonText.equals("Clear")) {
            currentNumber = "";
            displayLabel.setText("0");
            model.setFirstOperand(0);
            model.setSecondOperand(0);
            model.setOperator("");
            model.setStartNewNumber(true);
        }
    }
}
