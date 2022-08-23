package com.bridgelab;

public class Company {
    String Companyname, Dipartment;
    public String getCompanyname() {
        return Companyname;
    }
    public void setCompanyname(String companyname){
        this.Companyname = Companyname;
    }
    public String getDipartment() {
        return Dipartment;
    }
    public void setDipartment(String dipartment){
        this.Dipartment = Dipartment;
    }
    public String toString() {
        return "Company [Companyname = " + Companyname + " ,Dipartment = " + Dipartment + "]";
    }

}
