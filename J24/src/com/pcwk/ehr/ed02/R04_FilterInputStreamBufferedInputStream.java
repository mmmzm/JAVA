package com.pcwk.ehr.ed02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class R04_FilterInputStreamBufferedInputStream {

	public static void main(String[] args) {

		String filePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J24\\src\\pcwk.txt";

		// Closeable를 implements 받으므로 가능
		try (FileInputStream fis = new FileInputStream(filePath);
				FilterInputStream filterInputStream = new BufferedInputStream(fis);) {

			// 한 바이트씩 데이터를 읽어와서 화면에 출력
			int data;
			while ((data = filterInputStream.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
