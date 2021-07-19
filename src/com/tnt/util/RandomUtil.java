package com.tnt.util;

import java.util.Random;

public class RandomUtil {
	private static Random random = new Random();
	public static int getRandomCode(){
		return (random.nextInt(9000)+1000);//[1000,9999]   => [0, 8999]+1000
	}
}
