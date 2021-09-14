package my.rentCar;
import java.net.*;
import java.io.*;
import java.util.*;

public class RentCarServer {

	private ServerSocket server;
	Vector<RentCarHandler> v = new Vector<RentCarHandler>();
	
	public RentCarServer(final int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("##서버가 시작됐습니다.##");	
			while(true) {
				Socket sock = server.accept();
				System.out.println("["+sock.getInetAddress()+"]님이 접속함..");
				RentCarHandler rent = new RentCarHandler(this, sock);
				v.add(rent);
				rent.start();
			}
			
		}catch(IOException e) {
			System.out.println("서버 시작 중 예외: "+e.getMessage());
		}
	} // 생성자-------------

	public static void main(String[] args) {
		new RentCarServer(7777);
		
	} // main()---------------

}/////////////////////
