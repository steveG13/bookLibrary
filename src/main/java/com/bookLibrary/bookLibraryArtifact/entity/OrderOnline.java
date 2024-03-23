package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="orderOnline")//name of table
public class OrderOnline {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    //users can place many orders
    @ManyToOne //many to one side is the side that creates new field on table it is on
    @JoinColumn(name="users_id", referencedColumnName="id") //new field on this table, referenced column on users table
    private Users user;

    //owning side of join
    @ManyToMany
    @JoinTable(name = "book_orders", // join table name
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName="id"), //new field on join table, referenced column on this table - set on book table
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName="id")) //new field on join table, referenced column on book table - set on this table
    private Set<Book> book_id = new HashSet<>(); //new field on join table

    //all constructor
    public OrderOnline() {

    }


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

