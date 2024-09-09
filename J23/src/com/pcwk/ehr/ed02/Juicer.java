package com.pcwk.ehr.ed02;

public class Juicer {

	
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		
		String tmp = "";
		
		for(Fruit f   :box.getList()) {
			tmp += f.toString()+ " ";
		}
		
		return new Juice(tmp);
	}
}
