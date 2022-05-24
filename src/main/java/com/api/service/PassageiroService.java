package com.api.service;

import com.api.model.Passageiro;

public interface PassageiroService {
    Iterable<Passageiro> getAll();
    Passageiro getById(Long id);
    void create(Passageiro passageiro);
    void update(Passageiro passageiro, Long id);
    void delete(Long id);
}
