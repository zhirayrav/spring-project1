package com.zhiro.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	private Music classicBean;
	private Music rockBean;
	public enum Genre{
		CLASSIC,ROCK
	}
	public MusicPlayer() {}
	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic")Music classicBean,@Qualifier("rockMusic")Music rockBean) {
		this.classicBean = classicBean;
		this.rockBean = rockBean;
	}
	
	
	public void playMusic(Genre genre) {
		if(genre == Genre.CLASSIC)
		System.out.println(classicBean.getSong());
		else 
			System.out.println(rockBean.getSong());
	}

}
