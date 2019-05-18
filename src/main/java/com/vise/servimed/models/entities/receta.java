package com.vise.servimed.models.entities;



import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="receta")
@Access(AccessType.FIELD)
public class receta  {
 
    
    @Column(name ="ID_RECETA",nullable=false ,length =10)
    @Id
    private String SINTOMAS_ASUNTO;
    @Column(name ="SINTOMAS_ASUNTO",nullable=false ,length =250)
    @NotEmpty() 
    private String HORA;
    @Column(name ="HORA",nullable=false ,length =50)
    @NotEmpty() 
    private String usuario_creado;
     @Column(name ="usuario_creado",nullable=false ,length =10)
     @NotEmpty()
     private String  fecha_creado;
     @Column(name =" fecha_creado",nullable=true ,length =20)
     private String usuario_mod;
     @Column(name ="usuario_mod",nullable=false ,length =10)
     @NotEmpty() 
     private String fecha_mod;
     @Column(name ="fecha_mod",nullable=false ,length =20)
     @NotEmpty() 
     
     private String ID_RECETA;
     @NotEmpty() 

    public String getSINTOMAS_ASUNTO() {
        return SINTOMAS_ASUNTO;
    }

    public void setSINTOMAS_ASUNTO(String SINTOMAS_ASUNTO) {
        this.SINTOMAS_ASUNTO = SINTOMAS_ASUNTO;
    }


    public void setHORA(String HORA) {
        this.HORA= HORA;
    }

    public String getHORA() {
        return HORA;
    }

    public void setusuario_creado(String usuario_creado) {
        this.usuario_creado = usuario_creado;
    }

    public String getusuario_creado() {
        return usuario_creado;
    }

      public void setfecha_creado(String fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public String getfecha_creado() {
        return fecha_creado;
    }

    public void setusuario_mod(String usuario_mod) {
        this.usuario_mod = usuario_mod;
    }

    public String getID_RECETA() {
        return ID_RECETA;
    }

    public void setEID_RECETA(String ID_RECETA) {
        this.ID_RECETA = ID_RECETA;
    }
    
}
