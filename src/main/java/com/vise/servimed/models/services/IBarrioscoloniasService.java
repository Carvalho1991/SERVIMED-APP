package com.vise.servimed.models.services;
import java.util.List;
import java.util.Optional;
import com.vise.servimed.models.entities.barrios_colonias;


public interface IBarrioscoloniasService {
	public List<barrios_colonias> findAll();
	public barrios_colonias save (barrios_colonias barrios_colonias);
	public Optional<barrios_colonias> findById(Long id_barrioscol);
	public void delete (Long id_barrioscol);

}
