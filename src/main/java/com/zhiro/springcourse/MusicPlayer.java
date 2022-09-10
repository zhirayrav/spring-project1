package com.zhiro.springcourse;

import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class MusicPlayer {

	List<Music> list;
	
	@PostConstruct
	public void doInit() {
		System.out.println("doing initialization");
	}
	@PreDestroy
	public void doDestroy() {
		System.out.println("doing destruction");
	}
	
	public MusicPlayer(List<Music> list) {
		this.list = list;
	}
	
	public void playMusic() {
			System.out.println(list.get((new Random().nextInt(list.size()))).getSong());
	}

}
