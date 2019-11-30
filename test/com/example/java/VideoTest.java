package com.example.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {

	@Test
	public void test() {
		Video video = new Video();
		String videoOne = video.showListOfVideos().get(0);
		assertEquals("Los Barbaros", videoOne);
	}

}
