package com.neki.apineki.DTO;
import java.time.LocalDate;
import java.util.List;

public class UserSkillDTO {
    public Integer id;
    public Integer userId;
    public List<Integer> skillId;
    public Integer knowledgeLevel;
    public LocalDate createdAt;
    public LocalDate updatedAT;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public UserSkillDTO(Integer userId, List<Integer> skillId, Integer knowledgeLevel, LocalDate createdAt, LocalDate updatedAT) {
        this.userId = userId;
        this.skillId = skillId;
        this.knowledgeLevel = knowledgeLevel;
        this.createdAt = createdAt;
        this.updatedAT = updatedAT;
    }

    public UserSkillDTO() {
    }
}
