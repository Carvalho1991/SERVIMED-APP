package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.municipios;



public interface IMunicipiosService {
	public List<municipios> findAll();
	public municipios save (municipios municipios);
	public Optional<municipios> findById(Long id_municipio);
	public void delete (Long id_municipio);
	
}
