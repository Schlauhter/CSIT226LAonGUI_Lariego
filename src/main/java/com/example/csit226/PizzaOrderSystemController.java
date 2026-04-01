package com.example.csit226;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PizzaOrderSystemController {

    @FXML
    private ChoiceBox<String> pizzaSizeChoice;
    @FXML
    private ChoiceBox<String> pizzaToppingsChoice;
    @FXML
    private ChoiceBox<String> extraCheeseChoice;
    @FXML
    private Button calculateButton;
    @FXML
    private Label totalLabel;


    public void initialize() {

        pizzaSizeChoice.setId("pizzaSizeChoice");
        pizzaToppingsChoice.setId("pizzaToppingsChoice");
        extraCheeseChoice.setId("extraCheeseChoice");
        calculateButton.setId("calculateButton");
        totalLabel.setId("totalLabel");

        pizzaSizeChoice.getItems().addAll("Small", "Medium", "Large");
        pizzaToppingsChoice.getItems().addAll("Mushroom", "Pepperoni", "Onions");
        extraCheeseChoice.getItems().addAll("Yes" , "No");

        pizzaSizeChoice.setValue("Select option...");
        pizzaToppingsChoice.setValue("Select option...");
        extraCheeseChoice.setValue("Select option...");

        calculateButton.setOnAction(e -> calculateTotal());



    }


    private void calculateTotal() {
        int total = 0;

        String size = pizzaSizeChoice.getValue();
        switch (size) {
            case "Small" -> total += 10;
            case "Medium" -> total += 15;
            case "Large" -> total += 20;
        }

        if (!"Select topping...".equals(pizzaToppingsChoice.getValue())) {
            total += 2;
        }


        if ("Yes".equals(extraCheeseChoice.getValue())) {
            total += 3;
        }

        totalLabel.setText("Total: $" + total);
    }

}
