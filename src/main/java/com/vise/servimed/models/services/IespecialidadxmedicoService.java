package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.especialidadxmedico;


public interface IespecialidadxmedicoService {
	public List<especialidadxmedico> findAll();
	public especialidadxmedico save (especialidadxmedico especialidadxmedico);
	public Optional<especialidadxmedico> findById(Long ID_especialidad);
	public void delete (Long ID_especialidad);

}
