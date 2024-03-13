package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="TITLE", length=50, nullable=false, unique=false) //column annotation is only needed if you want to specify column name, validation, etc
    private String title;

    private String publisher;

    private String summary;

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //'tableName_fieldName' on this table
    private Set<Author> author_id = new HashSet<>(); //new field on join table


    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //'tableName_fieldName' on this table
    private Set<Genre> genre_id = new HashSet<>(); //new field on join table

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //'tableName_fieldName' on this table
    private Set<OrderOnline> order_id = new HashSet<>(); //new field on join table

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //'tableName_fieldName' on this table
    private Set<Users> user_id = new HashSet<>(); //new field on join table

    //a book can have many comments
    @ManyToOne
    @JoinColumn(name="book_id", nullable=false) //field name on the book table 'tableName_fieldName'
    private Comment comments;

    //seeder line
    public Book(String title, String publisher, String summary) {
        super();
        this.title = title;
        this.publisher = publisher;
        this.summary = summary;
    }

    public Book() {

    }


    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<Author> getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Set<Author> author_id) {
        this.author_id = author_id;
    }
    public Set<Genre> getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Set<Genre> genre_id) {
        this.genre_id = genre_id;
    }
    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }
    public Set<OrderOnline> getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Set<OrderOnline> order_id) {
        this.order_id = order_id;
    }

    public Set<Users> getUser_id() {
        return user_id;
    }
    public void setUser_id(Set<Users> user_id) {
        this.user_id = user_id;
    }

}

