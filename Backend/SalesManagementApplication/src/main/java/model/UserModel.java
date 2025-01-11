package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.crypto.SecretKey;

@Entity
public class UserModel {

    @Id
    private long user_id;
    private String user_name;
    private String password;
    private String employee_id;
    private Role role;
    private SecretKey keyToAccess;


    public UserModel(String user_name, String password, String employee_id, Role role, SecretKey keyToAccess) {
        this.user_name = user_name;
        this.password = password;
        this.employee_id = employee_id;
        this.role = role;
        this.keyToAccess = keyToAccess;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public SecretKey getKeyToAccess() {
        return keyToAccess;
    }

    public void setKeyToAccess(SecretKey keyToAccess) {
        this.keyToAccess = keyToAccess;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", employee_id='" + employee_id + '\'' +
                ", role=" + role +
                ", keyToAccess=" + keyToAccess +
                '}';
    }
}
