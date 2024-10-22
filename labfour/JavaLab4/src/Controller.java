import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller {

   @FXML 
   private TextField emailTextfield; // Ensure it's private

   @FXML 
   private TextField nameTextField; // Add @FXML annotation and make it private
    
    public void submit(ActionEvent event) {
      System.out.println("Submitted");
      
      // Now both text fields should be properly linked
      String email = emailTextfield.getText();
      String name = nameTextField.getText();
      
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setTitle("Submitted");
      alert.setHeaderText("Thank you");
      alert.setContentText("Submitted Details: Name: " + name + ", Email: " + email);
      alert.showAndWait();
    }
}
