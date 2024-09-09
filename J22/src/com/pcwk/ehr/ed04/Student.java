package com.pcwk.ehr.ed04;

public class Student implements Comparable {
	String name;
	int ban;
	int no;
	
	int kor;
	int eng;
	int math;
	
	//alt+shift+s
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	
	public float getAverage() {
		return (int)((getTotal()/3.0f)*10+0.5)/10.0f;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total="+getTotal() +", avg="+getAverage()  + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		//음수, 0, 양수
		int result = name.compareTo( ((Student)o).name); 
		System.out.println(name+","+((Student)o).name +"=>"+result);
		return result;
	}
	
	
	
}
