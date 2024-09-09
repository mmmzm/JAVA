package com.pcwk.ehr.ed02;
public class Time {
    private int hour;//시간
    private int minute;//분
    private float second;//초
    
            
    /**
     * 시간 조회
     * @return hour
     */
    public int getHour(){
        return hour;
    }
    
    /**
     * 시간 설정 : 0 ~ 23
     * @param hour
     */
    public void setHour(int hour) {
    	if(!(0<=hour && hour<=23)) { //hour>0 || hour> 23
    		System.out.println("시간 0 ~23범위내 입니다.\n"+hour);
    		return;
    	}
    	this.hour=hour;
    }
    
    /**
     * 분 조회
     * @return minute
     */
    public int getMinute() {
    	return minute;
    }
    
    /**
     * 분 값을 설정 : 0<=m<=59
     * @param m
     */
    public void setMinute(int m) {
    	if(m<0 || m > 59) {
    		System.out.println("분 은 0~59사이 입니다.\n m="+m);
    		return;
    	}
    	minute = m;
    }

    /**
     * 초 조회
     * @return second
     */
    public float getSecond() {
    	return second;
    }

    /**
     * 
     * @param second
     */
	public void setSecond(float second) {
		if(second<0.0f || second>59.0f) {
			System.out.println("초는  0~59사이 입니다.\n second="+second);
			return;
		}
		
		this.second = second;
	}
    
    

    
    
    
    
    
}
