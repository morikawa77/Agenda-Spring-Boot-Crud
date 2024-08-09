package br.edu.fatec.agenda.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.agenda.models.Compromisso;

@Repository
public interface CompromissoRepository extends CrudRepository<Compromisso, Integer>{

  List<Compromisso> findAll();

  Compromisso findByCodigo(int codigo);

  void deleteById(int codigo);

}
