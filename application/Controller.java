package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
	
public class Controller {
PersonRegister reg = new PersonRegister();
@FXML
private TextField txtPersonName;
@FXML
private TextField txtPersonNumber;
@FXML
private TextField txtCardType;
@FXML
private TextField txtAccountNumber;
@FXML
private TextField outputText;
@FXML
private RadioButton rbtnHasCard;
@FXML
private RadioButton rbtnNoCard;
@FXML
public void btnAddPerson_Click(ActionEvent event) {
		String pName = txtPersonName.getText();
		Person tmpPerson = new Person();
  
        if (pName.isEmpty()) {
        	
        	outputText.setText("No name entered");
        	
        }
        else {
        	
        	 tmpPerson.setPersonName(pName);
        	 reg.addPerson(tmpPerson);
        	 outputText.setText(pName + " added");
    }      
}


@FXML
public void btnFind_Click(ActionEvent event) {
    String cNumber = txtCustNbr.getText();
    Customer tmpCustomer = reg.findCustomer(cNumber);
    if (tmpCustomer != null) { lblResponse.setText("Response:");
        txtCustNbr.setText(tmpCustomer.getCNumber());
        txtCustName.setText(tmpCustomer.getCName());
    if (tmpCustomer.getCreditcard() != null) {
        Creditcard card = tmpCustomer.getCreditcard();
        txtCardType.setText(card.getType());
        txtCardNbr.setText(Integer.toString(card.getCardNumber())); 
        rbtnHasCard.setSelected(true);
    }else {
        txtCardType.setText("");
        txtCardNbr.setText("");
        rbtnNoCard.setSelected(true); 
    }
}else {
    lblResponse.setText("Response: Customer not found");
}
}


@FXML
    public void btnDelete_Click(ActionEvent event) {
    String cNumber = txtCustNbr.getText();
    reg.removeCustomer(cNumber);
    lblResponse.setText("Response:");

}
@FXML
public void btnNewName_Click(ActionEvent event) {
  String cNumber = txtCustNbr.getText();
  Customer tmpCustomer = reg.findCustomer(cNumber);
  if (tmpCustomer != null) {
    lblResponse.setText("Response:");
    String newName = txtCustName.getText();
             reg.setCustomerName(cNumber, newName);
  }else {
    lblResponse.setText("Response: Customer not found");
  }
 }
} 