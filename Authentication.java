import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 *
 * @author SM Nazibullah Touhid
 * Prof. Tanes Kanchanawanchai
 * CSC 200
 * March 15, 2017
 * License: GNU
 *
 * Program:
 * Authenticate a user login for username and password.
 *
 * Purpose of the Program:
 * To demonstrate If-Else statement
 *
 */
public class Authentication extends Application{
	public void start(Stage primaryStage){
		Alert message= new Alert(AlertType.INFORMATION);
		TextInputDialog dialog= new TextInputDialog();
		dialog.setContentText("Enter Your Username");
		dialog.showAndWait();
		String username=dialog.getResult();
		if(username.equals("nuhash")){
			dialog.setContentText("Enter Your PassWord");
			dialog.showAndWait();
			String password=dialog.getResult();
			if(password.equals("n123")){
				message.setContentText("Welcome "+username+"!");
				message.showAndWait();

			}
			else{
				message.setContentText("Sorry! Wrong Password");
				message.showAndWait();
			}

		}
		else{
			message.setContentText("Sorry! Wrong Username.");
			message.showAndWait();

		}

	}
}
