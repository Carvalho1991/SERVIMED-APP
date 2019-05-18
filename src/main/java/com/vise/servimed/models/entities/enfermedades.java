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
 
    
    @Column(name ="ID_ENFERMEDAD",nullable=false ,length =11)
    @Id
    private String NOMBRE_ENFERMEDAD ;
    @Column(name ="NOMBRE_ENFERMEDAD ",nullable=false ,length =50)
    @NotEmpty() 
    private String SINTOMA;
    @Column(name ="SINTOMA ",nullable=false ,length =150)
    @NotEmpty() 
    private String usuario_creador;
     @Column(name ="usuario_creador",nullable=false ,length =10)
     @NotEmpty() 
       private String fecha_creado;
     @Column(name ="fecha_creado",nullable=true ,length =10)
     private String usuario_mod ;
     @Column(name ="usuario_mod ",nullable=false ,length =250)
     @NotEmpty() 
     private String fecha_mod;
     @Column(name ="fecha_mod",nullable=false ,length =20)
     @NotEmpty() 
    
     private String ID_ENFERMEDAD;
     @NotEmpty() 

	 
	 
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
