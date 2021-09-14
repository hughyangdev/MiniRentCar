/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.rentCar;

import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class FAQ extends javax.swing.JPanel {
   
   public static String getDno;
   MainGui parent;
   DefaultTableModel dmodel;
   
    FAQDAO faqDao;
    RentDAO rentDao;
         
   CardLayout card = new CardLayout();
   ChatGui gui = new ChatGui();
   
   JTableHeader thRent;
   JTableHeader thLogin;

   ArrayList<FAQVO> arrFaq;
   String [] colHeader1= {"NO","제목","작성일"};   
   ArrayList<RentVO> arrRent;
   String [] colHeader2= {"NO","제목","작성일"};
   
   FAQMouseEventHandler faqHandler;

   
    public FAQ(MainGui parent) {
       
       this.parent = parent;
       faqHandler=new FAQMouseEventHandler(this);
        initComponents();
   
       faqDao=new FAQDAO();
       rentDao=new RentDAO();

      showFAQDAO();
      showRentDAO();
      
      resizeTable();
    }
    //FAQ 내용,작성일 크기조절
    public void resizeTable() {
       thRent=tbRent.getTableHeader();
        TableColumnModel cm=thRent.getColumnModel();
        TableColumn aColumn=cm.getColumn(1);
        aColumn.setPreferredWidth(200);
        thRent=tbRent.getTableHeader();
        thRent.setResizingAllowed(false);
        thRent.setReorderingAllowed(false);
        
        thLogin=tbLogin.getTableHeader();
        TableColumnModel cn=thLogin.getColumnModel();
        TableColumn bColumn=cn.getColumn(1);
        bColumn.setPreferredWidth(200);
        thLogin=tbLogin.getTableHeader();
        thLogin.setResizingAllowed(false);
        thLogin.setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btback = new javax.swing.JButton();
        btChat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLogin = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbRent = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 102));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(card);

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jPanel1.setBackground(new java.awt.Color(250, 204, 120));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 80));

        btback.setBackground(new java.awt.Color(255, 204, 102));
        btback.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btback.setText("뒤로가기");
        btback.setBorder(null);
        btback.setPreferredSize(new java.awt.Dimension(90, 30));
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btChat.setBackground(new java.awt.Color(255, 204, 102));
        btChat.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btChat.setText("챗봇");
        btChat.setBorder(null);
        btChat.setPreferredSize(new java.awt.Dimension(90, 30));
        btChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChatActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("src/images/LOGO3.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btChat, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(460, 560));

        jTextArea1.setEditable(true);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        


        tbLogin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               {null,null,null}
               
            },
            new String [] {
                "NO", "제목", "작성일"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        
        tbLogin.addMouseListener(faqHandler);
        jScrollPane2.setViewportView(tbLogin);

        jTabbedPane1.addTab("로그인", jScrollPane2);

        tbRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               {null,null,null}
            },
            new String [] {
                "NO", "제목", "작성일"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRent.setEnabled(true);
        tbRent.addMouseListener(faqHandler);
        jScrollPane3.setViewportView(tbRent);

        jTabbedPane1.addTab("렌터카", jScrollPane3);

        txtSearch.setText("");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btSearch.setBackground(new java.awt.Color(255, 204, 102));
        btSearch.setIcon(new javax.swing.ImageIcon("src/images/검색.png")); // NOI18N
        btSearch.setBorder(null);
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        
        

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        add(jPanel3, "faq");
        //add(gui, "chatgui");
        
    }// </editor-fold>
    
    public void showFAQDAO() {
       ArrayList<FAQVO> dlist=faqDao.selectFAQAll();
       System.out.println(dlist);
       showFAQTable(dlist);
    }
    
    public void showFAQTable(ArrayList<FAQVO>dlist) {
        Object [][] data=new Object[dlist.size()][3]; //2차원 배열 생성
         
         //ArrayList에 저장된 데이터를 2차원 배열에 옮기자
         for(int i=0;i<data.length;i++) { //data.length =dlist.size 크기 같음
            FAQVO dept=dlist.get(i);  
            data[i][0]=dept.getDno(); //번호
            data[i][1]=dept.getTitle(); //부서명
            data[i][2]=dept.getWdate();
         }    
         //부서 테이블 모델(모델이 데이터 갖고있음)
         dmodel=new DefaultTableModel(data, colHeader1);
         
         //뷰와 모델을 연결
         tbLogin.setModel(dmodel);
    }//showFAQTable()--------------------------

    public void showRentDAO() {
       ArrayList<RentVO> dlist=rentDao.selectRentAll();
       System.out.println(dlist);
       showRentTable(dlist);
    }
    public void showRentTable(ArrayList<RentVO>dlist) {
        Object [][] data=new Object[dlist.size()][3]; //2차원 배열 생성
         
         //ArrayList에 저장된 데이터를 2차원 배열에 옮기자
         for(int i=0;i<data.length;i++) { //data.length =dlist.size 크기 같음
            RentVO dept=dlist.get(i);  
            data[i][0]=dept.getDno(); //번호
            data[i][1]=dept.getTitle(); //제목
            data[i][2]=dept.getWdate();
         }    
         //테이블 모델(모델이 데이터 갖고있음)
         dmodel=new DefaultTableModel(data, colHeader2);
         
         //뷰와 모델을 연결
         tbRent.setModel(dmodel);
    }//rent--------------------------
    	
    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {                                       
       //뒤로가기 버튼
    	parent.card.show(parent.jPanel1, "main");
    	parent.tfId.setText("");
    	parent.tfPwd.setText("");
    }
    
    public void showMsg(String message) {
       JOptionPane.showMessageDialog(this, message);
    }

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //String ftitle=JOptionPane.showInputDialog("내용을 입력하세요");
        //if(ftitle==null) return;
    	ArrayList<FAQVO> arr=faqDao.findFAQ();
        if(arr!=null && arr.size()>0)
           this.showFAQTable(arr);
        else
           showMsg("검색 정보가 없습니다.");
    }                                         

    private void btChatActionPerformed(java.awt.event.ActionEvent evt) {                                       
       //채팅 gui띄우는 버튼
       
       gui.setLocation(500, 0);
       gui.setSize(450,500); //사이즈
       gui.setVisible(true); //창보여주기
    }                                      

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //돋보기 모양 누르면 내용 검색되는거 > 그냥 엔터치자
    }                                        
    private void tbLoginMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    }                                    
    private void tbRentMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   
    // Variables declaration - do not modify                     
    private javax.swing.JButton btChat;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btback;
    javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTable tbLogin;
    javax.swing.JTable tbRent;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration            
    

}