package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="comment") //name of table
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdTimestamp;

    private LocalDateTime lastEditTimestamp;

    //a child set of child comments can have many parent comments
    @OneToMany(mappedBy = "parentComment") //used to indicate the field in the target entity that owns the relationship. It’s used on the non-owning side of the relationship.
    private Set<Comment> childCommentSet;

    //a set of parent comment can have one set of child comments
    @ManyToOne //many to one side is the side that creates new field on table it is on
    @JoinColumn(name = "parentComment_id", referencedColumnName="id") //new field on this table, referenced column on this table
    private Comment parentComment;

    //a comment can only be on one book
    @ManyToOne //many to one side is the side that creates new field on table it is on
    @JoinColumn(name="book_id", referencedColumnName = "id") //new field on this table, referenced column on book table
    private Book book;

    //a comment can only belong to one user
    @ManyToOne //many to one side is the side that creates new field on table it is on
    @JoinColumn(name="users_id", referencedColumnName = "id") //new field on this table, referenced column on users table
    private Users user;

    //seeder constructor
    public Comment(LocalDateTime createdTimestamp, LocalDateTime lastEditTimestamp) {
        super();
        this.createdTimestamp = createdTimestamp;
        this.lastEditTimestamp = lastEditTimestamp;
    }

    //all constructor
    public Comment() {

    }


    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public LocalDateTime getLastEditTimestamp() {
        return lastEditTimestamp;
    }

    public void setLastEditTimestamp(LocalDateTime lastEditTimestamp) {
        this.lastEditTimestamp = lastEditTimestamp;
    }
    public Set<Comment> getChildCommentSet() {
        return childCommentSet;
    }

    public void setChildCommentSet(Set<Comment> childCommentSet) {
        this.childCommentSet = childCommentSet;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}

