package com.pcwk.ehr.ed10;

import java.util.List;

public interface Parseable<T> {
	
	/**
	 * 
	 * @param type
	 */
	public abstract  List<T> parse();

}
