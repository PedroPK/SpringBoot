package vipList.config.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vipList.config.model.entities.Convidado;


@Repository
public interface ConvidadoJpaRepository extends JpaRepository<Convidado, Long>{
	
}