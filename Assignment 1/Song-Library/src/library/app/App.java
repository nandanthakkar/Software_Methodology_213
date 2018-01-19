package library.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import javafx.application.Application;
import library.controller.Controller;
import library.model.Song;
import library.model.SongList;


public class App extends Application{
	public void start(Stage primaryStage) throws Exception {
		try {
		FXMLLoader loader = new FXMLLoader();   
	      loader.setLocation(
	         getClass().getResource("/library/view/songlib.fxml"));
	      AnchorPane root = (AnchorPane)loader.load();

	      Controller control = loader.getController();
	      control.start(primaryStage);

	      Scene scene = new Scene(root, 400, 600);
	      primaryStage.setScene(scene);
	      primaryStage.show(); 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		SongList sl = new SongList();
		Map<String, Song> songlist = sl.getSonglist();
		BiFunction<String, String, Song> bifunc = Song::new;
		List<Song> sng = new ArrayList<Song>();
		sng.add(bifunc.apply("Mera juta hai japani", "Hai patloon hindustani"));
		sng.add(bifunc.apply("Party on my mind", "Race 2"));
		sng.add(bifunc.apply("lat lag gayee", "Race 2"));
		for(Song s : sng) {
			songlist.put(s.getKey(), s);
		}
		Application.launch(args);
	}
}
