package com.api.service.impl;

import com.api.model.Passageiro;
import com.api.model.PassageiroRepository;
import com.api.service.PassageiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassageiroServiceImpl implements PassageiroService {
    @Autowired
    private PassageiroRepository passageiroRepository;

    @Override
    public Iterable<Passageiro> getAll() {
        return passageiroRepository.findAll();
    }

    @Override
    public Passageiro getById(Long id) {
        Optional<Passageiro> passageiro = passageiroRepository.findById(id);
        return passageiro.get();
    }

    @Override
    public void create(Passageiro passageiro) {
        passageiroRepository.save(passageiro);
    }

    @Override
    public void update(Passageiro passageiro, Long id) {
        Optional<Passageiro> passageiroBd = passageiroRepository.findById(id);
        if(passageiroBd.isPresent()) {
            passageiroRepository.save(passageiro);
        }
    }

    @Override
    public void delete(Long id) {
        passageiroRepository.deleteById(id);
    }
}
