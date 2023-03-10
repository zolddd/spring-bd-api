package com.api.architecture.spring.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "course")
public class CourseModel {
    @Id
    @Column(name = "id",updatable = false,nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "category")
    private String category;
    @Column(name = "image")
    private String image;
    @Column(name = "level")
    private String level;
    @Column(name = "description")
    private String description;

    @Column(name = "video")
    private String video;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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

    public CourseModel(long id, String title, String category, String image, String level, String description, String video, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.image = image;
        this.level = level;
        this.description = description;
        this.video = video;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public CourseModel() {
    }

    @PrePersist
    public void  addDates(){
        createAt=LocalDateTime.now();
        updateAt=LocalDateTime.now();
    }
}
