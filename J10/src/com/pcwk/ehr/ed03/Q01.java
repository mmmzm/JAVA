package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		final int SIZE =10;//행,열
		//int x=0,y=0;
		
		int x = 0;//X좌표
		int y = 0;//Y좌표
		//0:바다
		//1:배
		byte[][] shipBoard = {
				//1 2 3 4 5 6 7 8 9
				 {0,0,0,0,0,0,1,0,0} //1
				,{0,0,0,0,0,0,1,0,0} //2
				,{1,1,1,1,0,0,1,0,0} //3
				,{0,0,0,0,0,0,1,0,0} //4
				,{0,0,0,1,0,0,0,0,1} //5
				,{0,0,0,0,0,0,0,0,0} //6
				,{1,1,0,0,1,0,0,0,0} //7
				,{0,0,0,0,0,0,1,0,0} //8
				,{0,0,0,0,0,0,0,0,0} //9
		};
		char[][]board  =new char[SIZE][SIZE];//10행X10열
		
		for(int i=1;i<SIZE;i++) {
			board[0][i] = (char)(i+'0');//가로 : 123456789
			board[i][0] = (char)(i+'0');//세로 : 123456789
		}
		
		//좌표 입력>33
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력 하세요.(종료는 00)>");
			//33
			String input = scanner.nextLine();
			
			if(input.length() == 2) {//입력(XY)
				x = input.charAt(0) - '0';//51('3')-48('0')
				y = input.charAt(1) - '0';
				
				System.out.printf("x=%d, y=%d%n",x,y);
				
				//x=0,y=0 프로그램 종료
				
				if(x==0 && y==0) {
					break;
				}				
			}//input if			
			
			//다시 입력 : continue
			if(input.length() !=2 || x<=0 || y<=0 ) {
				System.out.println("잘못된 입력 입니다.\n다시 입력해 주세요.");
				continue;
			}
			
			//배가 있는 곳을 찾는다.
			//1~9좌표,
			//shipBoard 배열이므로 0번지 부터 시작
			//따라서 1만큰 빼주어야 한다.
			board[x][y]= (shipBoard[x-1][y-1]==1)?'O':'X';
			
			
			//board배열의 내용 출력
			for(int i=0;i<SIZE;i++) {
				System.out.println(board[i]);
			}
			
			
		}//while end
		System.out.println("┌───────────────────┐");
		System.out.println("│프로그램 종료                  │");
		System.out.println("└───────────────────┘");
		

	}

}


