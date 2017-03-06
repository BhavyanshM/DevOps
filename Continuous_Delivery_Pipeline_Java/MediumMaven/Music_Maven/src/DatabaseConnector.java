import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {
	private Connection conn;
	private Statement statement;	
	private ResultSet rows;
	private String query;
	private ArrayList<Song> dbSongs;
	private ArrayList<User> dbUsers;
	
	public DatabaseConnector(){
		dbSongs = new ArrayList<Song>();
		this.setQuery("select * from songs");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://52.90.84.220:8080/Tester", "naman", "chocolate");
			this.statement = this.conn.createStatement();
			this.rows = this.statement.executeQuery(this.query);
			while(this.rows.next()){
				dbSongs.add(new Song(this.rows.getString("Name"), 
						this.rows.getInt("Duration"), 
						this.rows.getString("Album"), 
						this.rows.getString("Location"), 
						this.rows.getString("Singer"), 
						this.rows.getDouble("Cost"), 
						this.rows.getString("Icon")));
//				System.out.println(this.rows.getInt("Srno")+"\t"+
//									this.rows.getString("Name")+"\t"+
//									this.rows.getInt("Duration")+"\t"+
//									this.rows.getString("Singer")+"\t"+
//									this.rows.getDouble("Cost")+"\t"+
//									this.rows.getString("Location")+"\t"+
//									this.rows.getString("Icon")+"\t");				
			}
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLException: " + ex.getErrorCode());			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}				
	}
	
	public void printSongs(ArrayList<Song> songlist){
		for(Song s: songlist){
			System.out.println(s.getName() + "\t" + 
					s.getDuration() + "\t" + 
					s.getSinger() + "\t" + 
					s.getCost() + "\t" + 
					s.getLocation() + "\t" + 
					s.getIcon() + "\t");
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	public ResultSet getRows() {
		return rows;
	}
	public void setRows(ResultSet rows) {
		this.rows = rows;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public ArrayList<Song> getDbSongs() {
		return dbSongs;
	}

	public void setDbSongs(ArrayList<Song> dbSongs) {
		this.dbSongs = dbSongs;
	}

	public ArrayList<User> getDbUsers() {
		return dbUsers;
	}

	public void setDbUsers(ArrayList<User> dbUsers) {
		this.dbUsers = dbUsers;
	}	
	
}
