package com.example.csit226.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GeographyQuizController {

    @FXML private AnchorPane panel1;
    @FXML private AnchorPane panel2;
    @FXML private AnchorPane panel3;
    @FXML private AnchorPane panel4;

    @FXML private TextField question1TextField;
    @FXML private TextField question2TextField;
    @FXML private TextField question3TextField;


    @FXML private Label scoreLabel;

    private int score = 0;

    public void initialize(){
        showPanel(panel1);
        updateScore();
    }

    private void showPanel(AnchorPane panel) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);

        panel.setVisible(true);
    }

    private void updateScore() {
        score = 0;

        if (question1TextField.getText().equalsIgnoreCase("Paris")) score++;
        if (question2TextField.getText().equalsIgnoreCase("Tokyo")) score++;
        if (question3TextField.getText().equalsIgnoreCase("Berlin")) score++;

        String text = "Your Score: " + score + "/3";

        scoreLabel.setText(text);
    }

    //NAVIGATION NI FOR DIFFERENT PANELS (CHECK kung naay reference sa fmxl pleaaseee ffs) makalimot nasad ka
    @FXML
    private void nextFrom1() {
        showPanel(panel2);
    }

    @FXML
    private void nextFrom2() {
        showPanel(panel3);
    }
    @FXML
    private void nextFrom3() {
        updateScore();
        showPanel(panel4);
    }
    @FXML
    private void backTo1() {
        showPanel(panel1);
    }
    @FXML
    private void backTo2() {
        showPanel(panel2);
    }
    @FXML
    private void backTo3() {
        showPanel(panel3);
    }


}
