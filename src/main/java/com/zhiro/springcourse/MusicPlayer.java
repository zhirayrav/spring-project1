package com.zhiro.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //if "protopype" - method doDestroy() is not calling
public class MusicPlayer {
	@Autowired
	@Qualifier("classicalMusic")
	private Music music;
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
	
	public MusicPlayer() {}
//	@Autowired
//	public MusicPlayer(@Qualifier("classicalMusic")Music music) {
//		this.music = music;
//	}
	
	
	public void playMusic() {
			System.out.println(music.getSong());
	}
	public String getName() {
		return name;
	}
	public String getVolume() {
		return volume;
	}

}
