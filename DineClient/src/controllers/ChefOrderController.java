/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import tblmodl.Ordertbl;

/**
 * FXML Controller class
 *
 * @author dimesha
 */
public class ChefOrderController implements Initializable {

    @FXML
    private Label lbldate;
    @FXML
    private Label Lbllastordid;
    @FXML
    private Label lbltime;
    @FXML
    private Label lblchefname;
    @FXML
    private TableView<Ordertbl> tblsubmit;
    @FXML
    private JFXButton btnord1;
    @FXML
    private JFXButton btnord2;
    @FXML
    private JFXButton btnord3;
    @FXML
    private JFXButton btnord4;
    @FXML
    private JFXTextField txtordid;
    @FXML
    private JFXTextField txtorddate;
    @FXML
    private JFXTextField txtitemname;
    @FXML
    private JFXTextField txttelopid;
    @FXML
    private JFXTextField txtcusttel;
    @FXML
    private JFXTextField ordqty;
    @FXML
    private JFXTimePicker timepi;
    @FXML
    private TextField txtordersearch;
    @FXML
    private JFXButton btncancelorder;
    @FXML
    private JFXButton btndelever;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ActionLbllastordid(MouseEvent event) {
    }

   

    @FXML
    private void Actionbtnord1(ActionEvent event) {
    }

    @FXML
    private void Actionbtnord2(ActionEvent event) {
    }

    @FXML
    private void Actionbtnord3(ActionEvent event) {
    }

    @FXML
    private void Actionbtnord4(ActionEvent event) {
    }

    @FXML
    private void Actiontxtordid(ActionEvent event) {
    }

    @FXML
    private void Actiontxtorddate(ActionEvent event) {
    }

    @FXML
    private void Actiontxtitemname(ActionEvent event) {
    }

    @FXML
    private void Actiontxttelopid(ActionEvent event) {
    }

    @FXML
    private void Actiontxtcusttel(ActionEvent event) {
    }

    @FXML
    private void Actionordqty(ActionEvent event) {
    }

    @FXML
    private void Actiontimepi(ActionEvent event) {
    }

    @FXML
    private void Actiontxtordersearch(ActionEvent event) {
    }

    @FXML
    private void Actionbtncancelorder(ActionEvent event) {
    }

    @FXML
    private void Actionbtndelever(ActionEvent event) {
    }

   
}
