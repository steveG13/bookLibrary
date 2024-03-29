package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="book") //name of table
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="TITLE", length=50, nullable=false, unique=false) //column annotation is only needed if you want to specify column name, validation, etc
    private String title;

    private String publisher;

    private String summary;

    //owning side of the join
    @ManyToMany
    @JoinTable(name = "author_book", //join table Name
            joinColumns = @JoinColumn(name = "books", referencedColumnName="id"), //new field on join table, referenced column on this table - set on author table
            inverseJoinColumns = @JoinColumn(name = "authors", referencedColumnName="id")) //new field on join table, referenced column on author table - set on this table
    private Set<Author> authors = new HashSet<>(); //new field on join table

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //used to indicate the field in the target entity that owns the relationship. It’s used on the non-owning side of the relationship.
    private Set<Genre> genre_id = new HashSet<>(); //new field on join table

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //used to indicate the field in the target entity that owns the relationship. It’s used on the non-owning side of the relationship.
    private Set<OrderOnline> order_id = new HashSet<>(); //new field on join table

    //non owning side of join
    @ManyToMany(mappedBy = "book_id") //used to indicate the field in the target entity that owns the relationship. It’s used on the non-owning side of the relationship.
    private Set<Users> user_id = new HashSet<>(); //new field on join table

    //a book can have many comments
    @OneToMany(mappedBy="book") //used to indicate the field in the target entity that owns the relationship. It’s used on the non-owning side of the relationship.
    private Set<Comment> comments; //new field on comment table

    //seeder constructor
    public Book(String title, String publisher, String summary) {
        super();
        this.title = title;
        this.publisher = publisher;
        this.summary = summary;
    }

    //all constructor
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

    public Set<Genre> getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Set<Genre> genre_id) {
        this.genre_id = genre_id;
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

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }


}

