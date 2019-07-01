package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.enfermedades;

public interface IEnfermedadesService {
	public List<enfermedades> findAll();
	public enfermedades save (enfermedades enfermedades);
	public Optional<enfermedades> findById(Long id_enfermedad);
	public void delete (Long id_enfermedad);

	
	
}
