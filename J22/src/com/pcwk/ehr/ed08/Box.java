package com.pcwk.ehr.ed08;

public class Box<T> {

	private T content;//member  지네릭스

	public Box() {
		super();
	}

	public Box(T content) {//생성자 지네릭스
		super();
		this.content = content;
	}

	public T getContent() {//return 메서드  지네릭스
		return content;
	}

	public void setContent(T content) {//메서드 파람 지네릭스
		this.content = content;
	}
	
	
	
}
