package library.model;

import java.util.Map;
import java.util.TreeMap;

public class SongList {

	Map<String, Song> songlist = new TreeMap<String, Song>();
	
	
	
	public boolean addToList(String name, String artist, String album, int year) {
		if(name.isEmpty() && artist.isEmpty()) {
			return false;
		}
		Song s = new Song(name, artist, album, year);
		try {
		songlist.put(s.getKey(), s);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}



	public Map<String, Song> getSonglist() {
		return songlist;
	}
	
	
	

//	public void setSonglist(Map<String, Song> songlist) {
//		this.songlist = songlist;
//	}
	
}
