package com.zhiro.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class MusicPlayer {

	@Qualifier("classicalMusic")
	private Music music1;
	private Music music2;
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private String volume;
	
	@PostConstruct
	public void doInit() {
		System.out.println("doing initialization");
	}
	@PreDestroy
	public void doDestroy() {
		System.out.println("doing destruction");
	}
	
	public MusicPlayer(@Qualifier("classicalMusic")Music music1,@Qualifier("rockMusic")Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}
	
	
	public void playMusic() {
			System.out.println(music1.getSong() + " " + music2.getSong());
	}
	public String getName() {
		return name;
	}
	public String getVolume() {
		return volume;
	}

}
