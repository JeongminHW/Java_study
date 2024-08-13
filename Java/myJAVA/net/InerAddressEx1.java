package net;

import java.net.*;
public class InerAddressEx1 {

	public static void main(String[] args) {
		try {
			//ip 및 도메인 객체화
			InetAddress add = InetAddress.getLocalHost();
			System.out.println(add.getHostName());
			System.out.println(add.getHostAddress());
			
			//도메인 -> ip
			add = InetAddress.getByName("auction.co.kr");
			System.out.println(add.getHostAddress());
			
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			for(int i = 0; i<adds.length; i++) {
				System.out.println(adds[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
