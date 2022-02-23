package com.neki.apineki.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "user_skill")
public class UserSkillModel {
    @Id
    @Column(name = "id")
    public Integer id;


    @OneToOne
    @JoinColumn(name = "id")
    public UserModel userId;


    @OneToMany
    @JoinColumn(name = "id")
    public List<SkillModel>  skillId;

    @Column(name = "knowledge_level")
    public Integer knowledgeLevel;

    @Column(name = "created_at")
    public LocalDate createdAt;

    @Column(name = "updated_at")
    public LocalDate updatedAT;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public UserModel getUserId() {
        return userId;
    }
    public void setUserId(UserModel userId) {
        this.userId = userId;
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

    public UserSkillModel(UserModel userId, Integer knowledgeLevel, LocalDate createdAt, LocalDate updatedAT) {
        this.userId = userId;
        this.knowledgeLevel = knowledgeLevel;
        this.createdAt = createdAt;
        this.updatedAT = updatedAT;
    }

    public UserSkillModel() {}

}
