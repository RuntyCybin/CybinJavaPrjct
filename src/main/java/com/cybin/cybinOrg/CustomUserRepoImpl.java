package com.cybin.cybinOrg;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class CustomUserRepoImpl implements CustomUserRepo {


    @PersistenceContext
    EntityManager entityManager;
    @Override
    public User createUser(User user) {



        return null;
    }
}
