package com.pcwk.ehr.ed05;
import com.pcwk.ehr.ed04.Student;
import java.util.*;

public class Main {

	
	static int getGroupCount(TreeSet tset, int from, int to) {
		
		Student s1=new Student("", 0, 0, from, from, from);
		Student s2=new Student("", 0, 0, to, to, to);
		
		
		return tset.subSet(s1, s2).size();
	}
	
	
	
	public static void main(String[] args) {
		TreeSet set=new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//o1평 - o2평균
				
				if(o1 instanceof Student  && o2 instanceof Student) {
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					
					return (int) (s1.getAverage() - s2.getAverage());
				}
				
				return -1;//자리 교환 없음
			}
			
		});
		
		//평균 기준 정렬 : 80점은 안자바 삭제.
		set.add(new Student("홍길동",1,1,100,100,100)); 
		set.add(new Student("남궁성",1,2,90,70,80)); 
		set.add(new Student("김자바",1,3,80,80,90)); 
		set.add(new Student("이자바",1,4,70,90,70)); 
		set.add(new Student("안자바",1,5,60,100,80)); 
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
		
		
	}
}
//Student [name=이자바, ban=1, no=4, kor=70, eng=90, math=70, total=230, avg=76.7]
//Student [name=남궁성, ban=1, no=2, kor=90, eng=70, math=80, total=240, avg=80.0]
//Student [name=김자바, ban=1, no=3, kor=80, eng=80, math=90, total=250, avg=83.3]
//Student [name=홍길동, ban=1, no=1, kor=100, eng=100, math=100, total=300, avg=100.0]
//[60~69] :0
//[70~79] :1
//[80~89] :2
//[90~100] :1