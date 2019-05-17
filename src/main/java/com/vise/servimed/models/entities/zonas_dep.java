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
    @Column(name ="NUMBER_ID",nullable=false ,length =3)
    @NotEmpty() 
    private String nombre_zona;
    @Column(name ="NOMBRE_ZONA",nullable=false ,length =25)
    @NotEmpty() 
    private String usuario_creador;
     @Column(name ="USUARIO_CREADOR",nullable=false ,length =10)
     @NotEmpty() 
    private String fecha_creado;
     @Column(name ="FECHA_CREADO",nullable=true ,length =20)
    private String usuario_mod;
     @Column(name ="usuario_mod",nullable=true ,length =20)
     private String fecha_mod;
     @Column(name ="fecha_mod",nullable=false ,length =250)
     @NotEmpty()

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
