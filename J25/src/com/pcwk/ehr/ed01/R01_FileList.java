package com.pcwk.ehr.ed01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.pcwk.ehr.cmn.StringUtil;

public class R01_FileList {

	public static void main(String[] args) {

		// windows: dir
		// unix : ls -l

		if (args.length != 1) {
			System.out.println("디렉터리 경로를 입력 하세요.");
			System.exit(0);
		}
		String dirPath = args[0];

		System.out.println("dirPath:" + dirPath);

		SimpleDateFormat newSDF = new SimpleDateFormat("yyyy-MM-dd_HHmmss_");
		// yyyy-MM-dd HH24:mm:ss+UUID

		String fileName = newSDF.format(new Date()) + StringUtil.getUUID() + ".txt";
		try {
			PrintStream printStream = new PrintStream(new FileOutputStream(fileName));

			// 디렉터리 목록 객체
			File directory = new File(dirPath);

			// 디렉터리와 파일 목록
			File[] dirFileList = directory.listFiles();

			for (File f : dirFileList) {
				StringBuilder sb = new StringBuilder(200);

				// 파일 이름
				sb.append(String.format("%-23s", f.getName()));

				// 파일 크기
				String fileSize = String.format("%,d", f.length());
				sb.append(String.format("%12s\t", fileSize));

				// -rwx
				// d : diectory
				// - : file
				// r : read 권한.
				// w : write
				// x : executable

				// 권한
				sb.append(f.isFile() == true ? "-" : "d");
				sb.append(f.canRead() == true ? "r" : "-");
				sb.append(f.canWrite() == true ? "w" : "-");
				sb.append(f.canExecute() == true ? "x" : "-");
				sb.append("\t");

				// 최종 수정일
				Date lastModifiedDate = new Date(f.lastModified());

				// yyyy-MM-dd HH24:mm:ss
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				sb.append(sdf.format(lastModifiedDate));
				sb.append("\n");

				// console에 출력
				System.out.print(sb.toString());

				// 파일에 기록
				printStream.print(sb.toString());

			} // for

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
