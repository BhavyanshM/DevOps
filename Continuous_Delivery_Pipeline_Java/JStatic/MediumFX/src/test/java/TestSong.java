package test.java;
import application.*;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestSong {

	private Song testSong;
	
	public TestSong(){
		this.testSong = new Song("Don't Wanna Know", 
				240, 
				"Maroon 5", 
				"Dont_Wanna_Know.mp3", 
				"Adam Levine", 
				30.00, 
				"Dont_Wanna_Know.png");
	}

	@Test
	public void testGetTimesPlayed() {
		testSong.setTimesPlayed(0);
		assertEquals(0, testSong.getTimesPlayed());
	}

	@Test
	public void testGetDuration(){
		assertEquals(240, testSong.getDuration());
	}
	@Test
	public void testGetCost(){
		assertEquals(30.00, testSong.getCost(),0.0);
	}
	@Test
	public void testGetName(){
		assertEquals("Don't Wanna Know", testSong.getName());
	}
	@Test
	public void testGetAlbum(){
		assertEquals("Maroon 5", testSong.getAlbum());
	}
	@Test
	public void testGetLocation(){
		assertEquals("Dont_Wanna_Know.mp3", testSong.getLocation());
	}
	@Test
	public void testGetSinger(){
		assertEquals("Adam Levine", testSong.getSinger());	}
	@Test
	public void testGetIcon(){
		assertEquals("Dont_Wanna_Know.png", testSong.getIcon());
	}
	
	
	//Setter Methods begin
	@Test
	public void testSetName(){
		testSong.setName("testName");
		assertEquals("testName", this.testSong.getName());
	}
	@Test
	public void testSetAlbum(){
		testSong.setAlbum("testAlbum");
		assertEquals("testAlbum", this.testSong.getAlbum());
	}
	@Test
	public void testSetSinger(){
		testSong.setSinger("testSinger");
		assertEquals("testSinger", this.testSong.getSinger());
	}
	@Test
	public void testSetLocation(){
		testSong.setLocation("testLocation");
		assertEquals("testLocation", this.testSong.getLocation());
	}
	@Test
	public void testSetIcon(){
		testSong.setIcon("testIcon");
		assertEquals("testIcon", this.testSong.getIcon());
	}
	@Test
	public void testSetDuration(){
		testSong.setDuration(100);
		assertEquals(100, this.testSong.getDuration());
	}
	@Test
	public void testSetCost(){
		testSong.setCost(123.45);
		assertEquals(123.45, this.testSong.getCost(), 0.0);
	}
	@Test
	public void testSetTimesPlayed() {
		testSong.setTimesPlayed(10);
		assertEquals(10, this.testSong.getTimesPlayed());
	}
	
}
