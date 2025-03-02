package org.example.assigment6;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    @FXML
    private Label bmiLabel;
    @FXML
    private Label statusLabel;
    @FXML
    private MenuItem exitMenuItem;
    @FXML
    private MenuItem clearMenuItem;
    @FXML
    private MenuItem helpMenuItem;
    @FXML
    private void selectAllText() {
        heightField.selectAll();
    }

    @FXML
    private void initialize() {
        exitMenuItem.setOnAction(e -> Platform.exit());
        clearMenuItem.setOnAction(e -> clearFields());
        helpMenuItem.setOnAction(e -> showHelp());
    }

    @FXML
    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (weight <= 0 || height <= 0) {
                bmiLabel.setText("Invalid input");
                statusLabel.setText("");
                return;
            }

            double bmi = weight / (height * height);
            bmiLabel.setText(String.format("BMI: %.2f", bmi));
            statusLabel.setText(getBMIStatus(bmi));

        } catch (NumberFormatException e) {
            bmiLabel.setText("Enter valid numbers");
            statusLabel.setText("");
        }
    }

    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    private void clearFields() {
        weightField.clear();
        heightField.clear();
        bmiLabel.setText("BMI: ");
        statusLabel.setText("");
    }

    private void showHelp() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("How to Use");
        alert.setHeaderText("BMI Calculator Instructions");
        alert.setContentText("Enter your weight (kg) and height (m), then press 'Calculate BMI'.");
        alert.showAndWait();
    }
}