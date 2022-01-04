package model;

public class Customer {
    private int custId;
    private String custFname;
    private String custLname;
    private char gender;
    private String phoneNo;
    private String  address;
    private String username;
    private String password;

    public Customer(String custFname,String custLname ,char gender,String phoneNo,String address,String username,String password){
        this.custFname = custFname;
        this.custLname = custLname;
        this.gender  = gender;
        this.phoneNo = phoneNo;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public Customer(int custId,String custFname,String custLname ,char gender,String phoneNo,String address,String username,String password){
        this.custId = custId;
        this.custFname = custFname;
        this.custLname = custLname;
        this.gender  = gender;
        this.phoneNo = phoneNo;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    public int getCustId() {
        return custId;
    }

   
    public void setCustId(int custId) {
        this.custId = custId;
    }

   
    public String getCustFname() {
        return custFname;
    }

   
    public void setCustFname(String custFname) {
        this.custFname = custFname;
    }

   
    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname;
    }

   
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

   
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

  
    public String getAddress() {
        return address;
    }

   
    public void setAddress(String address) {
        this.address = address;
    }

    
        public String getUsername() {
            return username;
    }

    
    public void setUsername(String username) {
            this.username = username;
     }

  
    public String getPassword() {
        return password;
    }

     public void setPassword(String password) {
        this.password = password;
    }

}
