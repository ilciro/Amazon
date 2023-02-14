package view;

import java.net.URL;
import java.util.ResourceBundle;

import controller.ControllerCatalogoHomePage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class BoundaryCatalogoHomePage implements Initializable {

	@FXML
	private Pane pane;
	@FXML
	private Label Header;
	@FXML
	private TextArea tA;
	@FXML
	private Label labelOg;
	@FXML
	private Label oggettoScelto;
	@FXML
	private Button buttonA;
	private ControllerCatalogoHomePage cHP;
	
	@FXML
	public void compra()
	{
		
		cHP.stampa(oggettoScelto.getText());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		cHP=new ControllerCatalogoHomePage();
		cHP.leggi();
	}
	
	
}
