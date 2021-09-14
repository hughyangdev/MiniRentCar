package my.rentCar;
import java.net.*;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class RentCarHandler extends Thread {

	private RentCarServer server;
	private Socket sock;
	Vector<RentCarHandler> userV;
	
	ObjectOutputStream out;
	ObjectInputStream in;
	
	String userid;
	boolean isStop = false;
	
	public RentCarHandler(RentCarServer server, Socket sock) {
		this.server = server;
		this.sock = sock;
		try {
			out = new ObjectOutputStream(this.sock.getOutputStream());
			in = new ObjectInputStream(this.sock.getInputStream());
		}catch(IOException e) {
			System.out.println("RentCarHandler() 예외: "+e.getMessage());
		}
	} // 생성자------------
	
	@Override
	public void run() {
		try {
			userid = in.readUTF();
			System.out.println(userid+"님이 로그인 하였습니다.");
//			while(true) {
//				String user = in.readUTF();
//				if() {// user가 로그아웃하면
//					closeAll();
//				}
//				
//			} // while-------------
			closeAll();
		}catch(Exception e) {
			System.out.println("RentCarHandler run() 중 예외: "+e.getMessage());
		}
	} // run()------------
	
	public void closeAll() throws IOException {
		if(out!=null) out.close();
		if(in!=null) in.close();
		if(sock!=null) sock.close();
	} // closeAll()--------------
	

}/////////////////////////
