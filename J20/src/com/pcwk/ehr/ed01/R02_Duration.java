package com.pcwk.ehr.ed01;
import java.time.*;


public class R02_Duration {

	public static void main(String[] args) {
		LocalTime  startTime=LocalTime.of(10,19,30);
		LocalTime  endTime=LocalTime.of(17,50,1);
		
		//두 시간의 차이 계산
		Duration duration=Duration.between(startTime, endTime);
		
		System.out.println("두 시간의 차이: "+duration.toHours()+" 시간"
				+duration.toMinutes()+"분 "
				+duration.toMillis() +"초");
		
		LocalTime futureTime = startTime.plus(duration);
		System.out.println("futureTime:"+futureTime);

	}

}
//두 시간의 차이: 7 시간450분 27031000초
//futureTime:17:50:01