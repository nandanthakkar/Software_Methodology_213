package library.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Song {
	private StringProperty Name;
	private StringProperty Artist;
	private StringProperty Album;
	private IntegerProperty Year;
	
	public Song(String name, String artist) {
		this.Name = new SimpleStringProperty(name);
		this.Artist = new SimpleStringProperty(artist);
	}
	
	public Song(String name, String artist, String album, int year) {
		this(name, artist);
		this.Album = new SimpleStringProperty(album);
		this.Album = new SimpleStringProperty(album);
	}
	
	public Song(String name, String artist, String album) {
		this(name, artist);
		this.Album = new SimpleStringProperty(album);
	}
	
	public Song(String name, String artist, int year) {
		this(name, artist);
		this.Album = new SimpleStringProperty(album);
	}

	public String getName() {
		return Name.get();
	}

	public void setName(String name) {
		Name.set(name);
	}

	public String getArtist() {
		return Artist.get();
	}

	public void setArtist(String artist) {
		Artist.set(artist);
	}

	public String getAlbum() {
		return Album.get();
	}

	public void setAlbum(String album) {
		Album.set(album);
	}

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}
	
	public String getKey() {
		return Name.toLowerCase() + "\n" + Artist.toLowerCase();
	}
	
	@Override
	public String toString() {
		return this.Name;
	}
	
}
