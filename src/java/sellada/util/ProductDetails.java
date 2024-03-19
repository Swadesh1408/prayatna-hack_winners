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
public class ProductDetails {
    private String productId;
    private String companyId;
    private String productName;
    private String productImg;
    private double productPrice;
    private int availableQty;
    private String productDesc;
    private String productDimn;
    private double productWeight;
    private String countryOfOrigin;
    private int ageGroup;

    public ProductDetails(String productId, String companyId, String productName, String productImg, double productPrice, int availableQty, String productDesc, String productDimn, double productWeight, String countryOfOrigin, int ageGroup) {
        this.productId = productId;
        this.companyId = companyId;
        this.productName = productName;
        this.productImg = productImg;
        this.productPrice = productPrice;
        this.availableQty = availableQty;
        this.productDesc = productDesc;
        this.productDimn = productDimn;
        this.productWeight = productWeight;
        this.countryOfOrigin = countryOfOrigin;
        this.ageGroup = ageGroup;
    }

    public ProductDetails() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductDimn() {
        return productDimn;
    }

    public void setProductDimn(String productDimn) {
        this.productDimn = productDimn;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }
    
    
    
    
}
