package com.programming.techie.springbootmongodbtutorial.repository;

import com.programming.techie.springbootmongodbtutorial.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigDecimal;
import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    @Query("{ 'name' : ?0 }")
    Optional<Expense> findByName(String name);

    // extra method not used in the tutorial
    @Query("{ 'name' : ?0, 'amount' : ?1 }")
    Optional<Expense> findByNameAndAmount(String name, BigDecimal amount);

}
