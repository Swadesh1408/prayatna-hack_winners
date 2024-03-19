/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.util;

/**
 *
 * @author Swadesh Sharma
 */
public class SellerDetails {
    private static String companyName;
    private static String sellerName;
    private static String companyId;
    private static String mobileNo;
    private static String companyEmail;

    public SellerDetails(String companyName, String sellerName, String companyId, String mobileNo, String companyEmail) {
        this.companyName = companyName;
        this.sellerName = sellerName;
        this.companyId = companyId;
        this.mobileNo = mobileNo;
        this.companyEmail = companyEmail;
    }

    public SellerDetails() {
    }

    public static String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public static String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public static String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public static String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    @Override
    public String toString() {
        return "SellerDetails{" + "companyName=" + companyName + ", sellerName=" + sellerName + ", companyId=" + companyId + ", mobileNo=" + mobileNo + ", companyEmail=" + companyEmail + '}';
    }
    
    
    
}
