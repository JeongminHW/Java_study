package net;
//프로토콜을 사용하여 주고받는 기능 구현

public class ChatProtocol3 {
	//(C->S) ID : aaa
	public static final String ID = "ID";
	//(C->S) CHAT : 받는아이디;메시지 EX)CHAT:bbb;밥먹자
	//(S->C) CHAT : 보낸아이디;메시지 EX)CHAT:aaa;밥먹자
	public static final String CHAT = "CHAT";
	//(C->S) CHATALL:메시지
	//(S->C) CHATALL:[보내는아이디]메시지
	public static final String CHATALL = "CHATALL";
	//(S->C) CHATLIST : aaa;bbb;ccc;홍길동;
	public static final String CHATLIST = "CHATLIST";
	//(C->S) CHAT : 받는아이디;메시지 EX)MESSAGE:bbb;밥먹자
	//(S->C) CHAT : 보낸아이디;메시지 EX)MESSAGE:aaa;밥먹자
	public static final String MESSAGE = "MESSAGE";
	public static final String MSGLIST = "MSGLIST";
	public static final String MODE1 = ":";
	public static final String MODE2 = ";";

	public static void main(String[] args) {

	}

}
