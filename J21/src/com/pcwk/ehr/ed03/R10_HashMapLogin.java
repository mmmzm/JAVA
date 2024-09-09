package com.pcwk.ehr.ed03;

import java.util.*;


public class R10_HashMapLogin {

	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String, String>();
		map.put( "sun","a4321");
		map.put( "moon","b4321");
		map.put( "java","c4321");
		
		Scanner  scanner=new Scanner(System.in);
		
		try {
			
			while(true) {
				
				System.out.println("id와 비번을 입력 하세요.");
				System.out.print("id를 입력하세요>>");
				
				String userId = scanner.nextLine().trim();
				
				
							
				//비번 입력
				System.out.print("비번을 입력 하세요>>");
				String passwd = scanner.nextLine();
				System.out.println("userId:"+userId);
				System.out.println("passwd:"+passwd);
				//key에 존재 유무: id존재 check
				if(map.containsKey(userId)==false) {
					System.out.println("--------------------------------");
					System.out.println("-id를 확인하세요. 다시 입력해 주세요.");
					System.out.println("--------------------------------");
					continue;
				}else {
					
					//id비번 일치
					if(map.get(userId).equals(passwd)  ) {
						System.out.println("로그인 되었습니다.");
						break;
					}else {
						System.out.println("비번을 확인하세요.");
					}
				}
				
				
				
			}// while end
		}catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}finally {
			if(null != scanner) {
				scanner.close();
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println("-프로그램 종료!");
		System.out.println("--------------------------------");
		
	}// main end

}//class end
//id를 입력하세요>>java
//비번을 입력 하세요>>c4321
//userId:java
//passwd:c4321
//로그인 되었습니다.
//--------------------------------
//-프로그램 종료!
//--------------------------------