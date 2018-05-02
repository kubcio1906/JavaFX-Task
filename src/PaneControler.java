import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.beans.EventHandler;

public class PaneControler {

    @FXML
    Button loginButton;
    @FXML
    TextField loginTextField;
    @FXML
    PasswordField passwordField;

    @FXML
    Button b1;
    @FXML
    public void akcja(){
        System.out.println("Duzego");
    }
    @FXML
    public void login(){
        String login = loginTextField.getText();
        String password = passwordField.getText();
        if(login.equals("login1") && password.equals("pass1")){
            System.out.println("Zalogowales sie");
        }else{
            System.out.println("Nie zalogowales sie ");
        }
    }

}

