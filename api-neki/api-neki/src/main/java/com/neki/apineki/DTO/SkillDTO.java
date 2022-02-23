package com.neki.apineki.DTO;

import com.neki.apineki.model.SkillModel;

public class SkillDTO {
    public Integer id;
    public String name;
    public String version;
    public String image_url;

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
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public SkillDTO() {}

    public SkillDTO(SkillModel skill) {
        this.name = skill.getName();
        this.version = skill.getVersion();
        this.image_url = skill.getImage_url();
    }
}
