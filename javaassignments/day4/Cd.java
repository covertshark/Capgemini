package com.javaassignments.day4;
import java.util.*;

public class Cd extends MediaItem
{
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	Scanner cs = new Scanner(System.in);
	
	public Cd()
	{
		super();
		System.out.println("Enter the artist name:");
		setArtist(cs.next());
		System.out.println("Enter genre:");
		setGenre(cs.next());
	}
	void print()
	{
		super.print();
		System.out.println("Artist is:"+getArtist()+"\n"+
								"Genre is:"+getGenre());
	}
}
