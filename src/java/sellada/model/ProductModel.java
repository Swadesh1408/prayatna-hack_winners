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
import sellada.pojo.ProductPojo;
import sellada.util.ProductDetails;
import sellada.util.SellerDetails;

/**
 *
 * @author Swadesh Sharma
 */
public class ProductModel {
    
    public static String getNewId() {
        String id,prodId="";
        try {
            Connection conn = Listener.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select max(product_id) from products");
            rs.next();
            id = rs.getString(1);
            if (id != null) {
                id = id.substring(4);
                prodId = "PRD-" + (Integer.parseInt(id) + 1);
            } else {
                prodId = "PRD-101";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return prodId;
    }
    
    public static boolean addProductByCompanyId(String compId,ProductPojo product) throws SQLException{
        Connection  conn=Listener.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into products values (?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, getNewId());
        ps.setString(2, compId);
        ps.setString(3, product.getProductName());
        ps.setDouble(4, product.getProductPrice());
        ps.setInt(5, product.getAvailableQty());
        ps.setString(6, product.getProductDesc());
        ps.setString(7, product.getProductDimn());
        ps.setDouble(8,product.getProductWeight());
        ps.setString(9, product.getCountryOfOrigin());
        ps.setInt(10, product.getAgeGroup());
        ps.setString(11, product.getProductImg());
        int result=ps.executeUpdate();
        return result==1;
    }
    
    public static List<ProductDetails> getProductsByCompanyId(String compId)throws SQLException{
        Connection conn=Listener.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from products where company_id=?");
        ps.setString(1,compId);
        ResultSet rs=ps.executeQuery();
        List<ProductDetails> products= new ArrayList<>();
        ProductDetails product=null;
        while(rs.next()){
            product=new ProductDetails();
            product.setProductId(rs.getString(1));
            product.setCompanyId(rs.getString(2));
            product.setProductName(rs.getString(3));
            product.setProductPrice(rs.getDouble(4));
            product.setAvailableQty(rs.getInt(5));
            product.setProductDesc(rs.getString(6));
            product.setProductDimn(rs.getString(7));
            product.setProductWeight(rs.getDouble(8));
            product.setCountryOfOrigin(rs.getString(9));
            product.setAgeGroup(rs.getInt(10));
            product.setProductImg(rs.getString(11));
            products.add(product);
        }
        return products;
    }
        
}
