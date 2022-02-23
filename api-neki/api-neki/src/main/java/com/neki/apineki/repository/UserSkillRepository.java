package com.neki.apineki.repository;

import com.neki.apineki.model.UserSkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkillModel,Integer> {
    public Integer findByUserId(Integer userId);
    public Integer findBySkillId(Integer skillId);
}
