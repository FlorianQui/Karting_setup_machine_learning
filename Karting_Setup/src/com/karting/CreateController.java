package com.karting;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

import java.awt.Color;

import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.*;
import java.util.List;

public class CreateController implements Initializable {

    private Stack<Setup> listSetup;

    private MainController mainController;

    @FXML private Pane pane;

    @FXML private Button button_pressure1;
    @FXML private Button button_pressure2;
    @FXML private Button button_pressure3;
    @FXML private Button button_pressure4;
    @FXML private Button button_moteur;
    @FXML private Button button_trainAR;
    @FXML private Button button_carbu;
    @FXML private Button button_trainAV2;
    @FXML private Button button_trainAV1;
    @FXML private Button button_direction;

    @FXML private Button button_submit;

    private FillSetupController pressureController;
    private FillSetupController trainAVController;
    private FillSetupController trainARController;
    private FillSetupController moteurController;
    private FillSetupController carbuController;
    private FillSetupController directionController;

    //region Accesseurs


    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public Button getButton_pressure1() {
        return button_pressure1;
    }

    public void setButton_pressure1(Button button_pressure1) {
        this.button_pressure1 = button_pressure1;
    }

    public Button getButton_pressure2() {
        return button_pressure2;
    }

    public void setButton_pressure2(Button button_pressure2) {
        this.button_pressure2 = button_pressure2;
    }

    public Button getButton_pressure3() {
        return button_pressure3;
    }

    public void setButton_pressure3(Button button_pressure3) {
        this.button_pressure3 = button_pressure3;
    }

    public Button getButton_pressure4() {
        return button_pressure4;
    }

    public void setButton_pressure4(Button button_pressure4) {
        this.button_pressure4 = button_pressure4;
    }

    public Button getButton_moteur() {
        return button_moteur;
    }

    public void setButton_moteur(Button button_moteur) {
        this.button_moteur = button_moteur;
    }

    public Button getButton_trainAR() {
        return button_trainAR;
    }

    public void setButton_trainAR(Button button_trainAR) {
        this.button_trainAR = button_trainAR;
    }

    public Button getButton_carbu() {
        return button_carbu;
    }

    public void setButton_carbu(Button button_carbu) {
        this.button_carbu = button_carbu;
    }

    public Button getButton_trainAV2() {
        return button_trainAV2;
    }

    public void setButton_trainAV2(Button button_trainAV2) {
        this.button_trainAV2 = button_trainAV2;
    }

    public Button getButton_trainAV1() {
        return button_trainAV1;
    }

    public void setButton_trainAV1(Button button_trainAV1) {
        this.button_trainAV1 = button_trainAV1;
    }

    public Button getButton_direction() {
        return button_direction;
    }

    public void setButton_direction(Button button_direction) {
        this.button_direction = button_direction;
    }


    public Button getButton_submit() {
        return button_submit;
    }

    public void setButton_submit(Button button_submit) {
        this.button_submit = button_submit;
    }

    public Stack<Setup> getListSetup() {
        return listSetup;
    }

    public void setListSetup(Stack<Setup> listSetup) {
        this.listSetup = listSetup;
    }

    //endregion

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.listSetup = new Stack<Setup>();
    }

    public void pressure() throws IOException {
        FXMLLoader pressureFill = new FXMLLoader();
        pressureFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox pressure = pressureFill.load();
        this.pressureController = pressureFill.getController();
        pressureController.setHeader_text("PRESSURE");

        pressureController.getContent().getChildren().add(params("AVG"));
        pressureController.getContent().getChildren().add(params("AVD"));
        pressureController.getContent().getChildren().add(params("ARG"));
        pressureController.getContent().getChildren().add(params("ARD"));

        this.getPane().getChildren().add(pressure);
    }

    public void train_AV() throws IOException{
        FXMLLoader trainAVFill = new FXMLLoader();
        trainAVFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox trainAV = trainAVFill.load();
        this.trainAVController = trainAVFill.getController();
        trainAVController.setHeader_text("TRAIN AVANT");

        trainAVController.getContent().getChildren().add(params("HAUTEUR"));
        trainAVController.getContent().getChildren().add(params("LARGEUR"));

        this.getPane().getChildren().add(trainAV);
    }

    public void train_AR() throws IOException{
        FXMLLoader trainARFill = new FXMLLoader();
        trainARFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox trainAR = trainARFill.load();
        this.trainARController = trainARFill.getController();
        trainARController.setHeader_text("TRAIN ARRIERE");

        trainARController.getContent().getChildren().add(params("HAUTEUR"));
        trainARController.getContent().getChildren().add(params("LARGEUR"));

        this.getPane().getChildren().add(trainAR);
    }

    public void moteur() throws IOException{
        FXMLLoader moteurFill = new FXMLLoader();
        moteurFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox moteur = moteurFill.load();
        this.moteurController = moteurFill.getController();
        moteurController.setHeader_text("MOTEUR");

        moteurController.getContent().getChildren().add(params("MARQUE"));
        moteurController.getContent().getChildren().add(params("MODELE"));
        moteurController.getContent().getChildren().add(params("NUM MOTEUR"));
        moteurController.getContent().getChildren().add(params("PIGNON"));
        moteurController.getContent().getChildren().add(params("COURRONNE"));

        this.getPane().getChildren().add(moteur);
    }

    public void carbu() throws IOException{
        FXMLLoader carbuFill = new FXMLLoader();
        carbuFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox carbu = carbuFill.load();
        this.carbuController = carbuFill.getController();
        carbuController.setHeader_text("CARBURATION");

        carbuController.getContent().getChildren().add(params("TYPE AIGUILLE"));
        carbuController.getContent().getChildren().add(params("HAUTEUR AIGUILLE"));
        carbuController.getContent().getChildren().add(params("BOISSEAU"));
        carbuController.getContent().getChildren().add(params("GICLEUR PRINCIPAL"));
        carbuController.getContent().getChildren().add(params("GICLEUR RALENTI"));
        carbuController.getContent().getChildren().add(params("PUIT"));
        carbuController.getContent().getChildren().add(params("EMULSEUR"));

        this.getPane().getChildren().add(carbu);
    }

    public void direction() throws IOException{
        FXMLLoader directionFill = new FXMLLoader();
        directionFill.setLocation(getClass().getResource("FillSetup.fxml"));
        VBox direction = directionFill.load();
        this.directionController = directionFill.getController();
        directionController.setHeader_text("DIRECTION");



        this.getPane().getChildren().add(direction);
    }

    public HBox params(String paramName){
        HBox result = new HBox();

        result.getChildren().add(new Label(paramName));
        result.getChildren().add(new TextField());

        return result;
    }

    public void createSetup() {

        Setup setup = new Setup();
        //region PRESSURE
        double AVG = Double.parseDouble(this.pressureController.getSubmit()[0]);
        double AVD = Double.parseDouble(this.pressureController.getSubmit()[1]);
        double ARG = Double.parseDouble(this.pressureController.getSubmit()[2]);
        double ARD = Double.parseDouble(this.pressureController.getSubmit()[3]);

        setup.getChassis().pression.setAvg(AVG);
        setup.getChassis().pression.setAvd(AVD);
        setup.getChassis().pression.setArg(ARG);
        setup.getChassis().pression.setArd(ARD);
        //endregion

        //region TRAIN AV
        double hauteur = Double.parseDouble(this.trainAVController.getSubmit()[0]);
        double largeur = Double.parseDouble(this.trainAVController.getSubmit()[1]);

        setup.getChassis().getTrain_avant().setHauteur(hauteur);
        setup.getChassis().getTrain_avant().setLargeur(largeur);
        //endregion

        //region TRAIN AR
        hauteur = Double.parseDouble(this.trainARController.getSubmit()[0]);
        largeur = Double.parseDouble(this.trainARController.getSubmit()[1]);

        setup.getChassis().getTrain_arriere().setHauteur(hauteur);
        setup.getChassis().getTrain_arriere().setLargeur(largeur);
        //endregion

        //region MOTEUR
        String marque = this.moteurController.getSubmit()[0];
        String modele = this.moteurController.getSubmit()[1];
        String num_moteur = this.moteurController.getSubmit()[2];
        Double pignon = Double.parseDouble(this.moteurController.getSubmit()[3]);
        Double courronne = Double.parseDouble(this.moteurController.getSubmit()[4]);

        setup.getMoteur().setMarque(marque);
        setup.getMoteur().setModele(modele);
        setup.getMoteur().setMotor_number(num_moteur);
        setup.getMoteur().getTransmission().setPignon(pignon);
        setup.getMoteur().getTransmission().setCourronne(courronne);
        //endregion

        //region CARBU
        String type_aiguille = this.carbuController.getSubmit()[0];
        Double hauteur_aiguille = Double.parseDouble(this.carbuController.getSubmit()[1]);
        String boisseau = this.carbuController.getSubmit()[2];
        Double gicleur_principal = Double.parseDouble(this.carbuController.getSubmit()[3]);
        Double gicleur_ralenti = Double.parseDouble(this.carbuController.getSubmit()[4]);
        String puit = this.carbuController.getSubmit()[5];
        String emulseur = this.carbuController.getSubmit()[6];

        setup.getMoteur().getCarbu().getAiguille().setType(type_aiguille);
        setup.getMoteur().getCarbu().getAiguille().setHauteur(hauteur_aiguille);
        setup.getMoteur().getCarbu().setBoisseau(boisseau);
        setup.getMoteur().getCarbu().getGicleur().setPrincipal(gicleur_principal);
        setup.getMoteur().getCarbu().getGicleur().setRalenti(gicleur_ralenti);
        setup.getMoteur().getCarbu().setPuit(puit);
        setup.getMoteur().getCarbu().setEmulseur(emulseur);
        //endregion

        //region DIRECTION

        //endregion

        System.out.println(setup.toString());

    }

    public void selected(MouseEvent event){
        System.out.println(event.getSource());
        ((Button)(event.getSource())).setStyle("-fx-border-color : #F0591E;");
    }

    public void exited(MouseEvent event){
        ((Button)(event.getSource())).setStyle("-fx-border-color : #F0591E00;");
        ((Button)(event.getSource())).setStyle("-fx-background-color : #F0591E00;");
    }


}
