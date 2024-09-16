package com.micro.omsa.model;

import java.util.Arrays;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name="album")
public class Album 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int albumId;
	
	@Lob
	@Column(length = 100000)
	private byte[] albumImage;
	
	private String albumName;
	private String musicDirector;
	
	public Album() 
	{
		super();
	}

	public Album(int albumId, byte[] albumImage, String albumName, String musicDirector) {
		super();
		this.albumId = albumId;
		this.albumImage = albumImage;
		this.albumName = albumName;
		this.musicDirector = musicDirector;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public byte[] getAlbumImage() {
		return albumImage;
	}

	public void setAlbumImage(byte[] albumImage) {
		this.albumImage = albumImage;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getMusicDirector() {
		return musicDirector;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", albumImage=" + Arrays.toString(albumImage) + ", albumName=" + albumName
				+ ", musicDirector=" + musicDirector + "]";
	}

}
