package com.vise.servimed.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="usuarios")
@Access(AccessType.FIELD)
public class usuarios {
 
    
	
  
    private String nombre;
    @Column(name ="nombre",nullable=false ,length =50)
    @NotEmpty() 
    private String password ;
     @Column(name ="password ",nullable=false ,length =150)
     @NotEmpty() 
    private String email;
     @Column(name ="email",nullable=true ,length =150)
    private String role;
     @Column(name ="role",nullable=true ,length =2)
     private String usuario_creador ;
     @Column(name ="usuario_creador",nullable=false ,length =10)
     @NotEmpty() 
     private String id_citamedicamento;
     @Column(name ="id_citamedicamento",nullable=false ,length =5)
     @NotEmpty() 
     private String fecha_creado;
     @Column(name ="fecha_creado",nullable=false ,length =50)
     @NotEmpty() 
	 private String usuario_mod ;
     @Column(name ="usuario_mod ",nullable=false ,length =10)
     @NotEmpty() 
	 private String fecha_mod ;
     @Column(name ="fecha_mod",nullable=false ,length =50)
     @NotEmpty()
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpassword () {
        return password ;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }

    public String usuario_creador() {
        return usuario_creador;
    }

    public void setusuario_creador(String usuario_creador) {
        this.usuario_creador = usuario_creador;
    }

    public String fecha_creado () {
        return fecha_creado ;
    }

    public void setfecha_creado(String fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public String getusuario_mod() {
        return  usuario_mod;
    }

    public void setusuario_mod(String  usuario_mod) {
        this. usuario_mod =  usuario_mod;
    }
    
	public String getfecha_mod_mod() {
        return  fecha_mod;
    }

    public void setfecha_mod(String fecha_mod) {
        this. fecha_mod =  fecha_mod;
}

}
