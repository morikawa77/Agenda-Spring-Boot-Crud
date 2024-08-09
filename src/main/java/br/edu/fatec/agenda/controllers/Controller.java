package br.edu.fatec.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.agenda.models.Compromisso;
import br.edu.fatec.agenda.repositories.CompromissoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controller {
  
  @Autowired
  private CompromissoRepository action;

  @PostMapping("/compromisso")
  public Compromisso cadastrar(@RequestBody Compromisso compromisso) {
    return action.save(compromisso);
  }

  @GetMapping("/compromisso")
  public List<Compromisso> listar() {
    return action.findAll();
  }

  @GetMapping("/compromisso/{codigo}")
  public Compromisso buscar(@PathVariable int codigo) {
    return action.findByCodigo(codigo);
  }


  @PutMapping("/compromisso")
  public Compromisso editar(@RequestBody Compromisso compromisso) {
    return action.save(compromisso);
  }

  @DeleteMapping("/compromisso/{codigo}")
  public void deletar(@PathVariable int codigo) {
    action.deleteById(codigo);
  }
  
  
}
