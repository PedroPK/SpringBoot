package vipList.config.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vipList.config.model.entities.Convidado;


@Repository
public interface ConvidadoCrudRepository extends CrudRepository<Convidado, Long>{
	
}