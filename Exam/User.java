import java.util.*;

public class User {
    
    private String name;
    private int Connections;
    private User[] commonConnectionsUsers;

    User() {

    }

    User(String n, int c) {
        this.name = n;
        this.connections = c;
        this.commonConnectionsUsers = new users[10];
    }

    public String getUserName() {
        return this.name;
    }

    public int getConnections() {
        return this.Connections;
    }

    public User getCommonConnectionsUser() {
        return this.commonConnectionsUsers;
    }
    
    public String toString() {
        return  this.name + ":" + this.users;
    }
}