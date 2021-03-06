// 시작하기에 앞서 bit-java 폴더가 git-repositories 여기에 있는데
// 이 깃레퍼지토리 안에 javaEx와 files 폴더가 들어가야지 정상 작동이 된다
// 근데 난 깃레퍼지토리랑 javaex랑 따로 되어있어서 file폴더를 따로 설정이 안되더라
// 결과적으로 작동이 안됨. 실행하면 files 폴더 안에 새로운 txt파일들이 나와야되는데
// 성공을 해도 안나옴

package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	
		static String rootPath = System.getProperty("user.dir") +
				"\\files\\";
	public static void main(String[] args) {
		//	rootPath 내부의 정보 확인
		File root = new File(rootPath);
		//	실제로 있는 파일인지 확인
		System.out.println("rootPath exists ? " + root.exists());
		
		//	디렉터리 만들기
		if (!root.exists()) {
			root.mkdirs();
		}
		
		//	파일의 정보 확인
		printFileInfo(root);

		//	디렉토리 내부에 파일을 생성
		File file = new File(rootPath + "myFile.txt");
		if (!file.exists()) {	//	파일이 없으면
			//	생성
			try {
				file.createNewFile(); // 실제 파일 생성
				System.out.println("파일 생성!");
			} catch (IOException e) {
				System.err.println("파일을 생성하지 못했어요!");
			}
		}
		
		printFileInfo(root);
		
		//	파일 삭제
		file.delete(); // myFile.txt 삭제
		printFileInfo(root);
	}
	
	private static void printFileInfo(File f) {
		System.out.println("----------");
		
		//	이 파일이 디렉터리인가?
		if (f.isDirectory()) {
			//	내부 파일 목록 확인
			System.out.println("Directory:" + f.getName());
			//	목록 확인
			File[] files = f.listFiles();
			
			for (File file: files) {
				System.out.print(file.isDirectory() ? "d ": "f ");
				System.out.printf("%s - %d%n", 
						file.getName(), file.length());
			}
		} else {
			//	파일이 아니면
			System.out.println("File:" + f.getName());
		}
		System.out.println("----------");
	}

}






