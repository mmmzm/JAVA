package com.pcwk.ehr.ed01;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class R03_MP3_Play {

	public static void main(String[] args) {
		//D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\music\TheShow.mp3
		String filePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J24\\src\\music\\TheShow.mp3";
		
		//mp3 File읽기
		FileInputStream  fis = null;
		Player           player = null;
		try {
			fis=new FileInputStream(filePath);
			
			player=new Player(fis);
			//mp3파일 재생
			player.play();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		} finally{
			if(null != player) {
				//재생이 끝난 후에 Player 닫기
				player.close();
			}
			
			
			if(null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		

	}

}
