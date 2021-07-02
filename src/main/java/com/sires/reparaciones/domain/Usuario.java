package com.sires.reparaciones.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuario")
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idusuario")
    private Integer id=null;
    @NotNull
    @Column(unique = true)
    private String nombre="";
    private String contrasena="";
    @NotNull
    private String descripcion="";
    private boolean activado=false;
    private String token="";
    @Column(name="token_vencimiento")
    private Date tokenVencimiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenVencimiento() {
        return tokenVencimiento;
    }

    public void setTokenVencimiento(Date tokenVencimiento) {
        this.tokenVencimiento = tokenVencimiento;
    }
}
