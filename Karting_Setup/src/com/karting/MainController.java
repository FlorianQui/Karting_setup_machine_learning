package com.karting;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Setup setup;

    @FXML private GridPane root;
    @FXML private HBox side_bar;
    @FXML private Pane content;
    @FXML private Button button_home;
    @FXML private Button button_create_setup;
    @FXML private Button button_list_setup;

    //region Accesseurs

    public GridPane getRoot() {
        return root;
    }

    public void setRoot(GridPane root) {
        this.root = root;
    }

    public HBox getSide_bar() {
        return side_bar;
    }

    public void setSide_bar(HBox side_bar) {
        this.side_bar = side_bar;
    }

    public Pane getContent() {
        return content;
    }

    public void setContent(Pane content) {
        this.content = content;
    }

    public Button getButton_home() {
        return button_home;
    }

    public void setButton_home(Button button_home) {
        this.button_home = button_home;
    }

    public Button getButton_create_setup() {
        return button_create_setup;
    }

    public void setButton_create_setup(Button button_create_setup) {
        this.button_create_setup = button_create_setup;
    }

    public Button getButton_list_setup() {
        return button_list_setup;
    }

    public void setButton_list_setup(Button button_list_setup) {
        this.button_list_setup = button_list_setup;
    }

    public Setup getSetup() {
        return setup;
    }

    public void setSetup(Setup setup) {
        this.setup = setup;
    }

    //endregion

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void home()
    {
        System.out.println("MOVE TO HOME");
    }

    public void create_setup() throws IOException {

        this.getContent().getChildren().clear();
        System.out.println("MOVE TO CREATE SETUP");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Create.fxml"));

        Pane create_setup = (Pane) loader.load();

        this.getContent().getChildren().add(create_setup);
    }

    public void list_setup(){
        this.getContent().getChildren().clear();
        System.out.println("MOVE TO LIST SETUP");
    }


}
