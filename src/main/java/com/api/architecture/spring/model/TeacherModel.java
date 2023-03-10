package com.api.architecture.spring.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "teacher")
public class TeacherModel {
    @Id
    @Column(name = "id",updatable = false,nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mail")
    private String mail;
    @Column(name = "password")
    private String password;
    @Column(name = "image")
    private String image;
    @Column(name = "create_at")

    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public TeacherModel(long id, String name, String lastName, String mail, String password, String image, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.image = image;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public TeacherModel() {
    }

    @PrePersist
    public void  addDates(){
        createAt=LocalDateTime.now();
        updateAt=LocalDateTime.now();
    }

}
