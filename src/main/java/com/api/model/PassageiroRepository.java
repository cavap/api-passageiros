package com.api.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassageiroRepository extends CrudRepository<Passageiro, Long> {
}
