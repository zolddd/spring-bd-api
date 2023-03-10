package com.api.architecture.spring.model;

import javax.persistence.*;

@Entity
@Table(schema = "mockup")
public class MockupModel {
    @Id
    @Column(name = "id",updatable = false,nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "width")
    private String width;

    @Column(name = "height")
    private String height;

    @Column(name = "long")
    private String longM;

    @Column(name = "color_one")
    private String colorOne;

    @Column(name = "color_two")
    private String colorTwo;

    @Column(name = "category")
    private String category;

    @Column(name = "material_one")
    private String materialOne;

    @Column(name = "material_two")
    private String materialTwo;

    @Column(name = "material_add")
    private String materialAdd;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLongM() {
        return longM;
    }

    public void setLongM(String longM) {
        this.longM = longM;
    }

    public String getColorOne() {
        return colorOne;
    }

    public void setColorOne(String colorOne) {
        this.colorOne = colorOne;
    }

    public String getColorTwo() {
        return colorTwo;
    }

    public void setColorTwo(String colorTwo) {
        this.colorTwo = colorTwo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaterialOne() {
        return materialOne;
    }

    public void setMaterialOne(String materialOne) {
        this.materialOne = materialOne;
    }

    public String getMaterialTwo() {
        return materialTwo;
    }

    public void setMaterialTwo(String materialTwo) {
        this.materialTwo = materialTwo;
    }

    public String getMaterialAdd() {
        return materialAdd;
    }

    public void setMaterialAdd(String materialAdd) {
        this.materialAdd = materialAdd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MockupModel(long id, String width, String height, String longM, String colorOne, String colorTwo, String category, String materialOne, String materialTwo, String materialAdd, String description, String image, String name) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.longM = longM;
        this.colorOne = colorOne;
        this.colorTwo = colorTwo;
        this.category = category;
        this.materialOne = materialOne;
        this.materialTwo = materialTwo;
        this.materialAdd = materialAdd;
        this.description = description;
        this.image = image;
        this.name = name;
    }

    public MockupModel() {
    }
}
