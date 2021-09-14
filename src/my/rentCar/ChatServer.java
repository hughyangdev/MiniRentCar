package my.rentCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer extends Thread{
   
   private ServerSocket server;
   Socket sock = new Socket();
   private final int port=7777;
   Vector<ChatHandler> userV=new Vector<>(5,3);
   public ChatServer() {
      try {
         server=new ServerSocket(port);
         System.out.println("##채팅 서버가 시작되었습니다.##");
         System.out.println("##["+port+"]포트에서 대기중##");
      } catch (IOException e) {
         System.out.println("##채팅서버 시작 중 예외: "+e+"##");
      }
   }
   @Override
   public void run() {
      while(true) {
         try {
            Socket sock=server.accept();
            System.out.println("["+sock.getInetAddress()+"]님이 접속했습니다.");
            ////통신담당 스레드 >>스트림연결해서 대화 주고받을 예정
            ChatHandler handler=new ChatHandler(sock,userV);
            handler.start();
            
            
         } catch (IOException e) {
            System.out.println("##소켓 생성 실패: "+e+"##");
         }
      }
   }
   
   public static void main(String[] args) {
	   new ChatServer().start();
   }
   
}