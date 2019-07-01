package com.vise.servimed.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vise.servimed.models.entities.usuarios;;

public interface IUsuarios  extends JpaRepository <usuarios, Long>
{
	
}
