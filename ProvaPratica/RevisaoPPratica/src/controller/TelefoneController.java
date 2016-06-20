package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Comercial;
import model.Residencial;
import model.Telefone;

public class TelefoneController {

    @FXML
    private DatePicker dpDataInstalacao;

    @FXML
    private Button btnAdicionar;

    @FXML
    private TableColumn<Telefone, Number> tbValor;

    @FXML
    private TableColumn<Telefone, String> tbNumero;

    @FXML
    private TableColumn<Telefone, String> tbUsuario;

    @FXML
    private RadioButton rbResidencial;

    @FXML
    private RadioButton rbComercial;

    @FXML
    private TableView<Telefone> tvTelefone;

    @FXML
    private TextField tfUsuario;

    @FXML
    private TextField tfNumero;

    @FXML
    public void intialize(){
    	tbUsuario.setCellValueFactory(c-> c.getValue().getUsuarioProperty());
    	tbNumero.setCellValueFactory(c->c.getValue().getNumeroProperty());
    	tbValor.setCellValueFactory(c-> c.getValue().valorBasico());
    }
    
    @FXML
    void adicionar(ActionEvent event){
    	Telefone telefone = null;
    	if(rbComercial.isSelected()){
    		telefone = new Comercial();	
     	} else {
     		telefone = new Residencial();
     	}
    	
    	telefone.setDataInstalacao(dpDataInstalacao.getValue());
    	telefone.setNumero(tfNumero.getText());
    	telefone.setUsuario(tfUsuario.getText());
    	
    	tvTelefone.getItems().add(telefone);
    }
}
