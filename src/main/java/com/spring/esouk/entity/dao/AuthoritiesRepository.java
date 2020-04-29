package com.spring.esouk.entity.dao;

import com.spring.esouk.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface AuthoritiesRepository extends CrudRepository<Role,Long> {
}
