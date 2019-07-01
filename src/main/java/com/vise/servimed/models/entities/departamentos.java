package com.vise.servimed.models.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="departamentos")
@Access(AccessType.FIELD)

public class departamentos  {
 
       
    @Id
    private String id_number;
<<<<<<< HEAD
    
    private String nombre;
   
    private String usuario_creador;
     
    private String fecha_creado;
     
    private String usuario_mod;
     
     private String fecha_mod;
    
=======
    @Column(name ="ID_NUMBER",nullable=false ,length =3)
    @NotEmpty() 
    private String nombre;
    @Column(name ="NOMBRE",nullable=false ,length =25)
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
>>>>>>> 23520d67378ce1d438d5f63bf2782ea1cb55b11b

    public String getid_number() {
        return id_number;
    }

    public void setid_number(String id_number) {
        this.id_number = id_number;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
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