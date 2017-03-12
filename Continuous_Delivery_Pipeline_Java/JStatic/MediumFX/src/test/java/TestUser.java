package test.java;
import application.User;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Song;

public class TestUser {

	private User testUser;
	
	public TestUser() {
		this.testUser = new User("TestUser", "test", "user");
		testUser.getAllSongs().add(
				new Song("Don't Wanna Know", 
						240, 
						"Maroon 5", 
						"C:\\DataBM\\Songs\\DWK.mp3", 
						"Maroon 5", 
						30.00, 
						"C:\\DataBM\\Icons\\DWK.png"));
	}
	@Test
	public void testGetAllSongs() {
		assertEquals("Don't Wanna Know", testUser.getAllSongs().get(0).getName());
	}
	@Test
	public void testGetName(){
		assertEquals("TestUser", testUser.getName());
	}
	@Test
	public void getUserName(){
		assertEquals("test", testUser.getUserName());
	}
	@Test
	public void getPassword(){
		assertEquals("user", testUser.getPassword());
	}
	@Test
	public void setName(){
		testUser.setName("testName");
		assertEquals("testName", testUser.getName());
	}
	@Test
	public void setUserName(){
		testUser.setUserName("testUserName");
		assertEquals("testUserName", testUser.getUserName());	
	}
	@Test
	public void setPassword(){
		testUser.setPassword("testPassword");
		assertEquals("testPassword", testUser.getPassword());	
	}
}
