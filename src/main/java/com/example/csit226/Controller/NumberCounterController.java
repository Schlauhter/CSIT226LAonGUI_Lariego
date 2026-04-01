package com.example.csit226.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NumberCounterController {

    @FXML
    private Button increaseButton;
    @FXML
    private Button decreaseButton;
    @FXML
    private Label countLabel;
    private int count = 0;

    public void initialize() {

        increaseButton.setId("increaseButton");
        decreaseButton.setId("decreaseButton");
        countLabel.setId("countLabel");

        increaseButton.setOnAction(e -> increaseLabel());
        decreaseButton.setOnAction(e -> decreaseLabel());

    }

    private void decreaseLabel() {
        count--;
        countLabel.setText(String.valueOf(count));
    }

    private void increaseLabel(){
        count++;
        countLabel.setText(String.valueOf(count));
    }
}
