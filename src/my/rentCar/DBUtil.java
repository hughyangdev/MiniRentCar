package my.rentCar;
import java.sql.*;
//공통적으로 사용되는 코드 모듈화함 >> 공통모듈
public class DBUtil {
   
   private static String url="jdbc:oracle:thin:@localhost:1521:XE";
   private static String user="jeju", pwd="jeju";
   
   static {
      try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver Loading Success...");
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }
   }//static initializer
   
   public static Connection getCon() throws SQLException {
      Connection con=DriverManager.getConnection(url,user,pwd);
      return con;
   }
}