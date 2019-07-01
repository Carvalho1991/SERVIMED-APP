package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.especialidades;


public interface IEspeialidadesService {
	public List<especialidades> findAll();
	public especialidades save (especialidades especialidades);
	public Optional<especialidades> findById(Long ID_Especialidad);
	public void delete (Long ID_Especialidad);

}
