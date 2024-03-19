/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.pojo;

/**
 *
 * @author Swadesh Sharma
 */
public class SellerPojo {
    private String companyId;
    private String companyName;
    private String sellerName;
    private String companyMail;
    private String password;
    private String mobileNo;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public SellerPojo(String companyId, String companyName, String sellerName, String companyMail, String password, String mobileNo) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.sellerName = sellerName;
        this.companyMail = companyMail;
        this.password = password;
        this.mobileNo = mobileNo;
    }

    public SellerPojo() {
    }

    @Override
    public String toString() {
        return "SellerPojo{" + "companyId=" + companyId + ", companyName=" + companyName + ", sellerName=" + sellerName + ", companyMail=" + companyMail + ", password=" + password + ", mobileNo=" + mobileNo + '}';
    }
    
    
    
}
