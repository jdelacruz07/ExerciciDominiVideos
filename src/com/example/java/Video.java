package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Video {
	protected String url;
	protected String title;
	protected List<String> tags = new ArrayList<>();

	public Video() {
		super();
	}

	public Video(String url, String title) {
		this.url = url;
		this.title = title;
	}

	
	public List<String> showListOfVideos() {
		tags.add(Main.TITLEOFVIDEO); 
		return tags; 
	}

	public void addTags(String newVideo) {
		System.out.println("Se agrega a la lista ");
		tags.add(Main.TITLEOFVIDEO);
		tags.add(newVideo);
		System.out.println("Lista de video almacenado: " + tags);
	}
}
