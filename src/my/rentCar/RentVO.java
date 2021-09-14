package my.rentCar;

import java.sql.Date;

public class RentVO {
   //멤버변수
      private int dno;
      private String title;
      private String cn;
      private Date wdate;
      
      public RentVO() {
         
      }
      
      public RentVO(int dno, String title, String cn, Date wdate) {
         super();
         this.dno = dno;
         this.title = title;
         this.cn = cn;
         this.wdate = wdate;
      }
      public int getDno() {
         return dno;
      }
      public void setDno(int dno) {
         this.dno = dno;
      }
      public String getTitle() {
         return title;
      }
      public void setTitle(String title) {
         this.title = title;
      }
      public String getCn() {
         return cn;
      }
      public void setCn(String cn) {
         this.cn = cn;
      }
      public Date getWdate() {
         return wdate;
      }
      public void setWdate(Date wdate) {
         this.wdate = wdate;
      }
}