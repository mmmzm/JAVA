package com.pcwk.ehr.ed03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class R04_PersonSerialization {

	public static void main(String[] args) {

		// 객체 생성
		Person person01 = new Person("Bob", 24,"a4321");
		Person person02 = new Person("Ann", 21,"a4321");

		// 객체를 파일에 기록
		//ObjectOutputStream는 AutoCloseable 인터페이스 try-with-resource로 처리가능 
		try (FileOutputStream fis = new FileOutputStream("pcwk_person.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fis);) {
			oos.writeObject(person01);
			oos.writeObject(person02);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("─────────────────────");
		System.out.println("pcwk_person.ser 생성완료");
		System.out.println("─────────────────────");
	}

}
