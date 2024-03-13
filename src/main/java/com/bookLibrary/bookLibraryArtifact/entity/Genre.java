package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="genre")
public class Genre {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String genre;

    //owning side of join
    @ManyToMany
    @JoinTable(name = "book_genre", //join table name
            joinColumns = @JoinColumn(name = "genre_id"), //join column on this table 'tableName_fieldName'
            inverseJoinColumns = @JoinColumn(name = "book_id")) //join column on book table 'tableName_fieldName'
    private Set<Book> book_id = new HashSet<>(); //field name on join table


    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Set<Book> getBook_id() {
        return book_id;
    }

    public void setBook_id(Set<Book> book_id) {
        this.book_id = book_id;
    }
}

