package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import application.Player;
import application.Song;
import application.User;

public class TestPlayer {

	private Player testPlayer;
	private User testUser;
	private Song testSong;
	
	public TestPlayer(){
		testPlayer = new Player();
		testUser = new User("TestUser", "test", "user");
		testSong = new Song();
	}
	
	@Test
	public void testAddUser(){
		testPlayer.addUser(testUser);
		assertEquals("TestUser", testPlayer.getAllUsers().get(1).getName());
	}
	@Test
	public void testGetCurrentUser() {
		assertEquals("Administrator", testPlayer.getCurrentUser().getName());
	}
	@Test
	public void testSetCurrentUser() {
		testPlayer.setCurrentUser(testUser);
		assertEquals("TestUser", testPlayer.getCurrentUser().getName());		
	}
	@Test
	public void testGetCurrentSong() {
		testPlayer.setCurrentSong(testSong);
		assertEquals("Unknown", testPlayer.getCurrentSong().getName());
	}
	@Test
	public void getPlaying() {
		testPlayer.setPlaying(true);
		assertEquals(true, testPlayer.getPlaying());
	}
	@Test
	public void getPaused() {
		testPlayer.setPaused(true);
		assertEquals(true, testPlayer.getPaused());	
	}

}
