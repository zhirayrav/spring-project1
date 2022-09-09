package com.zhiro.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	List<String> list;
	public ClassicalMusic() {
		list = new ArrayList<>();
		list.add("classiccccc....1");
		list.add("classiccccc....2");
		list.add("classiccccc....3");
	}
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return list.get(new Random().nextInt(list.size()));
	}


}
