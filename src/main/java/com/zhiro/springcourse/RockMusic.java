package com.zhiro.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	List<String> list;
	public RockMusic () {
		list = new ArrayList<>();
		list.add("rockkkk....1");
		list.add("rockkkk....2");
		list.add("rockkkk....3");
	}
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return list.get(new Random().nextInt(list.size()));
	}

}
