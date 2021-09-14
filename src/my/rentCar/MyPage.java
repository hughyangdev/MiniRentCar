package my.rentCar;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;

public class MyPage extends javax.swing.JPanel {
   MainGui parent;
   FindCar find;
   BookingDAO bdao = new BookingDAO();
   MemberDAO mdao = new MemberDAO();

   public MyPage(MainGui parent) {
      this.parent = parent;
      pInfo = new javax.swing.JPanel();
      lbCarImg = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      btCancel = new javax.swing.JButton();
      lbCarName = new javax.swing.JLabel();
      lbCarRentTime = new javax.swing.JLabel();
      lbCarReturnTime = new javax.swing.JLabel();
      lbName = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      lbLoc = new javax.swing.JLabel();
      jPup = new javax.swing.JPanel();
      lbLogo = new javax.swing.JLabel();
      btLogout = new javax.swing.JButton();
      btCustom = new javax.swing.JButton();
      btUpdate = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel9 = new javax.swing.JLabel();

      setBackground(new java.awt.Color(255, 204, 102));
      setPreferredSize(new java.awt.Dimension(500, 700));

      pInfo.setBackground(new java.awt.Color(255, 224, 122));

      lbCarImg.setText("");
      lbCarImg.setIcon(new javax.swing.ImageIcon("src/images/null.png"));

      jLabel3.setText("대       여 : ");

      jLabel4.setText("반       납 :");

      btCancel.setBackground(new java.awt.Color(255, 102, 102));
      btCancel.setText("예약취소 / 예약");
      btCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btCancel.setPreferredSize(new java.awt.Dimension(300, 19));
      btCancel.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCancelActionPerformed(evt);
         }
      });

      lbCarName.setText("차량 이름 : ");

      lbCarRentTime.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
      lbCarRentTime.setForeground(new java.awt.Color(51, 51, 255));
      lbCarRentTime.setText("");

      lbCarReturnTime.setText("");

      lbName.setText("");

      jLabel5.setText("지점 위치 : ");

      lbLoc.setText("");

      javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
      pInfo.setLayout(pInfoLayout);
      pInfoLayout
            .setHorizontalGroup(
                  pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pInfoLayout.createSequentialGroup().addGroup(pInfoLayout
                              .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(
                                    pInfoLayout
                                          .createSequentialGroup().addContainerGap()
                                          .addComponent(
                                                lbCarImg, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(pInfoLayout.createSequentialGroup().addGap(37, 37, 37).addGroup(
                                    pInfoLayout.createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(pInfoLayout.createSequentialGroup().addGroup(
                                                pInfoLayout.createParallelGroup(
                                                      javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel5).addComponent(jLabel3)
                                                      .addComponent(jLabel4))
                                                .addGap(15, 15, 15)
                                                .addGroup(pInfoLayout.createParallelGroup(
                                                      javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(lbLoc,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            Short.MAX_VALUE)
                                                      .addComponent(lbCarRentTime,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            Short.MAX_VALUE)
                                                      .addComponent(lbCarReturnTime,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            Short.MAX_VALUE)))
                                          .addGroup(pInfoLayout.createSequentialGroup()
                                                .addComponent(lbCarName)
                                                .addPreferredGap(
                                                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbName,
                                                      javax.swing.GroupLayout.DEFAULT_SIZE,
                                                      javax.swing.GroupLayout.DEFAULT_SIZE,
                                                      Short.MAX_VALUE)))))
                              .addContainerGap())
                        .addGroup(pInfoLayout.createSequentialGroup().addGap(180, 180, 180)
                              .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      pInfoLayout.setVerticalGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(lbCarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCarName).addComponent(lbName))
                  .addGap(18, 18, 18)
                  .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5).addComponent(lbLoc))
                  .addGap(18, 18, 18)
                  .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3).addComponent(lbCarRentTime))
                  .addGap(18, 18, 18)
                  .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4).addComponent(lbCarReturnTime))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                  .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(32, 32, 32)));

      jPup.setBackground(new java.awt.Color(255, 203, 103));

      lbLogo.setIcon(new javax.swing.ImageIcon("src/images/LOGO3.png")); // NOI18N

      btLogout.setBackground(new java.awt.Color(255, 200, 100));
      btLogout.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
      btLogout.setText("로그아웃");
      btLogout.setPreferredSize(new java.awt.Dimension(90, 30));
      btLogout.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btLogoutActionPerformed(evt);
         }
      });

      btCustom.setBackground(new java.awt.Color(255, 200, 100));
      btCustom.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
      btCustom.setText("차량검색");
      btCustom.setPreferredSize(new java.awt.Dimension(90, 30));
      btCustom.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCustomActionPerformed(evt);
         }
      });

      btUpdate.setBackground(new java.awt.Color(255, 200, 100));
      btUpdate.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
      btUpdate.setText("회원정보");
      btUpdate.setPreferredSize(new java.awt.Dimension(90, 30));
      btUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btUpdateActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPupLayout = new javax.swing.GroupLayout(jPup);
      jPup.setLayout(jPupLayout);
      jPupLayout.setHorizontalGroup(jPupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPupLayout.createSequentialGroup().addGap(0, 0, 0)
                  .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, 0)
                  .addGroup(jPupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btCustom, javax.swing.GroupLayout.Alignment.TRAILING,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(0, 0, Short.MAX_VALUE)));
      jPupLayout.setVerticalGroup(jPupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPupLayout.createSequentialGroup().addGap(0, 0, 0).addGroup(jPupLayout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPupLayout.createSequentialGroup()
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCustom, javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0).addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(0, 0, Short.MAX_VALUE)));

      jPanel2.setBackground(new java.awt.Color(255, 224, 122));

      jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
      jLabel9.setText("차량 예약 정보");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup().addGap(64, 64, 64)
                  .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                  .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                  .addContainerGap()));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pInfo, javax.swing.GroupLayout.Alignment.LEADING,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE)
                        .addComponent(jPup, javax.swing.GroupLayout.Alignment.LEADING,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE))
                  .addGap(20, 20, 20)));
      layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                  .addComponent(jPup, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(20, 20, 20)
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(20, 20, 20).addComponent(pInfo, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(20, 20, 20)));

   }

   private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btCancelActionPerformed
      if (lbName.getText().trim().isEmpty()) {
         int yyn = JOptionPane.showConfirmDialog(this, "예약된 차량이 없습니다.\r\n예약 페이지로 이동하시겠습니까?", "예약취소",
               JOptionPane.YES_NO_OPTION);
         if (yyn == JOptionPane.YES_OPTION) {
            parent.card.show(parent.jPanel1, "find");
         }
      } else {
         int yn = JOptionPane.showConfirmDialog(this, "차량 예약을 취소 하시겠습니까?", "예약취소", JOptionPane.YES_NO_OPTION);
         if (yn == JOptionPane.YES_OPTION) {
            bdao.deleteDept(parent.tfId.getText());
            showMsg("삭제완료");
            lbCarImg.setIcon(new ImageIcon("src/images/null.png"));
            showBlink();
            int ryn = JOptionPane.showConfirmDialog(this, "예약된 차량이 없습니다.\r\n예약 페이지로 이동하시겠습니까?", "페이지 이동",
                  JOptionPane.YES_NO_OPTION);
            if (ryn == JOptionPane.YES_OPTION) {
               parent.card.show(parent.jPanel1, "find");
            }/*else {
               return;
            }*/
         }
      }
   }// 취소
      // 버튼-------------------------------------------------------------------------------------

   private void showBlink() {
      lbLoc.setText("");
      lbName.setText("");
      lbCarRentTime.setText("");
      lbCarReturnTime.setText("");
   }// ----------------------------------

   private void showMsg(String string) {
      JOptionPane.showMessageDialog(this, string);
   }

   private void btCustomActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btCustomActionPerformed
      parent.card.show(parent.jPanel1, "find");
   }// 고객센터 이동-------------------

   private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLogoutActionPerformed
      parent.card.show(parent.jPanel1, "main");
      parent.tfId.setText("");
      parent.tfPwd.setText("");
   }// 로그아웃은 어떻게 하죠?-------------------------

   private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btUpdateActionPerformed
      showMemberInfo();
      parent.card.show(parent.jPanel1, "mi");
   }// 회원정보 로 이동------------------------------

   public void showMemberInfo() {
      ArrayList<MemberVO> memberArr = mdao.selectMemberbyId(parent.tfId.getText());
      //
      if (memberArr.size() > 0) {
         //System.out.println("dsa"+memberArr.get(0).getUserid());
         MemberVO mvo = memberArr.get(0);
         parent.myinfoConn.tfId.setText(mvo.getUserid());
         parent.myinfoConn.tfName.setText(mvo.getUsername());
         parent.myinfoConn.tfLicense.setText(mvo.getDlicense());
         parent.myinfoConn.tfPhonNum.setText(mvo.getTel());
      } else {
         System.out.println(memberArr);
         System.out.println("회원정보가 없습니다.");
      }
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btCancel;
   private javax.swing.JButton btCustom;
   private javax.swing.JButton btLogout;
   private javax.swing.JButton btUpdate;
   javax.swing.JLabel lbName;
   private javax.swing.JLabel lbLogo;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   javax.swing.JLabel lbLoc;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPup;
   javax.swing.JLabel lbCarImg;
   private javax.swing.JLabel lbCarName;
   javax.swing.JLabel lbCarRentTime;
   javax.swing.JLabel lbCarReturnTime;
   private javax.swing.JPanel pInfo;
   // End of variables declaration//GEN-END:variables

}