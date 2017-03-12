package application;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	@FXML
	private TextField userNameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Label errorMessage;
	private Player player;
	private Controller controller;
	private Scene scene;
	private Stage window;
	private FXMLLoader loader;
	private Pane root;
	
	@FXML
	public void onLoginClicked(ActionEvent event) throws Exception{
		Boolean correct = false;
		for(User user: player.getAllUsers()){
			System.out.println("UserName: " + user.getUserName() + " Password: " + user.getPassword());
			if(user.getUserName().equals(this.userNameField.getText())
					&& user.getPassword().equals(this.passwordField.getText())){
				correct = true;
				break;
			}
		}
		if(correct){
			loader = new FXMLLoader();
			root = loader.load(getClass().getResource("/resources/player.fxml").openStream());
			window = (Stage) ((Control)event.getSource()).getScene().getWindow();
			scene = new Scene(root, 800, 600);
			controller = (Controller) loader.getController();
			controller.setUserLabelText("Hi, " + this.userNameField.getText());
			controller.setPlayer(this.player);
//			controller.setList(player.getCurrentUser().getAllSongs());
			window.setScene(scene);
			window.show();
		}else{
			this.errorMessage.setText("Sorry, please try again.");
		}
	}
	@FXML
	public void onSignupClicked(ActionEvent event) throws Exception{
		String userName = this.userNameField.getText();
		String passWord = this.passwordField.getText();
		if(userName.length()<6 || passWord.length()<6){
			this.errorMessage.setText("Username or Password needs to be 6 characters or longer.");
		}else{
			this.player.addUser(new User(userName, userName, passWord));
			for(User user : this.player.getAllUsers())
				System.out.println("User: " + user.getName());
			loader = new FXMLLoader();
			root = loader.load(getClass().getResource("/resources/player.fxml").openStream());
			window = (Stage) ((Control)event.getSource()).getScene().getWindow();
			scene = new Scene(root, 800, 600);
			controller = (Controller) loader.getController();
			controller.setUserLabelText("Hi, " + this.userNameField.getText());
			controller.setPlayer(this.player);
			window.setScene(scene);
			window.show();
		}
	}

	public void setPlayer(Player player){
		this.player = player;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
}
