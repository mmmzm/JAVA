package com.pcwk.ehr.ed05;
import java.io.*;
import java.util.Properties;

public class R10_InputStreamReader {

	public static void main(String[] args) {
		Properties prop=System.getProperties();

		//OS encoding: MS949(CP949)
		System.out.println(prop.get("sun.jnu.encoding"));
		
		String fileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J24\\src\\pcwk.txt";
		
		//한글
		try(FileInputStream  inputStream=new FileInputStream(fileName);
			InputStreamReader reader=new InputStreamReader(inputStream,"UTF-8")	;
				){
			int data = 0;
			while( (data=reader.read()) !=-1) {
				System.out.print((char)data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------------------------------");
		System.out.println("-프로그램 종료-");
		System.out.println("------------------------------");
		
	}

}
//MS949
//public class FilterInputStream
//extends InputStream
//A FilterInputStream contains some other input stream, which it uses as its basic source of data, possibly transforming the data along the way or providing additional functionality. The class FilterInputStream itself simply overrides all methods of InputStream with versions that pass all requests to the contained input stream. Subclasses of FilterInputStream may further override some of these methods and may also provide additional methods and fields.
//----------------------------------------------------------------------------------------------------------
//public int read(byte[] b,
//                int off,
//                int len)
//         throws IOException
//Reads up to len bytes of data from this input stream into an array of bytes. If len is not zero, the method blocks until some input is available; otherwise, no bytes are read and 0 is returned.
//This method simply performs in.read(b, off, len) and returns the result.
//
//Overrides:
//read in class InputStream
//Parameters:
//b - the buffer into which the data is read.
//off - the start offset in the destination array b
//len - the maximum number of bytes read.
//Returns:
//the total number of bytes read into the buffer, or -1 if there is no more data because the end of the stream has been reached.
//Throws:
//NullPointerException - If b is null.
//IndexOutOfBoundsException - If off is negative, len is negative, or len is greater than b.length - off
//IOException - if an I/O error occurs.
//See Also:
//in
//오늘은 즐거운 금요일^^
//------------------------------
//-프로그램 종료-
//------------------------------