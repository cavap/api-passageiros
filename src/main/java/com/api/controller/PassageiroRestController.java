package com.api.controller;

import com.api.model.Passageiro;
import com.api.service.PassageiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("passageiros")
public class PassageiroRestController {
    @Autowired
    private PassageiroService passageiroService;

    @GetMapping
    public ResponseEntity<Iterable<Passageiro>> getAll() {
        return ResponseEntity.ok(passageiroService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passageiro> getById(@PathVariable Long id) {
        return ResponseEntity.ok(passageiroService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Passageiro> create(@RequestBody Passageiro passageiro) {
        passageiroService.create(passageiro);
        return ResponseEntity.ok(passageiro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Passageiro> update(@RequestBody Passageiro passageiro, @PathVariable Long id) {
        passageiroService.update(passageiro, id);
        return ResponseEntity.ok(passageiro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        passageiroService.delete(id);
        return ResponseEntity.ok().build();
    }
}
