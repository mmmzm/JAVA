package com.pcwk.ehr.ed03;
import java.text.MessageFormat;

public class R01_MessageFormat {

	public static void main(String[] args) {
		
		
		String tableName = "BOARD";
		String msg       = "INSERT INTO "+tableName+ "  VALUES ({0},''{1}'',''{2}'',''{3}'',''{4}'');";
		//alt+shift+a
		Object[][] boardData = {
				{1,"제목1","내용1","2024-04-04","admin"},
				{2,"제목2","내용2","2024-04-04","admin"},
				{3,"제목3","내용3","2024-04-04","admin"},
				{4,"제목4","내용4","2024-04-04","admin"},
				{5,"제목5","내용5","2024-04-04","admin"}			
		};
		
		//INSERT INTO BOARD VALUES (1,'제목1','내용1','2024-04-04','admin');
		
		MessageFormat mf=new MessageFormat(msg);
		//System.out.println(boardData.length);
		
		for(int i=0;i<boardData.length;i++) {
			System.out.println(mf.format(boardData[i]));
		}
	}

}
//INSERT INTO BOARD  VALUES (1,'제목1','내용1','2024-04-04','admin');
//INSERT INTO BOARD  VALUES (2,'제목2','내용2','2024-04-04','admin');
//INSERT INTO BOARD  VALUES (3,'제목3','내용3','2024-04-04','admin');
//INSERT INTO BOARD  VALUES (4,'제목4','내용4','2024-04-04','admin');
//INSERT INTO BOARD  VALUES (5,'제목5','내용5','2024-04-04','admin');


