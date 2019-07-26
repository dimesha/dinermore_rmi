/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import tblmodl.SubmitTbl;

/**
 * FXML Controller class
 *
 * @author dimesha
 */
public class TelOrderController implements Initializable {

    @FXML
    private Label lbldate;
    @FXML
    private Label lbloid;
    @FXML
    private Label lblamount;
    @FXML
    private Label lbltime;
    @FXML
    private Label lbltelopid;
    @FXML
    private TextField txtsub1n;
    @FXML
    private TextField txtsub2n;
    @FXML
    private TextField txttelusername2;
    @FXML
    private TextField txttelusername3;
    @FXML
    private TextField txttelusername4;
    @FXML
    private TextField txttelusername5;
    @FXML
    private JFXTextField txtcustname;
    @FXML
    private JFXTextField txtcusttel;
    @FXML
    private JFXTextField txtaddress;
    @FXML
    private JFXTextField txtordqty;
    @FXML
    private JFXTextField txtprice;
    @FXML
    private JFXComboBox<String> jcmbitemname;
    @FXML
    private TableView<SubmitTbl> tblorder;
    @FXML
    private TextField itemserch;
    @FXML
    private JFXButton btnchangeord;
    @FXML
    private JFXButton btnsend;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Actiontxtsub1n(ActionEvent event) {
    }

    @FXML
    private void Actiontxtsub2n(ActionEvent event) {
    }

    @FXML
    private void Actiontxttelusername(ActionEvent event) {
    }

    @FXML
    private void Actiontxtcustname(ActionEvent event) {
    }

    @FXML
    private void Actiontxtcusttel(ActionEvent event) {
    }

    @FXML
    private void Actiontxtaddress(ActionEvent event) {
    }

    @FXML
    private void Actiontxtordqty(ActionEvent event) {
    }

    @FXML
    private void Actiontxtprice(ActionEvent event) {
    }

    @FXML
    private void Actionjcmbitemname(ActionEvent event) {
    }

    @FXML
    private void Actionitemserch(ActionEvent event) {
    }

    @FXML
    private void Actionbtnchangeord(ActionEvent event) {
    }

    @FXML
    private void Actionbtnsend(ActionEvent event) {
    }
    
}
