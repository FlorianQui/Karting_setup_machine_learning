package com.karting;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class DisplaySetupController implements Initializable {

    @FXML private Button button_expand;
    @FXML private VBox content;

    private boolean isExpanded;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        isExpanded = false;
    }

    public void expand(){
        if (isExpanded){
            this.content.setDisable(false);
        }
        else{
            this.content.setDisable(true);
        }
        isExpanded = !isExpanded;
    }
}
