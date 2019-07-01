package com.vise.servimed.models.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="barrios_colonias")
@Access(AccessType.FIELD)

public class barrios_colonias  {
 
       
    @Id
    private String id_barriocol;
    @Column(name ="ID_BARRIOCOL",nullable=false ,length =3)
    @NotEmpty() 
    private String nombre_barrio;
    @Column(name ="NOMBRE_BARRIO",nullable=false ,length =25)
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

    public String getid_barriocol() {
        return id_barriocol;
    }

    public void setid_barriocol(String id_barriocol) {
        this.id_barriocol = id_barriocol;
    }

    public String getnombre_barrio() {
        return nombre_barrio;
    }

    public void setnombre_barrio(String nombre_barrio) {
        this.nombre_barrio = nombre_barrio;
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
    public void setfecha_mod(String fecha_mod) {
        this.fecha_mod = fecha_mod;
    }
      
}
