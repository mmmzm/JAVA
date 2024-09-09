package com.pcwk.ehr.ed04;

public class VCR implements IVCR {

	protected int counter;
	
	public VCR() {
		
	}
	
	@Override
	public void play() {
		System.out.println("Tape을 재생한다.");
	}
	
	@Override
	public void stop() {
		System.out.println("재생을 멈춘다.");
	}	
	
	@Override
	public void reset() {
		counter = 0;
	}

	@Override
	public int getCounter() {
		return counter;
	}

	@Override
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	
}
