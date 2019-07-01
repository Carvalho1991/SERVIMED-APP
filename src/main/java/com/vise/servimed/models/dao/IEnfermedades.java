package com.vise.servimed.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vise.servimed.models.entities.enfermedades;

public interface IEnfermedades extends JpaRepository <enfermedades, Long>
{

}
