package com.vise.servimed.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vise.servimed.models.entities.receta;
import com.vise.servimed.models.services.IRecetaServices;

@RestController
@RequestMapping(value ="/SERVIMED/APP/")
//@CrossOrigin(origins = "http://localhost:4200")

public class recetacontroller {
	 @Autowired
	 private IRecetaServices ics;
	 
	 
	 @GetMapping("receta/")
	 public  List<receta> findAll1()  {
	  return (List<receta>) ics.findAll();
	    }
	 
	 @GetMapping("/receta/{id_receta}")
	    public receta findUser(@PathVariable(name="id_receta")String id_receta ){
	        return ics.findOne(id_receta);
	    }
	 
	    @PostMapping("/receta/")
	    public receta add(@RequestBody  receta pds){
	    	ics.save(pds);
	    	return	pds;
	    	
	    }
	    
	    @PutMapping("/receta/{id_receta}")
	    public @Valid receta update(@PathVariable String id_receta, @Valid @RequestBody receta receta) {
	       receta.setCODBARFECLIENT(id_receta);;
	       return ics.actualizar(receta);

	    }

	
	 
	

	
}