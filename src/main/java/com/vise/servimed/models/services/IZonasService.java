package com.vise.servimed.models.services;

import java.util.List;
import java.util.Optional;

import com.vise.servimed.models.entities.zonas_dep;


public interface IZonasService {

	public List<zonas_dep> findAll();
	public zonas_dep save (zonas_dep zonas_dep);
	public Optional<zonas_dep> findById(Long number_id);
	public void delete (Long number_id);
	
}
