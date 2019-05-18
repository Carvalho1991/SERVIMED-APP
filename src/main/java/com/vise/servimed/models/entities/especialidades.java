package com.vise.servimed.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="especialidades")
@Access(AccessType.FIELD)
public class especialidades  {
 
    
    @Column(name ="ID_Especialidad ",nullable=false ,length =10)
    @Id
        private String NOMBRE_Especialidad;
    @Column(name ="NOMBRE_Especialidad",nullable=false ,length =50)
    @NotEmpty() 
    private String numero_especialidades;
     @Column(name ="numero_especialidades",nullable=false ,length =150)
     @NotEmpty() 
    private String usuario_creador;
     @Column(name ="usuario_creador",nullable=true ,length =10)
    private String celular;
     @Column(name ="celular",nullable=true ,length =20)
     private String direccion;
     @Column(name ="direccion",nullable=false ,length =250)
     @NotEmpty() 
     private String usuario_mod;
     @Column(name ="usuario_mod ",nullable=false ,length =10)
     @NotEmpty() 
	 private String fecha_mod;
     @Column(name ="fecha_mod",nullable=false ,length =10)
     @NotEmpty() 
    

    public String getNOMBRE_Especialidad() {
        return NOMBRE_Especialidad;
    }

    public void setNOMBRE_Especialidade(String NOMBRE_Especialidad) {
        this.NOMBRE_Especialidad = NOMBRE_Especialidad;
    }

    public String getnumero_especialidades() {
        return numero_especialidades;
    }

    public void setnumero_especialidades(String numero_especialidades) {
        this.numero_especialidades = numero_especialidades;
    }

    public String getusuario_creador() {
        return   usuario_creador;
    }

    public void setusuario_creador(String usuario_creador) {
        this.usuario_creador = usuario_creador;
    }


    public String usuario_mod() {
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
