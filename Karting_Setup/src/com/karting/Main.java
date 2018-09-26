package com.karting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Setup setup;

    private Stage primaryStage;
    private GridPane root;

    private MainController mainController;

    public void InitRoot() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Main.fxml"));
        this.setRoot(loader.load());
        this.setMainController(loader.getController());
        Scene scene = new Scene(getRoot());
        getPrimaryStage().setScene(scene);
        getPrimaryStage().show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.setPrimaryStage(primaryStage);
        this.getPrimaryStage().setTitle("Karting UI");

        InitRoot();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Setup getSetup() {
        return setup;
    }

    public void setSetup(Setup setup) {
        this.setup = setup;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public GridPane getRoot() {
        return root;
    }

    public void setRoot(GridPane root) {
        this.root = root;
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
