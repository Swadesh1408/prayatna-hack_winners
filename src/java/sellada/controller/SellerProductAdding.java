/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.controller;

import java.io.File;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sellada.model.ProductModel;
import sellada.pojo.ProductPojo;
import sellada.util.SellerDetails;

/**
 *
 * @author Swadesh Sharma
 */

@MultipartConfig(maxFileSize=16*1024*1024)
public class SellerProductAdding extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productName = request.getParameter("prodName");
        Part img = request.getPart("prodImg");
        double prodPrice = Double.parseDouble(request.getParameter("prodPrice"));
        int availQty = Integer.parseInt(request.getParameter("availQty"));
        String prodDesc = request.getParameter("prodDesc");
        String prodDimen = request.getParameter("prodDimen");
        double prodWeight = Double.parseDouble(request.getParameter("prodWeight"));
        String prodCOO = request.getParameter("prodCOO");
        int ageGroup = Integer.parseInt(request.getParameter("ageGroup"));
        ProductPojo product = new ProductPojo();
        product.setAgeGroup(ageGroup);
        product.setAvailableQty(availQty);
        product.setCountryOfOrigin(prodCOO);
        product.setProductDesc(prodDesc);
        product.setProductName(productName);
        product.setProductPrice(prodPrice);
        product.setProductWeight(prodWeight);
        product.setProductDimn(prodDimen);
        String filename = extractFileName(img);
        String filepath = "D:\\JSE_Project\\hack_winners\\web\\media\\productImages" + File.separator + filename;
        File fileSaveDir = new File(filepath);

        img.write(filepath + File.separator);
        product.setProductImg(filename);
        try{
            ServletContext sc=request.getServletContext();
            SellerDetails seller=(SellerDetails)sc.getAttribute("sellerDetails");
            boolean result=ProductModel.addProductByCompanyId(SellerDetails.getCompanyId(),product);
            if(!result){
                response.sendRedirect("AddProduct.jsp");
                return;
            }
            System.out.println("ProductAdded");
            RequestDispatcher rd=request.getRequestDispatcher("YourProducts");
            rd.forward(request, response);
        }catch(SQLException ex){
            response.sendRedirect("AddProduct.jsp");
        }
    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
