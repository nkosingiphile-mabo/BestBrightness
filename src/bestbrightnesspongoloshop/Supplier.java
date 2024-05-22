/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bestbrightnesspongoloshop;

/**
 *
 * @author user pc
 */
public class Supplier {
    private String supplerID;
    private String supplierName;
    private String alias;
    private String phone;
    private String email;
    private String address;

    public Supplier() {
    }

    public Supplier(String supplerID, String supplierName, String alias, String phone, String email, String address) {
        this.supplerID = supplerID;
        this.supplierName = supplierName;
        this.alias = alias;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getSupplerID() {
        return supplerID;
    }

    public void setSupplierID(String supplerID) {
        this.supplerID = supplerID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
