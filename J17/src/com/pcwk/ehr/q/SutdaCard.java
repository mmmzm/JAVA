package com.pcwk.ehr.q;

public class SutdaCard {

	int num;
	boolean isKwang;
	
	
	public SutdaCard() {
		this(1,true);
	}


	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isKwang ? 1231 : 1237);
		result = prime * result + num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SutdaCard other = (SutdaCard) obj;
		if (isKwang != other.isKwang)
			return false;
		if (num != other.num)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return num + (isKwang ? "K":"");
	}
	
}
