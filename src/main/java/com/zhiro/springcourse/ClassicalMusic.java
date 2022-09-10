package com.zhiro.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "classicccc.....";
	}


}
