package com.spring.esouk.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "authorities")
@Entity
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToMany(mappedBy="roles")
    private List<User> users;
    @Column(name = "authority")
    private String authority;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
