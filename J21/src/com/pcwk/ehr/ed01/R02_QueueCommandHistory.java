package com.pcwk.ehr.ed01;

import java.util.*;


public class R02_QueueCommandHistory {

	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
	
		//Quit 입력 : 종료
		//history 입력 : 명령어 목록 출력
		Queue<String>  history = new LinkedList<String>();
		
		Scanner scanner=new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print(">>");
				
				String command = scanner.nextLine();
				
				history.add(command);
				
				if(history.size() > MAX_SIZE) {
					System.out.println("삭제 명령어 :"+history.remove());
				}
				
				if(command.equalsIgnoreCase("quit")) {
					System.out.println("프로그램 종료!");
					break;
				}else if(command.equalsIgnoreCase("history")) {
					System.out.println(history);
				}else if(command.equalsIgnoreCase("help")) {
					System.out.println("quit: 프로그램 종료!");
					System.out.println("history: 명령어 목록 보기");
					System.out.println("help: 도움말!");
				}
				
			}//--while end
			
			
		}catch(ClassCastException e) {
			System.out.println("ClassCastException:"+e.getMessage());
		}catch(IllegalStateException e) {
			System.out.println("IllegalStateException:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}finally {
			scanner.close();
		}
		
		
	}

}
//>>cd ..
//>>dir
//>>cls
//>>history
//[cd .., dir, cls, history]
//>>type Hello.java
//>>dir
//삭제 명령어 :cd ..
//>>history
//삭제 명령어 :dir
//[cls, history, type Hello.java, dir, history]
//>>Quit
//삭제 명령어 :cls
//프로그램 종료!
