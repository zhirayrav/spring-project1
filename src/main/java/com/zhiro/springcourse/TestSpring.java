package com.zhiro.springcourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiro.springcourse.MusicPlayer.Genre;

public class TestSpring {
	public static void main (String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context1 = new AnnotationConfigApplicationContext("com.zhiro.springcourse");
		
		MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
//		ClassicalMusic classic2 = context.getBean("classicBean",ClassicalMusic.class);
		player.playMusic(Genre.ROCK);
//		System.out.println(classic2.getSong());
//		Music music = context.getBean("musicBean",Music.class);

//	MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
//	MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
//	
//	System.out.println(player1);
//	System.out.println(player2);
//		player.playMusic();
//		System.out.println(player.getName());
//		System.out.println(player.getVolume());
//		context.close();
	}

}
