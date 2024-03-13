package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Roles {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String role;

    //owning side of join
    @ManyToMany
    @JoinTable(name = "users_roles", // join table name
            joinColumns = @JoinColumn(name = "roles_id"), //join column on this table 'tableName_fieldName'
            inverseJoinColumns = @JoinColumn(name = "users_id")) //join column on users table 'tableName_fieldName'
    private Set<Users> users_id = new HashSet<>(); //column name on join table

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

