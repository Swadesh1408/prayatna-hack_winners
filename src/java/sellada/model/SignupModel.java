/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sellada.listener.Listener;
import sellada.pojo.SellerPojo;
import sellada.util.PasswordEncryption;
import sellada.util.ProductDetails;
import sellada.util.SellerDetails;

/**
 *
 * @author Swadesh Sharma
 */
public class SignupModel {

    public static String getNewId() {
        String id,compId="";
        try {
            Connection conn = Listener.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select max(company_id) from seller");
            rs.next();
            id = rs.getString(1);
            if (id != null) {
                id = id.substring(4);
                compId = "CMP-" + (Integer.parseInt(id) + 1);
            } else {
                compId = "CMP-101";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return compId;
    }

    public static boolean addSeller(SellerPojo seller) throws SQLException {
        Connection conn = Listener.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into seller values(?,?,?,?,?,?)");
        ps.setString(1, getNewId());
        ps.setString(2, seller.getCompanyName());
        ps.setString(3, seller.getSellerName());
        ps.setString(4, seller.getCompanyMail());
        String pwd=PasswordEncryption.getEncryptedPassword(seller.getPassword());
        ps.setString(5, pwd);
        ps.setString(6, seller.getMobileNo());
        int result=ps.executeUpdate();
        return result==1;
    }
    
    public static SellerDetails getSellerDetails(String email, String pass)throws SQLException{
        Connection conn=Listener.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from seller where company_mail=? and password=?");
        ps.setString(1, email);
        String pwd=PasswordEncryption.getEncryptedPassword(pass);
        System.out.println(pwd);
        ps.setString(2, pwd);
        ResultSet rs=ps.executeQuery();
        SellerDetails seller=null;
        if(rs.next()){
            seller=new SellerDetails();
            seller.setCompanyEmail(rs.getString("company_mail"));
            seller.setCompanyId(rs.getString("company_id"));
            seller.setSellerName(rs.getString("seller_name"));
            seller.setCompanyName(rs.getString("company_name"));
            seller.setMobileNo(rs.getString("mobile_no"));
            System.out.println(seller);
            return seller;
//            System.out.println(seller);
        }
        return seller;
    }
    
    
    
    
}
