package sellada.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sellada.model.SignupModel;
import sellada.pojo.SellerPojo;
import sellada.util.Mailer;

public class SellerSignup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("compEmail");
        String compName = request.getParameter("compName");
        String sellerName = request.getParameter("sellerName");
        String mobileNo = request.getParameter("mobileNo");
        String password = request.getParameter("password");
        SellerPojo seller = new SellerPojo();
        seller.setCompanyName(compName);
        seller.setCompanyMail(email);
        seller.setSellerName(sellerName);
        seller.setMobileNo(mobileNo);
        seller.setPassword(password);
        try {
            boolean result = SignupModel.addSeller(seller);
            if (!result) {
                response.sendRedirect("signupPage.jsp");
                return;
            }
            Map<String,String> emailCredentials=new HashMap<>();
            emailCredentials.put("email", "swadesh.personal1534@gmail.com");
            emailCredentials.put("secKey","liax vmqs zktc ekqh");
            Mailer.sendMail(emailCredentials, seller);
            System.out.println("Seller Added");
            response.sendRedirect("login.jsp");
        } catch (SQLException ex) {
            response.sendRedirect("signupPage.jsp");
        }catch(MessagingException ex){
            ex.printStackTrace();
        }
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
