package com.neki.apineki.DTO;


import javax.validation.constraints.NotBlank;

public class SkillInserirDTO {
    @NotBlank(message = "O campo não pode ser invalido")
    public String name;
    @NotBlank(message = "O campo não pode ser invalido")
    public String version;
    @NotBlank(message = "O campo não pode ser invalido")
    public String imageUrl;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SkillInserirDTO() {}
    public SkillInserirDTO(String name, String version, String imageUrl) {
        this.name = name;
        this.version = version;
        this.imageUrl = imageUrl;
    }
}
