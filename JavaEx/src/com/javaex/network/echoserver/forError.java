// 분명 내가 친 코딩엔 문제가 없는거같은데...혹시나 싶어서 일단 교수님 코딩
// 임시방편으로 복사해둔것

package com.javaex.network.echoserver;

public class forError {

}
// 클라이언트 코드
/*
package com.javaex.network.echoserver.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		//	1. Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다]");
			//	2. 서버 정보 확보
			InetSocketAddress remote =
					new InetSocketAddress("127.0.0.1", // 서버의 IP
							10000);	//	서버 포트 정보
			//	3. 서버에 접속 시도
			socket.connect(remote);	//	connect 시도
			
			System.out.println("[서버에 연결 되었습니다.]");
			
			//	서버로 메시지 전송 : Stream IO 활용
			//	OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, // Main Stream
					"UTF-8");	//	텍스트 인코딩 정보
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	서버로부터 메시지 수신을 위한 InputStream 확보
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
//			String message = "테스트 요청 메시지";
//			bw.write(message);
//			System.out.println("클라이언트 전송 메시지:" + message);
//			bw.close();
			
			
			//	키보드에서 입력을 받아서 서버로 전송
			BufferedReader keyReader = new BufferedReader(
					new InputStreamReader(System.in));
			
			//	/q -> 전송 중지
			while(true) {	//	무한 루프
				String message = keyReader.readLine(); // 한 줄 읽기
				
				if (message.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				
				bw.write(message);	//	메시지 전송
				bw.newLine();	//	새 라인
				bw.flush();	//	버퍼 비우기
				System.out.println("전송할 메시지:" + message);
				
				//	수신 메시지 확인
				String rcvMsg = br.readLine();
				System.out.println("수신한 메시지:" + rcvMsg);
			}
			
			//	종료
			System.out.println("<클라인트 종료>");
			
			//	스트림 닫기
			keyReader.close();
			bw.close();
			br.close();
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();	// 자원 정리
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
*/









////////////////////////////// 서버코드
/*
 * package com.javaex.network.echoserver.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//	v2. 멀티 Thread 버전의 Echo Server
public class Server {

	public static void main(String[] args) {
		//	1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//	2. bind (주소, 포트 연결)
			InetSocketAddress local = 
					new InetSocketAddress("127.0.0.1",	//	localhost
							10000); //	PORT
			serverSocket.bind(local);	//	bind
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			//	3. 접속 대기 : 여러 클라이언트의 접속을 허용
			while(true) {
				Socket socket = serverSocket.accept();
				//	새 서버 쓰레드를 만들어서 로직을 수행
				Thread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//	서버 소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

 */





















//////////////////////////////서버 스레드 코드
/*package com.javaex.network.echoserver.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	//	필드 : 통신을 위한 소켓
	private Socket socket;
	
	//	생성자 
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	//	run 메서드 오버라이드
	@Override
	public void run() {
		//	클라이언트 접속 이후의 로직
		try {
			InetSocketAddress client = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다]");
			System.out.println(client.getAddress() + ":" + 
					client.getPort());
			
			//	클라이언트로부터 메시지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//	Echo Back을 위한 OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	메시지 읽기
			String message;
			while((message = br.readLine()) != null) {
				System.out.println("수신 메시지:" + message);
				//	Echo Back 
				
				System.out.println("Echo Back:" + message);
				bw.write("[Echo]:" + message);
				bw.newLine();
				bw.flush();
			}
			
			//	후처리
//			System.out.println("[접속이 종료되었습니다.]");
//			System.out.println("==========");
//			System.out.println("<서버 종료>");
			System.out.println("클라이언트 접속 해제");
			//	스트림 닫기
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/