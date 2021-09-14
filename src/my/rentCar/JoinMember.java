/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.rentCar;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class JoinMember extends javax.swing.JPanel {
	
	MemberDAO memberDao = new MemberDAO();
	ArrayList<MemberDAO> userV;

	MainGui mainConn;
    CardLayout card = new CardLayout();
    
    boolean isStop = false;
    
    boolean isValidId=false; //중복확인 체크
    
    Pattern pid = Pattern.compile("^([0-9]{1,7}[a-zA-Z]{1,7})|([a-zA-Z]{1,7}[0-9]{1,7})$");
    Pattern ppwd = Pattern.compile("^([0-9]{1,7}[a-zA-Z]{1,7})|([a-zA-Z]{1,7}[0-9]{1,7})$");
    Pattern plicense = Pattern.compile("^([0-9]{12})$");
    Pattern ptel = Pattern.compile("^([0-9]{10,11})$");
    Pattern pname = Pattern.compile("^([가-힣]+)$");
    
    public JoinMember(MainGui main) {
    	this.mainConn = main;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfUserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPwd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCheckPwd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfLicense = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTel = new javax.swing.JTextField();
        btJoin = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btCheckId = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel1.setLayout(card);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 700));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "회원가입", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("맑은 고딕", 1, 16))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(460, 550));

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("회원 아이디");

        tfUserId.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("비밀번호");

        tfPwd.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("비밀번호 확인");

        tfCheckPwd.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("이름");

        tfName.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("운전면허증 번호");

        tfLicense.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("연락처");

        tfTel.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        btJoin.setBackground(new java.awt.Color(255, 204, 102));
        btJoin.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btJoin.setText("가입하기");
        btJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJoinActionPerformed(evt);
            }
        });

        btReset.setBackground(new java.awt.Color(255, 204, 102));
        btReset.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btReset.setText("다시쓰기");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btCheckId.setBackground(new java.awt.Color(255, 204, 102));
        btCheckId.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btCheckId.setText("중복확인");
        btCheckId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckIdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("(면허증 번호는 '-' 빼고 숫자만 입력)");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("(비밀번호는 4자 이상, 8자 이하의 영문+숫자 조합으로 작성)");

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("(연락처는 '-' 빼고 숫자만 입력)");

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("(아이디는 4자 이상, 8자 이하의 영문+숫자 조합으로 작성)");

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("(면허증 상의 실명 기입)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(tfUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btCheckId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCheckPwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLicense, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCheckId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfCheckPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(tfLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(460, 90));

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
//        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/LOGO3.png"))); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("src/images/LOGO3.png")); 
        jLabel1.setPreferredSize(new java.awt.Dimension(365, 90));

        btBack.setBackground(new java.awt.Color(255, 204, 102));
        btBack.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btBack.setText("뒤로가기");
        btBack.setFocusable(false);
        btBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, "join");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainConn.pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJoinActionPerformed
    	// 1. 아이디, 이름, 비밀번호, 면허증번호, 전화번호 값 받아오기
    	String userid = tfUserId.getText();
        String name = tfName.getText();
        String pwd = tfPwd.getText();
        String checkpwd = tfCheckPwd.getText();
        String dlicense = tfLicense.getText();
        String tel = tfTel.getText();
        
        // 2. 유효성 체크(not null 컬럼은 필히 체크)
        Matcher mid = pid.matcher(userid);
        Matcher mpwd = ppwd.matcher(pwd);
        Matcher mname = pname.matcher(name);
        Matcher mlicense = plicense.matcher(dlicense);
        Matcher mtel = ptel.matcher(tel);
        
    	if(userid==null || userid.trim().isEmpty()) { // 아이디
    		showMsg("사용할 아이디를 입력해주세요.");
    		tfUserId.requestFocus();
    		return;
    	} else if(userid.length()<4 || userid.length()>8) {
    		showMsg("아이디는 4자 이상, 8자 이하로 만들어야 합니다.");
    		tfUserId.requestFocus();
    		return;
    	} else if(!mid.find()) {
    		showMsg("아이디는 영문, 숫자 조합으로 작성하여야 합니다.");
    		tfUserId.requestFocus();
    		return;
    	} else if(pwd==null || pwd.trim().isEmpty()) { // 비밀번호
    		showMsg("사용할 비밀번호를 입력해주세요.");
    		tfPwd.requestFocus();
    		return;
    	} else if(pwd.length()<4 || pwd.length()>8) {
    		showMsg("비밀번호는 4자 이상, 8자 이하로 만들어야 합니다.");
    		tfPwd.requestFocus();
    		return;
    	} else if(!mpwd.find()) {
    		showMsg("비밀번호는 영문, 숫자 조합으로 작성하여야 합니다.");
    		tfPwd.requestFocus();
    		return;
    	} else if(checkpwd==null || checkpwd.trim().isEmpty()) { // 비밀번호 확인
    		showMsg("비밀번호 확인을 위해 다시 한번 입력해주세요.");
    		tfCheckPwd.requestFocus();
    		return;
    	} else if(!checkpwd.trim().equals(pwd.trim())) {
    		showMsg("입력한 비밀번호가 다릅니다. 다시 입력해주세요.");
    		tfCheckPwd.requestFocus();
    		return;
    	} else if(name==null || name.trim().isEmpty()) { // 이름
    		showMsg("이름을 입력해주세요.(면허증 상의 실명 기입)");
    		tfName.requestFocus();
    		return;
    	} else if(!mname.find()) {
    		showMsg("이름은 한글로만 입력해야합니다.");
    		tfName.requestFocus();
    		return;
    	} else if(dlicense==null || dlicense.trim().isEmpty()) { // 면허증
    		showMsg("면허증번호를 입력해주세요.('-'제외하고 번호만 입력)");
    		tfLicense.requestFocus();
    		return;
    	} else if(!mlicense.find()) {
    		showMsg("면허증번호는 12자리의 숫자로만 입력해야합니다.");
    		tfLicense.requestFocus();
    		return;
    	} else if(tel==null || tel.trim().isEmpty()) { // 연락처
    		showMsg("연락처를 입력해주세요.('-'제외하고 번호만 입력)");
    		tfTel.requestFocus();
        	return;
        } else if(!mtel.find()) {
        	showMsg("연락처는 10~11자리의 숫자로만 입력해야합니다.");
        	tfTel.requestFocus();
    		return;
    	}
    	
    	if(!isValidId) {
    		showMsg("가입 전 아이디 중복확인이 필요합니다.");
    		return;
    	} else if(isValidId) {
    		int yn = JOptionPane.showConfirmDialog(this, "회원가입을 진행할까요?",
        		"가입확인", JOptionPane.YES_NO_OPTION);
    		if(yn==JOptionPane.NO_OPTION) return;
    	}
        
        // 3. 받아온 값으로 MemberVO 객체 생성
        MemberVO member = new MemberVO(0, userid, name, pwd, null, dlicense, tel);
                
        // 4. memberDao의 insertMember() 호출
        boolean result = memberDao.insertMember(member);
        
        // 5. 그 실행 결과 메시지 처리
        String message = (result)? "회원 가입 성공": "회원 가입 실패";
        showMsg(message);
        mainConn.card.show(mainConn.jPanel1, "main");
    }//btJoin-----------------

    public void showMsg(String msg) {
    	JOptionPane.showMessageDialog(this, msg);
    } // showMsg()-----------

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
    	tfUserId.setText("");
    	tfPwd.setText("");
    	tfCheckPwd.setText("");
    	tfName.setText("");
    	tfLicense.setText("");
    	tfTel.setText("");
    	isValidId = false;
    	mainConn.card.show(mainConn.jPanel1, "main");
    }//btBack-----------------

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
    	tfUserId.setText("");
    	tfPwd.setText("");
    	tfCheckPwd.setText("");
    	tfName.setText("");
    	tfLicense.setText("");
    	tfTel.setText("");
    	isValidId = false;
    }//btReset-----------------
    
    private void btCheckIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckIdActionPerformed
    	String userid = tfUserId.getText(); 
    	Matcher mid = pid.matcher(userid);
    	if(userid==null || userid.trim().isEmpty()) {
    		showMsg("사용할 아이디를 입력해주세요.");
    		tfUserId.requestFocus();
    		return;
    	} else if(userid.length()<4 || userid.length()>15) {
    		showMsg("아이디는 4자 이상, 8자 이하로 만들어야 합니다.");
    		tfUserId.requestFocus();
    		return;
    	} else if(!mid.find()) {
    		showMsg("아이디는 영문, 숫자 조합으로 작성하여야 합니다.");
    		tfUserId.requestFocus();
    		return;
    	}
		
    	boolean result = isCheckId(userid);
    	String message = (result)? "동일한 아이디가 있습니다.": "사용 가능한 아이디입니다.";
    	isValidId=(result)? false:true;
    	showMsg(message);
    }//btCheckId-----------------

	/**아이디 중복 여부를 체크하는 메소드, 아이디가  중복되면 true를 반환*/
	public boolean isCheckId(String userid) {
		ArrayList<MemberVO> arr = memberDao.findId(userid);
		for(MemberVO member: arr) {
			if(member.getUserid().equals(userid.trim())) {
				// 동일한 아이디가 있다면 true 반환
				tfUserId.setText("");
				tfUserId.requestFocus();
				return true;
			}
		} // for---------
		return false; // 동일한 아이디가 없다면 false 반환
	} // isCheckId()----------
	
	/**비밀번호 중복 여부를 체크하는 메소드, 비밀번호  중복되면 true를 반환*/
	public boolean isCheckPwd(String pwd) {
		ArrayList<MemberVO> arr = memberDao.findPwd(pwd);
		for(MemberVO member: arr) {
			if(member.getPasswd().equals(pwd.trim())) {
				// 동일한 비밀번호 있다면 true 반환
				tfPwd.setText("");
				tfPwd.requestFocus();
				return true;
			}
		} // for---------
		return false; // 동일한 비밀번호 없다면 false 반환
	} // isCheckPwd()----------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCheckId;
    private javax.swing.JButton btJoin;
    private javax.swing.JButton btReset;
    javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    javax.swing.JTextField tfCheckPwd;
    javax.swing.JTextField tfLicense;
    javax.swing.JTextField tfName;
    javax.swing.JTextField tfPwd;
    javax.swing.JTextField tfTel;
    javax.swing.JTextField tfUserId;
    // End of variables declaration//GEN-END:variables
}
