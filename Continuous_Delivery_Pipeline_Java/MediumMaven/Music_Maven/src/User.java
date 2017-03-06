import java.util.ArrayList;

public class User {
	private String name;
	private String username;
	private String password;
	private ArrayList<Song> favorites;
	private ArrayList<Playlist> playlists;
	private ArrayList<Song> allSongs;
	
	public User(){
		this.name = "Unknown";
		this.username = "Not Assigned";
		this.password = "Not Assigned";
		this.favorites = new ArrayList<Song>();
		this.playlists = new ArrayList<Playlist>();
		this.allSongs = new ArrayList<Song>();
	}
	
	public User(String name, String username, String password){
		this.name = name;
		this.username = username;
		this.password = password;
		this.favorites = new ArrayList<Song>();
		this.playlists = new ArrayList<Playlist>();
		this.allSongs = new ArrayList<Song>();
	}
	
	public ArrayList<Song> getAllSongs() {
		return allSongs;
	}

	public void setAllSongs(ArrayList<Song> allSongs) {
		this.allSongs = allSongs;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getUserName(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public ArrayList<Song> getFavorites(){
		return this.favorites;
	}
	
	public ArrayList<Playlist> getPlaylists(){
		return this.playlists;
	}
	
	public void setName(String a){
		this.name = a;
	}
	
	public void setUserName(String a){
		this.username = a;
	}
	
	public void setPassword(String a){
		this.password = a;
	}
	
	public void addToFavorites(Song a){
		this.favorites.add(a);
	}
	
	public void addToPlaylists(Playlist a){
		this.playlists.add(a);
	}
}
