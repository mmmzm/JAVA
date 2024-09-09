package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;
import java.util.Random;


public class R04_Random implements PLog {

	public static void main(String[] args) {
		//Random객체 생성
		Random  random=new Random();
		
		//0~9사이 난수 발생
		int randomNumber = random.nextInt(10);
		System.out.println("0~9사이 난수:"+randomNumber);
		
		//1-100사이 난수 발생
		//new Random().nextInt(6)+1;// nextInt(6) -> 0<=x<6   => 1<=x<7
		randomNumber = random.nextInt(100)+1;
		System.out.println("1~100사이 난수:"+randomNumber);
		
		//임의의 boolean값
		boolean randomBoolean = random.nextBoolean();
		System.out.println("randomBoolean:"+randomBoolean);
		
		//0.0부터 1.0사이의 임이의 난수
		double randomDouble = random.nextDouble();
		System.out.println("randomDouble:"+randomDouble);//randomDouble:0.9784192905022682

	}

}
