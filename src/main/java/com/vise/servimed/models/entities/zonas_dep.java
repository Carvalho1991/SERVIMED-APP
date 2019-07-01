package com.vise.servimed.models.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="zonas_dep")
@Access(AccessType.FIELD)

public class zonas_dep  {
 
    
    
    @Id
    private String number_id;
     
    private String nombre_zona;
     
    private String usuario_creador;
     
    private String fecha_creado;
     
    private String usuario_mod;
     
     private String fecha_mod;
     

    public String getnumber_id() {
        return number_id;
    }

    public void setnumber_id(String number_id) {
        this.number_id = number_id;
    }

    public String getnombre_zona() {
        return nombre_zona;
    }

    public void setnombre_zona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
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
        this.fecha_creado =fecha_creado;
    }

    public String getusuario_mod() {
        return usuario_mod;
    }

    public void setusuario_mod(String usuario_mod) {
        this.usuario_mod = usuario_mod;
    }

    public String getfecha_mod() {
        return fecha_mod;
    }

      
}
