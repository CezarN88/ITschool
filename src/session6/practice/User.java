package session6.practice;

import java.util.UUID;

public class User {

    private String firstName;
    private UUID userId;
    private String lastName;
    private int age;
    private int customerNumber;
    private boolean oldCustomer;
    private String currentcountry;
    private String email;
    private String phoneNumber;
    private String signInDate;
    private int currency;
    private  String password;

    private UserAddress userAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOldCustomer() {
        return oldCustomer;
    }

    public void setOldCustomer(boolean oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public String getCurrentcountry() {
        return currentcountry;
    }

    public void setCurrentcountry(String currentcountry) {
        this.currentcountry = currentcountry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignInDate() {
        return signInDate;
    }

    public void setSignInDate(String signInDate) {
        this.signInDate = signInDate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
