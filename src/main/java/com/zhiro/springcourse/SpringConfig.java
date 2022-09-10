package com.zhiro.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	@Bean
	public JazzMusic jazzMusic() {
		return new JazzMusic();
	}
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(list());
	}
	@Bean
	public List<Music> list(){
		List<Music> list = new ArrayList<Music>();
		list.add(classicalMusic());
		list.add(rockMusic());
		list.add(jazzMusic());
		return list;
	}
}
