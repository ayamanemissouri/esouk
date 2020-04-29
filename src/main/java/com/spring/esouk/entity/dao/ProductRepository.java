package com.spring.esouk.entity.dao;

import com.spring.esouk.entity.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Produit,Integer> {
}
