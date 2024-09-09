package com.pcwk.ehr.ed02;
import java.io.*;


public class R05_PersonDeserialized {

	public static void main(String[] args) {
		// D:\JAP_20249311\01_JAVA\WORKSPACE\J25\pcwk_person.ser
		
		String fileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J25\\pcwk_person.ser";
		
		//역직렬화
		try(FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Person person01 =  (Person) ois.readObject();
			Person person02 =  (Person) ois.readObject();
			
			System.out.println(person01.toString());
			System.out.println(person02.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("─────────────────────");
		System.out.println("객체 읽기 완료!");
		System.out.println("─────────────────────");
	}

}
//Person [name=Bob, age=24]
//Person [name=Ann, age=21]
//─────────────────────
//객체 읽기 완료!
//─────────────────────