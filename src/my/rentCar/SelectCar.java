package my.rentCar;

import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;


public class SelectCar extends JPanel {

   MainGui parent;
   int row;
    public SelectCar(MainGui parent) {//MainPage main) {
        initComponents();
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btMyPage = new javax.swing.JButton();
        btCS = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btNext = new javax.swing.JButton();
        btPre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable() {
           public boolean isCellEditable(int row, int column) {                
                return false;               
           }
        };
        bdao = new BookingDAO();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setResizable(false);
        setPreferredSize(new java.awt.Dimension(500, 700));
        
//        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.setLayout(card);
        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        lbLogo.setIcon(new javax.swing.ImageIcon("src/images/LOGO3.png")); // NOI18N
        lbLogo.setText("LOGO");

        btMyPage.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btMyPage.setText("MyPage");
        btMyPage.setBorder(null);

        btCS.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btCS.setText("고객센터");
        btCS.setBorder(null);
        btCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCSActionPerformed(evt);
            }
        });

        btLogout.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btLogout.setText("Logout");
        btLogout.setBorder(null);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCS, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btMyPage, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btMyPage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(460, 550));

        btNext.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btNext.setText("완료");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btPre.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btPre.setText("이전");
        btPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel1.setText("CARIMG");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setPreferredSize(new java.awt.Dimension(460, 460));

        jTable1.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                   
                },
                new String [] {
                    "번호", "차량번호", "차량이름", "지점", "설명"
                }
            ));
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setPreferredSize(new java.awt.Dimension(440, 230));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }
        jTable1.addMouseListener(new java.awt.event.MouseListener() {

         @Override
         public void mouseClicked(MouseEvent e) {
            Object obj=e.getSource(); //JTable에서 선택한 행의 인덱스값 받아오기
             JTable jTable1=(JTable)obj;
              int row=jTable1.getSelectedRow();
             getCarImg(row);
             
         }

         @Override
         public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }

         @Override
         public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }

         @Override
         public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }

         @Override
         public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
         }
           
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btPre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, "card2");
//        jPanel1.add(findCar.jPanel1, "findPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

//        pack();
    }// </editor-fold>                        

    private void btCSActionPerformed(java.awt.event.ActionEvent evt) {                                     
       parent.card.show(parent.jPanel1, "faq");
    }                                    

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                         
       parent.card.show(parent.jPanel1, "main");
    }                                        

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {
       row=jTable1.getSelectedRow();
       if(row>-1) {
          try {
          String carNum=jTable1.getValueAt(row, 1).toString();
          String carName=jTable1.getValueAt(row, 2).toString();
          String loc=jTable1.getValueAt(row, 3).toString();
          String bkDay=parent.findConn.tfBooking.getText();
          String reDay=parent.findConn.tfReturn.getText();
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date bkDay2 = sdf.parse(bkDay);
            Date reDay2=sdf.parse(reDay);
            long time1=bkDay2.getTime();
            long time2=reDay2.getTime();
            java.sql.Date date1=new java.sql.Date(time1);
            java.sql.Date date2=new java.sql.Date(time2);
         
          BookingVO bvo=new BookingVO();
          bvo.setMember_ID(parent.tfId.getText());
          bvo.setCar_name(carName);
          bvo.setCar_num(carNum);
          bvo.setBk_day(date1);
          bvo.setRe_day(date2);
          bvo.setLoc(loc);
          bdao.insertBooking(bvo);
          } catch (ParseException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
          }
       }
       parent.card.show(parent.jPanel1, "my");
       showBooking();
    }                                      

    public void showBooking() {
        String userid=parent.tfId.getText().trim();
        System.out.println(userid);
         ArrayList<BookingVO> bookArr=bdao.allBooking(userid);
         for(int i=0;i<bookArr.size();i++) {
              if(userid.equals(bookArr.get(i).getMember_ID())) {
                 String cImg=bookArr.get(i).getCar_name();
                 parent.myConn.lbLoc.setText(bookArr.get(i).getLoc());
                 parent.myConn.lbName.setText(bookArr.get(i).getCar_name());
                 parent.myConn.lbCarRentTime.setText(bookArr.get(i).getBk_day().toString());
                 parent.myConn.lbCarReturnTime.setText(bookArr.get(i).getRe_day().toString());
                 parent.myConn.lbCarImg.setIcon(new javax.swing.ImageIcon("src/images/"+cImg+".png"));
              }
         }
         for(int i=0;i<bookArr.size();i++) {
            if(!userid.equals(bookArr.get(i).getMember_ID())) {
               System.out.println(bookArr);
               parent.showMsg("예약 정보가 없습니다.");
            }
         }
     }

    private void btPreActionPerformed(java.awt.event.ActionEvent evt) {                                      
       parent.card.show(parent.jPanel1, "find");
    }                                     

    private void getCarImg(int row) {
      img=new ImageIcon("src/images/"+(row+1)+".jpg");
      jLabel1.setHorizontalAlignment(JLabel.CENTER);
      jLabel1.setIcon(img);
      jLabel1.setText("");
   }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new SelectCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    javax.swing.JButton btCS;
    javax.swing.JButton btLogout;
    javax.swing.JButton btMyPage;
    javax.swing.JButton btNext;
    javax.swing.JButton btPre;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    javax.swing.JLabel lbLogo;
    CardLayout card=new CardLayout();
    ImageIcon img;
    BookingDAO bdao;
    // End of variables declaration                   
}