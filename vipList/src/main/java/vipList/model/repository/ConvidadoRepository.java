package vipList.model.repository;

import org.springframework.data.repository.CrudRepository;

import vipList.model.entities.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{
	
}