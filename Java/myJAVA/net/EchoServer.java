package net;

import java.net.*;
import java.io.*;

public class EchoServer {

	public static final int PORT = 8000;

	public EchoServer() {
		try {
			int cnt = 0;
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start.....");
			while (true) {
				Socket sock = server.accept(); // 클라이언트 대기
				EchoThread et = new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println(cnt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 클라이언트를 각자 대응하기 위한 쓰레드 상속 클래스
	class EchoThread extends Thread {
		Socket sock;
		BufferedReader in;
		PrintWriter out;

		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				//클라이언트가 최초로 받는 메시지
				out.println("Hello Enter Bye to exit"); //println()을 사용해야 통신 에러가 나지 않음
				while(true) {
					String line = in.readLine(); //대기상태
					if(line == null) break;
					else {
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("Bye")) break;
					}
				}
				in.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new EchoServer();
	}

}
