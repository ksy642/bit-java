// 마찬가지로 files 폴더에 txt 새로운 파일 생성 불가능이다 ㅡㅡ;
// 근데 이건 files 폴더에 생성이 된다? 뭔데???

package com.javaex.io.charstream;
import java.io.*;
public class CharStreamEx {
	static String rootPath = System.getProperty("user.dir") +
			"\\files\\";
	static String filename = rootPath + "char.txt";
	
	public static void main(String[] args) {
		// Writer
		try {
			Writer fw = new FileWriter(filename);
			// 출력
			fw.write("Bit Computer\r\n");
			fw.write("Java Programming\r\n");
			fw.write("2020.08\r\n");
			
			// 버퍼 비우기
			fw.flush();
			fw.close();
			
			System.out.println("파일 저장 완료!");
			
			// 파일 읽어오기
			Reader fr = new FileReader(filename);
			
			int data = 0; // 데이터 저장변수
			while((data = fr.read()) != -1) {
				// 실제 데이터는 char -> 다운캐스팅
				System.out.print((char)data);
			} fr.close();
			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
