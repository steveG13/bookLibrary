package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String userId;

    private LocalDateTime createdTimestamp;

    private LocalDateTime lastEditTimestamp;

    //a child set of child comments can have many parent comments
    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL)
    private Set<Comment> childCommentSet;

    //a set of parent comment can have one set of child comments
    @ManyToOne
    @JoinColumn(name = "parentComment_id") //join field on new table
    private Comment parentComment;

    //a comment can only be on one book
    @ManyToOne
    @JoinColumn(name="comments", nullable=false) //field name on the book table
    private Book book;

    //a comment can only belong to one user
    @ManyToOne
    @JoinColumn(name="users_id", nullable=false) //field name on the users table 'tableName_fieldName'
    private Users user; //new field on comment table


    // other fields, getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

