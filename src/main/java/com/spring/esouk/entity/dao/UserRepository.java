package com.spring.esouk.entity.dao;


import com.spring.esouk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserByUsername(String username);
    public User getUserById(long Id);

    public List<User> findAll();
    User findByUsername(String email);


}
