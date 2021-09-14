package my.rentCar;

import java.sql.Date;

public class BookingVO {
   
   private int bidx;
   private String member_ID;
   private String car_name;
   private String car_num;
   private Date bk_day;
   private Date re_day;
   private String loc;
   
   public BookingVO() {
      this(0,null,null,null,null,null,null);//기본값.
   }
   
   public BookingVO(int bidx, String member_ID, String car_name, String car_num, java.sql.Date bk_day, java.sql.Date re_day, String loc) {
      super();
      this.bidx = bidx;
      this.member_ID = member_ID;
      this.car_name = car_name;
      this.car_num = car_num;
      this.bk_day = bk_day;
      this.re_day = re_day;
      this.loc = loc;
   }

   public int getBidx() {
      return bidx;
   }

   public void setBidx(int bidx) {
      this.bidx = bidx;
   }

   public String getCar_name() {
      return car_name;
   }

   public void setCar_name(String car_name) {
      this.car_name = car_name;
   }
   
   public String getMember_ID() {
      return member_ID;
   }

   public void setMember_ID(String member_ID) {
      this.member_ID = member_ID;
   }

   public String getCar_num() {
      return car_num;
   }

   public void setCar_num(String car_num) {
      this.car_num = car_num;
   }

   public Date getBk_day() {
      return bk_day;
   }

   public void setBk_day(Date bkDay2) {
      this.bk_day = bkDay2;
   }

   public Date getRe_day() {
      return re_day;
   }

   public void setRe_day(Date reDay2) {
      this.re_day = reDay2;
   }

   public String getLoc() {
      return loc;
   }

   public void setLoc(String loc) {
      this.loc = loc;
   }
   
}