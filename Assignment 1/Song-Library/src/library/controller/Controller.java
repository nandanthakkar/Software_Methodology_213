package library.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.model.Song;
import library.model.SongList;

public class Controller {
	
	@FXML         
	ListView<String> listView;
	
	@FXML
	TextField name;
	
	@FXML
	TextField artist;
	
	@FXML
	TextField album;
	
	@FXML
	TextField year;
	
	@FXML
	Button add;
	
	@FXML
	Button edit;
	
	@FXML
	Button delete;
	
	@FXML
	Button help;
	
	private ObservableList<String> obsList;
	
	public void start(Stage mainStage) {
		
		SongList sl = new SongList();
		obsList = FXCollections.observableArrayList(sl.getSonglist().entrySet().stream().map(m -> m.getValue().getName()).collect(Collectors.));
		

		
		listView = new ListView<String>(obsList);
		//listView.setItems(obsList);
		
		listView.getSelectionModel().select(0);

		//listView.setItems();
	}
}
