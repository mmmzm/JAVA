package com.pcwk.ehr.ed05;

public interface Parseable {
	/**
	 * XML,JSON 파싱
	 * @param fileName
	 */
	public abstract void parse(String fileName);
}
