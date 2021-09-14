/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.rentCar;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JLabel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ChatGui extends javax.swing.JFrame implements Runnable {
   String myMsg = "";
   Socket sock = null;
   ObjectInputStream in;
   ObjectOutputStream out;
   StyledDocument doc;
   SimpleAttributeSet attr;

   public ChatGui() {
      setTitle("::1:1문의하기::");
      initComponents();
      doc=tpMsg1.getStyledDocument();
      attr=new SimpleAttributeSet();
      try {
         sock=new Socket("127.0.0.1", 7777);
         out=new ObjectOutputStream(this.sock.getOutputStream());
         in=new ObjectInputStream(this.sock.getInputStream());
         Thread tr=new Thread(this);
         tr.start();
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      InputMsg = new javax.swing.JTextField();
      jScrollPane1 = new javax.swing.JScrollPane();
      tpMsg1 = new javax.swing.JTextPane();
      btexit = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 153, 51));

      jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
      jLabel1.setText("1:1 문의하기");

      InputMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 3));
      InputMsg.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            InputMsgActionPerformed(evt);
         }
      });

      tpMsg1.setEditable(false);
      tpMsg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 3));
      jScrollPane1.setViewportView(tpMsg1);

      btexit.setText("종료");
      btexit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btexitActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(InputMsg))
                  .addGroup(jPanel1Layout.createSequentialGroup().addGap(166, 166, 166).addComponent(jLabel1)
                        .addGap(0, 169, Short.MAX_VALUE))
                  .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1)))
                  .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup().addGap(178, 178, 178)
                  .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jLabel1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(InputMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btexit,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(22, 22, 22)));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
            jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
      layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
            jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

      pack();
   }// </editor-fold>

   private void InputMsgActionPerformed(java.awt.event.ActionEvent evt) {
      // 메시지 입력전송
      String msg = InputMsg.getText();
      String from = "Client";
      //showChat(from, msg);
      
         showChat(from,msg);
         InputMsg.setText("");
         InputMsg.requestFocus();
         try {
            out.writeUTF(msg);
            out.flush();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
         
      
   }// while-------

   private synchronized void showChat(String from, String fromMsg) {
      String msg = from + ">>" + fromMsg + " \r\n";
      JLabel lb = new JLabel(msg);
//      attr = new SimpleAttributeSet();
//      if (from.equals("Client")) {
//         StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
//      }else {
         
//      }
      lb.setOpaque(true);
      lb.setPreferredSize(new Dimension(600, 40));
      lb.setForeground(Color.BLACK);
      lb.setBackground(Color.yellow);
      StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
      setStyle(lb, msg, attr);
      
   }
   
   private synchronized void showChatServer(String fromMsg) {
      String msg = "Server>>" + fromMsg + " \r\n";
      JLabel lb = new JLabel(msg);
      lb.setOpaque(true);
      lb.setPreferredSize(new Dimension(600, 40));
      lb.setForeground(Color.BLACK);
      lb.setBackground(Color.white);
      StyleConstants.setAlignment(attr, StyleConstants.ALIGN_LEFT);
      
      setStyle(lb, msg, attr);
   }

   private void setStyle(JLabel lb, String msg, SimpleAttributeSet attr) {
      int offset = doc.getEndPosition().getOffset() - 1;
      tpMsg1.setCaretPosition(offset);
      tpMsg1.insertComponent(lb);
      // JLabel은 문자열, 아이콘 형태 등 다양하게 표현 가능
      String enter = "\r\n"; // 엔터값 끼워넣기(줄바꿈 하도록)
      offset = tpMsg1.getCaretPosition();
      try {
         doc.insertString(offset, enter, attr);
      } catch (BadLocationException e) {
         e.printStackTrace();
      }
      // 문단정렬방식 설정
      System.out.println("doc==="+doc+", msg="+msg+", attr="+attr);
      doc.setParagraphAttributes(offset + 2, msg.length(), attr, true);
      tpMsg1.setCaretPosition(offset + 2);
   }

   private void btexitActionPerformed(java.awt.event.ActionEvent evt) {
      // 종료버튼
      //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      this.setVisible(false);
      this.dispose();
      
      
   }

   /**
    * @param args the command line arguments
    */

   // Variables declaration - do not modify
   private javax.swing.JTextField InputMsg;
   private javax.swing.JButton btexit;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   javax.swing.JTextPane tpMsg1;
   // End of variables declaration

   @Override
   public void run() {
      // TODO Auto-generated method stub
      try {
         String serverMsg=in.readUTF();
         showChatServer(serverMsg);
          serverMsg=in.readUTF();
         showChatServer(serverMsg);
          serverMsg=in.readUTF();
         showChatServer(serverMsg);
         while((serverMsg=in.readUTF())!=null) {
            showChatServer(serverMsg);
         }
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
   }
}