package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="orderOnline")
public class OrderOnline {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    //users can place many orders
    @ManyToOne
    @JoinColumn(name="orderOnline_id", nullable=false) //field name on the orderOnline table 'tableName_fieldName'
    private Users user; //new field on orderOnline table

    //owning side of join
    @ManyToMany
    @JoinTable(name = "book_orders", // join table name
            joinColumns = @JoinColumn(name = "orderOnline_id"), //join column on this table 'tableName_fieldName'
            inverseJoinColumns = @JoinColumn(name = "book_id")) //join column on book table 'tableName_fieldName'
    private Set<Book> book_id = new HashSet<>(); //column name on join table


    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Set<Book> getBook_id() {
        return book_id;
    }

    public void setBook_id(Set<Book> book_id) {
        this.book_id = book_id;
    }
}

