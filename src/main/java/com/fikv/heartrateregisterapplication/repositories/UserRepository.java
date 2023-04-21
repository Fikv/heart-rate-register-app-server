package com.fikv.heartrateregisterapplication.repositories;

import com.fikv.heartrateregisterapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    void saveUser();
    void updateUserById(Long id);
}
