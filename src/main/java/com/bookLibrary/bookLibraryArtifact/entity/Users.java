package com.bookLibrary.bookLibraryArtifact.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    private String passwordHash;

    private String displayName;

    private String activeStatus;

    private LocalDate birthDate;

    private String gender;

    private String calculatedAge;

    //reading list = bookIds - need to make array list
    private String readingList;

    private String roleId;

    //non owning side of join
    @ManyToMany(mappedBy = "users_id") //'tableName_fieldName' on this table
    private Set<Roles> role_id = new HashSet<>(); //new field on join table

    //a user can have many comments
    @OneToMany(mappedBy="user") //field on the comment table
    private Set<Comment> comments; //new field on the users table

    //a user can have many orders
    @OneToMany(mappedBy="user") //field on the orderOnline table
    private Set<OrderOnline> orders; //new field on the users table

    //owning side of join
    @ManyToMany
    @JoinTable(name = "user_book", //join table Name
            joinColumns = @JoinColumn(name = "users_id"), //join column on this table 'tableName_fieldName'
            inverseJoinColumns = @JoinColumn(name = "book_id")) //join column on book table 'tableName_fieldName'
    private Set<Book> book_id = new HashSet<>(); //new field on join table

    // other fields, getters and setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCalculatedAge() {
        return calculatedAge;
    }

    public void setCalculatedAge(String calculatedAge) {
        this.calculatedAge = calculatedAge;
    }

    public String getReadingList() {
        return readingList;
    }

    public void setReadingList(String readingList) {
        this.readingList = readingList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Set<Roles> getRole_id() {
        return role_id;
    }

    public void setRole_id(Set<Roles> role_id) {
        this.role_id = role_id;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<OrderOnline> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderOnline> orders) {
        this.orders = orders;
    }

    public Set<Book> getBook_id() {
        return book_id;
    }

    public void setBook_id(Set<Book> book_id) {
        this.book_id = book_id;
    }
}

