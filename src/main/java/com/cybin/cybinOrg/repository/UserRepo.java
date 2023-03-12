package com.cybin.cybinOrg.repository;

import com.cybin.cybinOrg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>, CustomUserRepo {
}
