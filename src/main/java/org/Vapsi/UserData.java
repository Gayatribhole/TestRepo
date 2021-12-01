package org.Vapsi;

public class UserData
{
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phone;
    private int status;

    public UserData()
    {
    }

    public UserData(int id, String userName, String firstName, String lastName, String email,String password, int phone, int status)
    {
        setId(id);
        setUserName(userName);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setPhone(phone);
        setStatus(status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

