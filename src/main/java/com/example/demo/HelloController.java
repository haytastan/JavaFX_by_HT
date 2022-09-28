package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText1;
    @FXML
    private Label welcomeText2;

    @FXML
    protected void onHelloButtonClick1() {
        welcomeText1.setText("Welcome to JavaFX Windows Application, Hayati TASTAN!");
    }
    @FXML
    protected void onHelloButtonClick2() {
        welcomeText2.setText("Welcome to JavaFX Windows Application, Hayati TASTAN!");
    }

}
