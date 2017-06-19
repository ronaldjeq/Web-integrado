package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Ronald Estela on 17/06/2017.
 */
public class User {
     private String id;
     private String type;
     private String nameUser;
     private String lastName;
     private String password;
     private int phone;
     private String address;
     private String academy;

    public User() {
    }

    public User(String id, String type, String nameUser, String lastName, String password, int phone, String address, String academy) {
        this.id = id;
        this.type = type;
        this.nameUser = nameUser;
        this.lastName = lastName;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.academy = academy;
    }


    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public User setType(String type) {
        this.type = type;
        return this;
    }

    public String getNameUser() {
        return nameUser;
    }

    public User setNameUser(String nameUser) {
        this.nameUser = nameUser;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public User setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAcademy() {
        return academy;
    }

    public User setAcademy(String academy) {
        this.academy = academy;
        return  this;
    }
}
