/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    private final MathFractions math = new MathFractions();
    
     @FXML
    private Button add;

    @FXML
    private Button jButton3;

    @FXML
    private Button jButton2;

    @FXML
    private Button jButton1;

    @FXML
    private Button jButton0;

    @FXML
    private Button abstraction;

    @FXML
    private Button clear;

    @FXML
    private Button jButton9;

    @FXML
    private Button upodiastoli;

    @FXML
    private Button jButton8;

    @FXML
    private Button jButton7;

    @FXML
    private Button jButton6;

    @FXML
    private Button arnitiko;

    @FXML
    private Button jButton5;

    @FXML
    private Button jButton4;

    @FXML
    private TextField calculationScreen;

    @FXML
    private Button equals;

    @FXML
    private Button divide;

    @FXML
    private Button multiply;

    @FXML
    void handleUpodiastoliButtonAction(ActionEvent event) {

    }

    @FXML
    void handleJButton0Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton0.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton0.getText());
        }

    }

    @FXML
    void handleArnitikoButtonAction(ActionEvent event) {
        
         calculationScreen.setText(String.valueOf(math.arnitiko(Double.parseDouble(String.valueOf(calculationScreen.getText())))));
        
    }

    @FXML
    void handleAddButtonAction(ActionEvent event) {
        math.setNum1(Double.parseDouble(calculationScreen.getText()));
        math.setFraction(1);
        calculationScreen.setText("");

    }

    @FXML
    void handleJButton1Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton1.getText());
        } else {
            calculationScreen.setText(calculationScreen.getText()+jButton1.getText());
        }

    }

    @FXML
    void handleJButton2Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton2.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton2.getText());
        }

    }

    @FXML
    void handleJButton3Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton3.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton3.getText());
        }

    }

    @FXML
    void handleAbstractionButtonAction(ActionEvent event) {
         math.setNum1(Double.parseDouble(calculationScreen.getText()));
        calculationScreen.setText("");
         math.setFraction(2);

    }

    @FXML
    void handleJButton4Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton4.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton4.getText());
        }

    }

    @FXML
    void handleJButton5Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton5.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton5.getText());
        }

    }

    @FXML
    void handleJButton6Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton6.getText());
        }
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton6.getText());
        }

    }

    @FXML
    void handleMultiplyButtonAction(ActionEvent event) {
        math.setNum1(Double.parseDouble(calculationScreen.getText()));
        calculationScreen.setText("");
         math.setFraction(3);

    }

    @FXML
    void handleJButton7Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton7.getText());}
        else {
            calculationScreen.setText(calculationScreen.getText()+jButton7.getText());
        }       

    }

    @FXML
    void handleJButton8Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton8.getText());
        } else {
            calculationScreen.setText(calculationScreen.getText()+jButton8.getText());
        }

    }

    @FXML
    void handleJButton9Action(ActionEvent event) {
        if ("0".equals(calculationScreen.getText())){
            calculationScreen.setText("");
            calculationScreen.setText(calculationScreen.getText()+jButton9.getText());
        } else {
            calculationScreen.setText(calculationScreen.getText()+jButton9.getText());
        }

    }

    @FXML
    void handleDivideButtonAction(ActionEvent event) {
        math.setNum1(Double.parseDouble(calculationScreen.getText()));
        calculationScreen.setText("");
         math.setFraction(3);        

    }

    @FXML
    void handleEqualsButtonAction(ActionEvent event) {
        math.setNum2(Double.parseDouble(calculationScreen.getText()));
        switch (math.getFraction()){
            case 1: math.add();
            break;
            case 2: math.abstraction();
            break;
            case 3: math.multiply();
            break;
            case 4: math.division();
            break;
            default: break;
        }
            calculationScreen.setText(Double.toString(math.getSum()));

    }

    @FXML
    void handleClearButtonAction(ActionEvent event) {
        calculationScreen.setText("0");

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
