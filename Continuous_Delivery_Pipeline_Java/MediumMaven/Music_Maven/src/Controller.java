
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Controller implements Initializable{
	@FXML
	private Button switchUser;
	@FXML
	private Label userLabel;
	@FXML
	private ListView<String> list;
	@FXML
	private Button searchButton;
	
	private ObservableList<String> items;
	private Player player;
	private FXMLLoader loader;
	
	public void setList(ArrayList<Song> songs){
		items = FXCollections.observableArrayList();
		for(int i = 0; i<songs.size(); i++)
			items.add(songs.get(i).getName());
		this.list.setItems(items);
	}
	
	@FXML
	public void onSwitchUserClicked(ActionEvent event) throws Exception{
		this.loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/login.fxml").openStream());
		LoginController loginCont = (LoginController) loader.getController();
		loginCont.setPlayer(player);
		Stage window = (Stage) ((Control)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root, 800, 600);		
		window.setScene(scene);
		window.show();
	}
	@FXML
	public void onSearchButtonClicked(ActionEvent event) throws Exception{
		this.setList(player.getCurrentUser().getAllSongs());
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void setUserLabelText(String userName){
		this.userLabel.setText(userName);
	}
	public void setPlayer(Player player){
		this.player = player;
		this.setList(player.getCurrentUser().getAllSongs());
	}
	
}
