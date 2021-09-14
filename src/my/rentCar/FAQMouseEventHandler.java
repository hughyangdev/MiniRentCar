package my.rentCar;
/*table 마우스이벤트 처리하는 클래스*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTable;

public class FAQMouseEventHandler extends MouseAdapter{

   FAQ faq;
   public FAQMouseEventHandler(FAQ faq) {
      this.faq=faq;
      System.out.println("FAQMouseEventHandler()....");
   }
   @Override
   public void mousePressed(MouseEvent e) {
      Object obj=e.getSource(); //JTable에서 선택한 행의 인덱스값 받아오기
      JTable table=(JTable)obj;
      int row=table.getSelectedRow();
      faq.setName("row="+row);//선택한 행이 없으면 -1을 반환한다.?
      
      if(obj==faq.tbLogin) {
         getSelectFAQData(row);
      }else if(obj==faq.tbRent) {
         getSelectedRentData(row);
      }
   }
   private void getSelectedRentData(int row) {
      if(row>-1) {
         String dno=faq.tbRent.getValueAt(row, 0).toString();
         RentVO rvo=faq.rentDao.selectByCno(dno);
         System.out.println("rvo=="+rvo);
         if(rvo==null) {
            //showMsg("잘못 선택하였습니다.");
         }else {
            String rent=rvo.getCn();
            faq.jTextArea1.setText(rent);
         }
         
      }
      
   }
   private void getSelectFAQData(int row) {
      if(row>-1) {
         //선택한 목록번호 추출
         String dno=faq.tbLogin.getValueAt(row, 0).toString();
//         faq.tbLogin.setToolTipText(faq.getDno());
//         faq.tbLogin.setToolTipText(faq.getTitle());
//         faq.tbLogin.setToolTipText(faq.getWdate());
         FAQVO fvo=faq.faqDao.selectByDno(dno);
         System.out.println("fvo=="+fvo);
         if(fvo==null) {
            //showMsg("잘못 선택하였습니다.");
         }else {
            String info=fvo.getCn();
            faq.jTextArea1.setText(info);
         }
         
         
      }
   }
}