package br.com.julianaribeiro.springbootmysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.julianaribeiro.springbootmysql.model.ParceiroModel;

@Repository
public interface ParceiroRepository extends JpaRepository<ParceiroModel, Long>{

	public List<ParceiroModel> findAllById (long id);
	
}
