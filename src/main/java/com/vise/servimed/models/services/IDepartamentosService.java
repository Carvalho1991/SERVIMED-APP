package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.departamentos;


public interface IDepartamentosService {
	public List<departamentos> findAll();
	public departamentos save (departamentos departamentos);
	public Optional<departamentos> findById(Long id_departamentos);
	public void delete (Long id_departamentos);

}
