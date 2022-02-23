package com.neki.apineki.repository;

import com.neki.apineki.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer>{
}
