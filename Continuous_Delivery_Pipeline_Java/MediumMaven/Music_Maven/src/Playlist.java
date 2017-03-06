import java.util.ArrayList;

public class Playlist {
	private String creator;
	private ArrayList<Song> songs;
	private String name;
	private int numberOfSongs;
	private String recentlyPlayedSong;
	private String mostPlayedSong;
	
	public Playlist(){
		this.creator = "Unknown";
		this.name = "Unknown";
		this.numberOfSongs = 0;
		this.songs = new ArrayList<Song>();
		this.recentlyPlayedSong = "None";
		this.mostPlayedSong = "None";
	}
	
	public Song getSong(String a){
		Song theSong = null;
		for(Song s: this.songs){
			if(s.getName().equals(a)){
				theSong = s;
			}
		}
		return theSong;		
	}
	
	public int getNumberOfSongs(){
		return this.numberOfSongs;
	}
	
	public ArrayList<Song> getSongs(){
		return this.songs;
	}
	
	public String getCreator(){
		return this.creator;
	}
	
	public String getName(){
		return this.name;
	}

	public String getRecentlyPlayedSong(){
		return this.recentlyPlayedSong;
	}
	
	public String mostPlayedSong(){
		return this.mostPlayedSong;
	}
	
	public void setCreator(String a){
		this.creator = a;
	}

	public void setName(String a){
		this.name = a;
	}
	
	public void setRecentlyPlayedSong(String a){
		this.recentlyPlayedSong = a;
	}
	
	public void setMostPlayedSong(String a){
		this.mostPlayedSong = a;
	}
	
	public void setSongs(ArrayList<Song> a){
		this.songs = a;
	}
	
	public void addSong(Song a){
		this.songs.add(a);
	}
}
