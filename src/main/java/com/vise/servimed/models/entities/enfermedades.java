package com.vise.servimed.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="ENFERMEDADES")
@Access(AccessType.FIELD)
public class enfermedades  {
 
    
    
    @Id
    private String NOMBRE_ENFERMEDAD ;
    
    private String SINTOMA;
     
    private String usuario_creador;
     
       private String fecha_creado;
     
     private String usuario_mod ;
     
     private String fecha_mod;
     
    
     private String ID_ENFERMEDAD;
    

	 
	 
    public String getNOMBRE_ENFERMEDAD() {
        return NOMBRE_ENFERMEDAD;
    }

    public void setNOMBRE_ENFERMEDAD(String NOMBRE_ENFERMEDAD) {
        this.NOMBRE_ENFERMEDAD= NOMBRE_ENFERMEDAD;
    }

    public String getSINTOMA() {
        return SINTOMA;
    }

    public void setSINTOMA(String SINTOMA) {
        this.SINTOMA =SINTOMA;
    }

    public String getusuario_creador() {
        return usuario_creador;
    }

    public void setusuario_creador(String usuario_creador) {
        this.usuario_creador = usuario_creador;
    }

       public String getfecha_creado() {
        return fecha_creado;
    }

    public void setfecha_creado(String fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public String getusuario_mod() {
        return usuario_mod;
    }

    public void setusuario_mod(String usuario_mod) {
        this.usuario_mod = usuario_mod;
    }

    public String getfecha_mod() {
        return  fecha_mod;
    }

    public void setfecha_mod(String  fecha_mod) {
        this. fecha_mod =  fecha_mod;
    
    }

    public String getID_ENFERMEDAD() {
        return ID_ENFERMEDAD;
    }

    public void setID_ENFERMEDAD(String ID_ENFERMEDAD) {
        this.ID_ENFERMEDAD = ID_ENFERMEDAD;
    }
    
}
