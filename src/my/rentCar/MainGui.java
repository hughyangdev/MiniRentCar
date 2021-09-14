/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.rentCar;
import java.awt.CardLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


public class MainGui extends javax.swing.JFrame implements Runnable {

	String userid, pwd;
	
	JoinMember joinConn = new JoinMember(this);
	FindCar findConn = new FindCar(this);
	SelectCar selectConn = new SelectCar(this);
	MyPage myConn = new MyPage(this);
	MemberInfo myinfoConn = new MemberInfo(this);
	FAQ faqConn = new FAQ(this);
	BookingDAO bdao = new BookingDAO();
	
	CardLayout card = new CardLayout();
	
	Pattern p = Pattern.compile("^([0-9]{1,7}[a-zA-Z]{1,7})|([a-zA-Z]{1,7}[0-9]{1,7})$");
	
	Socket sock;
	ObjectInputStream in;
	ObjectOutputStream out;
	boolean isCon = false; // 서버에 접속하면 true, 그렇지 않으면 false
    
    public MainGui() {
        initComponents();
    } // 생성자---------------
    
    @Override
    public void run() {
    	while(isCon) {
			try {
				String msg = in.readUTF();
				
				System.out.println(msg);
			} catch (IOException e) {
				System.out.println("MainGui run() 예외: "+e.getMessage());
			}
		} // while---------
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfPwd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        btJoinMember = new javax.swing.JButton();
        btFaq = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::Jeju RentCar::");

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(card);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 700));

//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/LOGO2.png"))); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("src/images/LOGO2.png")); 

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PW");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ID");

        btLogin.setBackground(new java.awt.Color(255, 204, 102));
        btLogin.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btLogin.setForeground(new java.awt.Color(0, 0, 0));
        btLogin.setText("로그인");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btJoinMember.setBackground(new java.awt.Color(255, 204, 102));
        btJoinMember.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btJoinMember.setForeground(new java.awt.Color(0, 0, 0));
        btJoinMember.setText("회원가입");
        btJoinMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJoinMemberActionPerformed(evt);
            }
        });

        btFaq.setBackground(new java.awt.Color(255, 204, 102));
        btFaq.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btFaq.setForeground(new java.awt.Color(0, 0, 0));
        btFaq.setText("고객센터");
        btFaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFaqActionPerformed(evt);
            }
        });

        btExit.setBackground(new java.awt.Color(255, 204, 102));
        btExit.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(0, 0, 0));
        btExit.setText("종       료");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btFaq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJoinMember, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfId))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfPwd)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btJoinMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, "main");
        jPanel1.add(joinConn, "join");
        jPanel1.add(findConn, "find");
        jPanel1.add(faqConn, "faq");
        jPanel1.add(selectConn, "select");
        jPanel1.add(myConn, "my");
        jPanel1.add(myinfoConn, "mi");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
    	setTitle("Login");
    	connect();
    	findConn.tfBooking.setText("");
    	findConn.tfReturn.setText("");
    }//btLogin--------------------
    
    private void connect() {
		// 1. 접속할 서버의 ip주소 설정
		String ip = "127.0.0.1";
		// 2. 아이디, 패스워드 얻기
		userid = tfId.getText();
		pwd = tfPwd.getText();
		// 3. 유효성 체크
		Matcher mid = p.matcher(userid);
		Matcher mpwd = p.matcher(pwd);
		if(userid==null || userid.trim().isEmpty()) {
			showMsg("아이디를 입력하세요");
			tfId.requestFocus();
			return;
		} else if(userid.length()<4 || userid.length()>15 || !mid.find()) {
    		showMsg("아이디는 4자 이상, 8자 이하의 영문+숫자 조합입니다.");
    		tfId.requestFocus();
    		return;
    	} else if(pwd==null || pwd.trim().isEmpty()) {
			showMsg("비밀번호를 입력하세요");
			tfPwd.requestFocus();
			return;
		} else if(pwd.length()<4 || pwd.length()>8 || !mpwd.find()) {
    		showMsg("비밀번호는 4자 이상, 8자 이하의 영문+숫자 조합입니다.");
    		tfPwd.requestFocus();
    		return;
    	} 
		// 3-1. 회원정보 일치 여부 확인
    	boolean result = joinConn.isCheckId(userid);
    	isCon=(result)? true:false;
		if(isCon) {
			boolean result2 = joinConn.isCheckPwd(pwd);
	    	isCon=(result2)? true:false;
			if(isCon) {
				card.show(jPanel1, "find");
			}else {
				showMsg("존재하지 않는 회원입니다. 회원가입 후 사용가능합니다.");
				return;
			}
		}else {
			showMsg("존재하지 않는 회원입니다. 회원가입 후 사용가능합니다.");
			return;
		}

		showBooking();
	} // connect()----------
    
    public void showBooking() {
        String userid=tfId.getText().trim();
        System.out.println(userid);
         ArrayList<BookingVO> bookArr=bdao.allBooking(userid);
         for(int i=0;i<bookArr.size();i++) {
              if(userid.equals(bookArr.get(i).getMember_ID())) {
                 String cImg=bookArr.get(i).getCar_name();
                 myConn.lbLoc.setText(bookArr.get(i).getLoc());
                 myConn.lbName.setText(bookArr.get(i).getCar_name());
                 myConn.lbCarRentTime.setText(bookArr.get(i).getBk_day().toString());
                 myConn.lbCarReturnTime.setText(bookArr.get(i).getRe_day().toString());
                 myConn.lbCarImg.setIcon(new javax.swing.ImageIcon("src/images/"+cImg+".png"));
              }
         }
         for(int i=0;i<bookArr.size();i++) {
            if(!userid.equals(bookArr.get(i).getMember_ID())) {
               System.out.println(bookArr);
               showMsg("예약 정보가 없습니다.");
            }
         }
     }
    
    private void btJoinMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJoinMemberActionPerformed
    	tfId.setText("");
    	tfPwd.setText("");
    	card.show(jPanel1, "join");
    }//btJoin------------------

    private void btFaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFaqActionPerformed
        setTitle("Faq");
        tfId.setText("");
    	tfPwd.setText("");
    	card.show(jPanel1, "faq");
    }//btFaq------------------
    
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {      
    	int yn = showConfirmMsg("종료하시겠습니까?");
    	if(yn==JOptionPane.YES_OPTION) {
    		System.exit(0);
    	} else {
    		return;
    	}
    }//btExit-----------------
    
    private int showConfirmMsg(String msg) {
		int n = JOptionPane.showConfirmDialog(this, msg, "Confirm", JOptionPane.YES_NO_OPTION);
		return n;
	} // showConfirmMsg()-----------
    
    public void showMsg(String msg) {
    	JOptionPane.showMessageDialog(this, msg);
    } // showMsg()-----------
    
    public void closeAll() throws IOException {
		if(in!=null) in.close();
		if(out!=null) out.close();
		if(sock!=null) sock.close();		
	} // closeAll()-------------

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFaq;
    private javax.swing.JButton btJoinMember;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;		
    javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    javax.swing.JTextField tfId;
    javax.swing.JTextField tfPwd;
    // End of variables declaration//GEN-END:variables
}
