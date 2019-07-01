package com.vise.servimed.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vise.servimed.models.entities.departamentos;

public interface IDepartamentos  extends JpaRepository <departamentos, Long>
{

}
