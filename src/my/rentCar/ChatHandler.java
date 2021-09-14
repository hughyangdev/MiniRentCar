package my.rentCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;


public class ChatHandler extends Thread {
   Socket sock;
   Vector<ChatHandler> userV;
   ObjectInputStream in;
   ObjectOutputStream out;
   boolean isStop = false;
   
   public ChatHandler(Socket sock, Vector<ChatHandler> userV) {
      this.sock=sock;
      this.userV=userV;
      this.userV.add(this);
      try {
         in=new ObjectInputStream(this.sock.getInputStream());
         out=new ObjectOutputStream(this.sock.getOutputStream());
      } catch (IOException e) {
         System.out.println("ChatHandler()예외 :"+e);
      }
   }
   
   @Override
   public void run() {
      
	   try {
         
            //클에게 메시지를 보내기 위한 스트림 연결
            out.writeUTF("안녕하세요. 제주도렌터카 입니다.");
            out.flush();
            out.writeUTF("문의사항 및 숫자를 알려주세요.");
            out.flush();
            out.writeUTF("1.예약안내\r\n"+"2.대여안내\r\n"+"3.반납안내\r\n"+"4.지점안내\r\n");
            out.flush();
            
            //클이 보내오는 메시지를 들을 스트림 얻기
            
            //반복문 돌면서 클이 보내오는 메시지를 듣고 메시지를 분석한다.
            String cMsg="";
            while((cMsg=in.readUTF())!=null) {
               System.out.println("cMsg>> "+cMsg);
               if(cMsg.startsWith("예약")||cMsg.startsWith("예약방법")||cMsg.startsWith("1")) {
                  out.writeUTF("예약방법은 아래 방법으로 가능합니다.");
                  out.flush();
                  out.writeUTF("회원 로그인→원하는 날짜(기간),지점,차량 선택 → 예약완료");
                  out.flush();               
               }else if(cMsg.startsWith("대여")||cMsg.startsWith("대여안내")||cMsg.startsWith("2")){
                  out.writeUTF("대여절차는 아래 방법과 같습니다.");
                  out.flush();
                  out.writeUTF("홈페이지를 통하여 예약완료→지점방문");
                  out.flush();
                  out.writeUTF("→고객 정보 확인→대여료 결제→차량 확인 및 계약서작성");
                  out.flush();
               }else if(cMsg.startsWith("반납")||cMsg.startsWith("반납안내")||cMsg.startsWith("3")) {
                  out.writeUTF("반납절차는 아래 방법과 같습니다.");
                  out.flush();
                  out.writeUTF("지점방문→자동차 키 반납→ 차량확인→추가 비용 정산");
                  out.flush();      
               }else if(cMsg.startsWith("지점")||cMsg.startsWith("지점안내")||cMsg.startsWith("4")) {
                  out.writeUTF("홈페이지를 통해 제주도 내의 위치를 확인할 수 있으며,");
                  out.flush();
                  out.writeUTF("제주공항점, 서귀포점에 위치하고 있습니다.");
                  out.flush();   
               }else {
                  out.writeUTF("이 문의사항은 해당 지점으로 연락 부탁드립니다!");
               }
               out.flush();
            }
            //연결지원 close()
            if(in!=null) in.close();
    		if(out!=null) out.close();
    		if(sock!=null) sock.close();
            
         } catch (IOException e) {
            System.out.println("##소켓 생성 실패: "+e+"##");
         }
      }
   }
   
