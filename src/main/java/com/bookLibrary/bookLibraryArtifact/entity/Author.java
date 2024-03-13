package com.bookLibrary.bookLibraryArtifact.entity;

import com.bookLibrary.bookLibraryArtifact.entity.Book;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String biography;

    //non owning side of join
    @ManyToMany(mappedBy = "authors") //field name on Book table
    private Set<Book> books = new HashSet<>(); //new field on join table

    //seeder line
    public Author(String firstName, String lastName, String biography) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
    }

    public Author() {

    }

    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

