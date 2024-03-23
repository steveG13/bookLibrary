package com.bookLibrary.bookLibraryArtifact.persistence.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles") //name of table
public class Roles {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String role;

    //owning side of join
    @ManyToMany
    @JoinTable(name = "users_roles", // join table name
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), //new field on join table, referenced column on this table - set on users table
            inverseJoinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id")) //new field on join table, referenced column on users table - set on this table
    private Set<Users> users_id = new HashSet<>(); //column name on join table

    //seeder constructor
    public Roles(String role) {
        super();
        this.role = role;
    }

    //all constructor
    public Roles() {

    }

    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Users> getUser_id() {
        return users_id;
    }

    public void setUser_id(Set<Users> users_id) {
        this.users_id = users_id;
    }
}

