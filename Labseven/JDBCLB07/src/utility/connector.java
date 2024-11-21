/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.ArrayList;
import model.Patient;
/**
 *
 * @author My pc
 */
public class connector {
    
 
 
  private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/medicaldb?useSSL=false";


 private  static final String DB_USER = "root";
  private static final String DB_PASS = "my-secret-pw";
  
  
  public static void addpatient(Patient p1) throws SQLException
  {
      String query = "INSERT INTO patient (name,   gender, patient_type) VALUES(?,?,?)" ;
 
      try{
           Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1,p1.getName());
           stmt.setString(2,p1.getGender());
           stmt.setString(3,p1.getPatientType());
           
           
       int rows=    stmt.executeUpdate();
       System.out.println(rows);
      conn.close();
      }
      catch(SQLException sqle)
      {
          System.out.println("exception occured");
          System.out.println(sqle);
      }
      catch(Exception ex)
      {
           System.out.println(ex);
      }
     
  }
  
  public static ArrayList<Patient> getpatient()
  {
    
      ArrayList<Patient> patient = new ArrayList<>();

    String query =  "select * from patient";
    
    try{
        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next())
        {
            Patient p1= new Patient();
            p1.setId(rs.getInt("id"));
            p1.setName(rs.getString("name"));
            p1.setGender(rs.getString("gender"));
            p1.setPatientType(rs.getString("patient_type"));
            patient.add(p1);
        }
        rs.close();
        
        conn.close();
    }
     catch(SQLException sqle){
          System.out.println("exception occured");
          System.out.println(sqle);
     }
    catch(Exception ex)
    {
         System.out.println(ex);
    }
    
    return patient;
  }
    
  public static void updatepatient(Patient oldpatient,Patient  newpatient)
  {
   
     String query = "UPDATE patient SET name = ?, gender = ?, patient_type = ? WHERE id = ?";

       try{
           Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, newpatient.getName());
           stmt.setString(2, newpatient.getGender());
           stmt.setString(3, newpatient.getPatientType());
           stmt.setInt(4, oldpatient.getId());
          int rows=    stmt.executeUpdate();
       System.out.println(rows);
      conn.close();
        
           
          
      }
      catch(SQLException sqle)
      {
          System.out.println("exception occured");
          System.out.println(sqle);
      }
      catch(Exception ex)
      {
           System.out.println(ex);
      }
     
  }
  
  public static void deletepatient(Patient p1)
  {
      String query = "Delete from patient where id=?;";
              
       try{
           Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setInt(1,p1.getId());
           int rows= stmt.executeUpdate();
           System.out.println(rows);
           conn.close();
           
          
      }
      catch(SQLException sqle)
      {
          System.out.println("exception occured");
          System.out.println(sqle);
      }
      catch(Exception ex)
      {
           System.out.println(ex);
      }
     
      
      
  }
    
}
