package com.fikv.heartrateregisterapplication.repositories;

import com.fikv.heartrateregisterapplication.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
}
