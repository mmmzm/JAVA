package com.pcwk.ehr.ed01;

public class R08_UserException {

	public static void main(String[] args) {

		try {
			checkAge(17);
		} catch (AconException e) {
			System.out.println("AconException:"+e.getMessage());
		}catch(Exception e) {
			
		}
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│프로그램 종료                                            │");
		System.out.println("└─────────────────────────────────┘");				
	}

	
	static void checkAge(int age) throws AconException {
		if(age<18) {
			throw new AconException("나이는 18세 이상 이어야 합니다.");
			
		}else {
			System.out.println("사이트 Access가능 합니다.");
		}
	}
	
	
}
//*AconException*
//AconException:나이는 18세 이상 이어야 합니다.
//┌─────────────────────────────────┐
//│프로그램 종료                                            │
//└─────────────────────────────────┘
