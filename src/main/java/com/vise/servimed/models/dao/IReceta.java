package com.vise.servimed.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vise.servimed.models.entities.receta;

public interface IReceta  extends JpaRepository <receta, Long>
{

}
