package application;

import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TextField idTechnician;

    @FXML
    private TextField nomTechnician;

    @FXML
    private TextField phoneTechnician;

    @FXML
    private TextField idRefTechnician;

    @FXML
    private TextField accessCodeTechnician;
    
// -------------------------------------------- table technician ---------------------------------------------------------

    @FXML
    private TableView<?> Table;

    @FXML
    private TableColumn<?, ?> idTechnicianColumn;

    @FXML
    private TableColumn<?, ?> nomTechnicianColumn;

    @FXML
    private TableColumn<?, ?> phoneTechnicianColumn;

    @FXML
    private TableColumn<?, ?> idRefTechnicianColumn;

    @FXML
    private TableColumn<?, ?> accessCodeTechnicianColumn;


    
 // -------------------------------------------- Clinet field ---------------------------------------------------------

    @FXML
    private TextField clientId;

    @FXML
    private TextField clientName;

    @FXML
    private TextField clientPhone;

    @FXML
    private TextField clientChoise;
    
    @FXML
    private TextField clientCoins;
    

    
    // -------------------------------------------- Clinet table ---------------------------------------------------------


    @FXML
    private TableView<?> Table11;

    @FXML
    private TableColumn<?, ?> idClientColumn;

    @FXML
    private TableColumn<?, ?> nomClientColumn;

    @FXML
    private TableColumn<?, ?> phoneClientColumn;

    @FXML
    private TableColumn<?, ?> choiseClientColumn;

    @FXML
    private TableColumn<?, ?> CoinsClientColumn;

    
    // -------------------------------------------- Product field ---------------------------------------------------------

    
    

    @FXML
    private TextField idProduct;

    @FXML
    private TextField NameProduct;

    @FXML
    private TextField priceProduct;
    
    
    // -------------------------------------------- Product table ---------------------------------------------------------


    @FXML
    private TableView<?> Table111;

    @FXML
    private TableColumn<?, ?> idProduitColumn;

    @FXML
    private TableColumn<?, ?> nomProduitColumn;

    @FXML
    private TableColumn<?, ?> prixProduitColumn;

    
    // -------------------------------------------- Machine field ---------------------------------------------------------

    
    @FXML
    private TextField idMachine;

    @FXML
    private TextField turn;

    @FXML
    private TextField sumChange;
    
    
    // -------------------------------------------- Machine table ---------------------------------------------------------

    

    @FXML
    private TableView<?> Table1111;

    @FXML
    private TableColumn<?, ?> idMachineColumn;

    @FXML
    private TableColumn<?, ?> isOnMachineColumn;

    @FXML
    private TableColumn<?, ?> sumChangeMachineColumn;
    
    
    
    
    
    
    // -------------------------------------------- Add Client method---------------------------------------------------------


    @FXML
    void AddClient() {
    	
		double clientId =Integer.parseInt(clientId.getText());
    	
		double clientCoins = Integer.parseInt(clientCoins.getText());
		
		idClientColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
		nomClientColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		phoneClientColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
		choiseClientColumn.setCellValueFactory(new PropertyValueFactory<>("Choise"));
		CoinsClientColumn.setCellValueFactory(new PropertyValueFactory<>("coins"));
    	
		Client Client1 = new Client(Idc, clientName.getText() , clientPhone.getText(), clientChoise.getText(), clientCoins);
		Table11.getItems().add(Client1);

    }
    


    // -------------------------------------------- Add Machine method---------------------------------------------------------


    @FXML
    void AddMachine() {
    	
    	int idMachine =Integer.parseInt(idMachine.getText());
    	
    	
    	idMachineColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
    	isOnMachineColumn.setCellValueFactory(new PropertyValueFactory<>("turn"));
    
    	Machine Machine = new Machine(idMachine, turn.getText());
    	
    	Table1111.getItems().add(Machine);

    }

    
    
    // -------------------------------------------- Add product method---------------------------------------------------------

    
    
    @FXML
    void AddProduct() {
    	
    	
    	double idProduct =Integer.parseInt(idProduct.getText());
    	double priceProduct = Integer.parseInt(priceProduct.getText());
    	
    	idProduitColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
    	nomProduitColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	prixProduitColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    	
    
    	Product Product = new Product(idProduct, NameProduct.getText(),priceProduct);
    	
    	Table111.getItems().add(Product);

    }
    
    
    
    // -------------------------------------------- Add Technician method---------------------------------------------------------


    @FXML
    void addTechnician() {
    	
			int Id =Integer.parseInt(idTechnician.getText());
	   	    	
			idTechnicianColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
			nomTechnicianColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
	    	
			phoneTechnicianColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
	    	
			idRefTechnicianColumn.setCellValueFactory(new PropertyValueFactory<>("idRef"));
	
			accessCodeTechnicianColumn.setCellValueFactory(new PropertyValueFactory<>("accessCode"));
	 	
			Technician technician = new Technician(Id, nomTechnician.getText() , phoneTechnician.getText(), idRefTechnician.getText(), accessCodeTechnician.getText());
	  	
			Table.getItems().add(technician);
	  	
			Table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	    	
			Table.getSelectionModel().setCellSelectionEnabled(true);
    	

    }

}

