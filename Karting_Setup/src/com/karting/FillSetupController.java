package com.karting;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class FillSetupController implements Initializable {

    private String[] submit;

    @FXML private VBox root;

    @FXML private Label header_text;
    @FXML private Button header_exit;
    @FXML private VBox content;
    @FXML private Button button_submit;

    //region Accesseurs

    public VBox getRoot() {
        return root;
    }

    public void setRoot(VBox root) {
        this.root = root;
    }

    public Label getHeader_text() {
        return header_text;
    }

    public void setHeader_text(String header_text) {
        this.header_text.setText(header_text);
    }

    public Button getHeader_exit() {
        return header_exit;
    }

    public void setHeader_exit(Button header_exit) {
        this.header_exit = header_exit;
    }

    public VBox getContent() {
        return content;
    }

    public void setContent(VBox content) {
        this.content = content;
    }

    public String[] getSubmit() {
        return submit;
    }

    public void setSubmit(String[] submit) {
        this.submit = submit;
    }

    //endregion

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.setSubmit(new String[20]);
    }

    public void exit(){
        this.getRoot().setVisible(false);
    }
    
    public void submit(){
        for (int i = 0 ; i < this.getContent().getChildren().size(); i++) {
            HBox hBox = (HBox) (this.getContent().getChildren().get(i));
            String text = ((TextField)(hBox.getChildren().get(1))).getText();

            this.submit[i] = text;

            //System.out.println(this.submit[i]);
        }

        this.exit();
    }
}
