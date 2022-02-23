package com.neki.apineki.model;

import com.neki.apineki.DTO.SkillInserirDTO;

import javax.persistence.*;

@Entity(name = "skill")
public class SkillModel {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "name")
    public String name;
    @Column(name = "version")
    public String version;
    @Column(name = "image_url")
    public String imageUrl;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getImage_url() {
        return imageUrl;
    }
    public void setImage_url(String image_url) {
        this.imageUrl = image_url;
    }

    public SkillModel(SkillInserirDTO skill) {
        this.name = skill.getName();
        this.version = skill.getVersion();
        this.imageUrl = skill.getImageUrl();
    }
    public SkillModel() {}

}
