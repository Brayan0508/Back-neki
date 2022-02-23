package com.neki.apineki.DTO;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

public class userSkillInserirDTO {

    @NotBlank(message = "O campo não pode ser invalido")
    public Integer userId;
    @NotBlank(message = "O campo não pode ser invalido")
    public List<Integer> skillId;
    @NotBlank(message = "O campo não pode ser invalido")
    public Integer knowledgeLevel;
    @NotBlank(message = "O campo não pode ser invalido")
    public LocalDate createdAt;
    @NotBlank(message = "O campo não pode ser invalido")
    public LocalDate updatedAT;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getSkillId() {
        return skillId;
    }

    public void setSkillId(List<Integer> skillId) {
        this.skillId = skillId;
    }

    public Integer getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(Integer knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(LocalDate updatedAT) {
        this.updatedAT = updatedAT;
    }

    public userSkillInserirDTO() {}

    public userSkillInserirDTO(Integer userId, List<Integer> skillId, Integer knowledgeLevel, LocalDate createdAt, LocalDate updatedAT) {
        this.userId = userId;
        this.skillId = skillId;
        this.knowledgeLevel = knowledgeLevel;
        this.createdAt = createdAt;
        this.updatedAT = updatedAT;
    }
}

