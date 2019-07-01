package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.vise.servimed.models.entities.receta;
public interface IRecetaServices {
	
	public List<receta> findAll();
	public receta save (receta receta);
	public Optional<receta> findById(Long id_receta);
	public void delete (Long id_receta);
	public @Valid receta actualizar(@Valid receta receta);
	public receta findOne(String id_receta);


}
