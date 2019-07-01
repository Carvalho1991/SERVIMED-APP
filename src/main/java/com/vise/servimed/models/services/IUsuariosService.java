package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;

import com.vise.servimed.models.entities.usuarios;

public interface IUsuariosService {
	public List<usuarios> findAll();
	public usuarios save (usuarios usuarios);
	public Optional<usuarios> findById(Long id_number);
	public void delete (Long id_number);

}
