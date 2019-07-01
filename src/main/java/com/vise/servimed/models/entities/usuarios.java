package com.vise.servimed.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="usuarios")
@Access(AccessType.FIELD)
public class usuarios {
 
    
	
  
    private String nombre;
    private String password ;
    private String email;
    private String role;
 
     private String usuario_creador ;
     
     private String fecha_creado;
    
	 private String usuario_mod ;
     
	 private String fecha_mod ;
    
   

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
