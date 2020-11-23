package dad.calculadoraFXML.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.calculadoraFXML.utils.Calculadora;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class Controller implements Initializable {
	
	private Calculadora calc;
	
	public Controller () throws IOException {
		calc = new Calculadora();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraInterfazFXML.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@FXML
    private GridPane root;

    @FXML
    private TextField pantallaText;

    @FXML
    private Button sieteButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button unoButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button comaButton;

    @FXML
    private Button masButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button ceButton;

    @FXML
    private Button cButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button igualButton;

    @FXML
    void OnSieteButtonAction(ActionEvent event) {
    	calc.insertar('7');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onCButtonAction(ActionEvent event) {
    	calc.borrar();
    }

    @FXML
    void onCeButtonAction(ActionEvent event) {
    	calc.borrarTodo();
    }

    @FXML
    void onCeroButtonAction(ActionEvent event) {
    	calc.insertar('0');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onCincoButtonAction(ActionEvent event) {
    	calc.insertar('5');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onComaButtonAction(ActionEvent event) {
    	calc.insertarComa();
    }

    @FXML
    void onCuatroButtonAction(ActionEvent event) {
    	calc.insertar('4');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onDividirButtonAction(ActionEvent event) {
    	calc.operar('/');
    }

    @FXML
    void onDosButtonAction(ActionEvent event) {
    	calc.operar('2');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onIgualButtonAction(ActionEvent event) {
    	calc.operar('=');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onMasButtonAction(ActionEvent event) {
    	calc.operar('+');
    }

    @FXML
    void onMenosButtonAction(ActionEvent event) {
    	calc.operar('-');
    }

    @FXML
    void onMultiplicarButtonAction(ActionEvent event) {
    	calc.operar('*');
    }

    @FXML
    void onNueveButtonAction(ActionEvent event) {
    	calc.insertar('9');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onOchoButtonAction(ActionEvent event) {
    	calc.insertar('8');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onSeisButtonAction(ActionEvent event) {
    	calc.insertar('6');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onTresButtonAction(ActionEvent event) {
    	calc.insertar('3');
    	pantallaText.setText(calc.getPantalla());
    }

    @FXML
    void onUnoButtonAction(ActionEvent event) {
    	calc.insertar('1');
    	pantallaText.setText(calc.getPantalla());
    }
	
    public void initialize(URL location, ResourceBundle resources) {
    	
	}

	public GridPane getRoot() {
		return root;
	}
}
