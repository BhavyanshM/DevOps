package application;
import java.io.File;

public class Song {
	
	private String name;
	private int duration;
	private String album;
	private String location;
	private String singer;
	private double cost;
	private String icon;
	private File file;
	private int timesPlayed;
	
	public Song(){
		this.name = "Unknown";
		this.duration = 0;
		this.album = "Unknown";
		this.location = "Unknown";
		this.singer = "Unknown";
		this.cost = 0.0;
		this.icon = "Unknown";
	}
	
	public Song(String name){
		this();
		this.name = name;
	}
	
	public Song(String name, int dur, String alb, String loc, String sing, double cost, String icon){
		this.name = name;
		this.duration = dur;
		this.album = alb;
		this.location = loc;
		this.singer = sing;
		this.cost = cost;
		this.icon = icon;
	}
	
	//Getter Methods begin
	public int getTimesPlayed() {
		return timesPlayed;
	}
	
	public File getFile(){
		return this.file;
	}
	
	public int getDuration(){
		return this.duration;
	}
	
	public double getCost(){
		return this.cost;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAlbum(){
		return this.album;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public String getSinger(){
		return this.singer;
	}
	
	public String getIcon(){
		return this.icon;
	}
	
	//Setter Methods begin
	public void setName(String a){
		this.name = a;
	}
	
	public void setAlbum(String a){
		this.album = a;
	}
	
	public void setSinger(String a){
		this.singer = a;
	}
	
	public void setLocation(String a){
		this.location = a;
	}
	
	public void setIcon(String a){
		this.icon = a;
	}
	
	public void setDuration(int a){
		this.duration = a;
	}
	
	public void setCost(double a){
		this.cost = a;
	}
	
	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}

}
