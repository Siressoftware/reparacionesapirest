package com.sires.reparaciones.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente implements Persona
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcliente")
    private Long id;
    @NotNull
    private String nombre="";
    @NotNull
    private String calle="";
    @NotNull
    private String nro="";
    @NotNull
    private String piso="";
    @NotNull
    private String localidad="";
    @NotNull
    private String dpto="";
    @NotNull
    private String cp="";
    @NotNull
    private String provincia="";
    @NotNull
    private String geo="";
    @NotNull
    private String cuit="0-0000000000-0";
    @NotNull
    private String condicioniva="";
    @NotNull
    private String observaciones="";
    @NotNull
    private String telefono="";
    @NotNull
    private String celular="";
    @NotNull
    private String mail="";

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCalle() {
        return calle;
    }

    @Override
    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String getNro() {
        return nro;
    }

    @Override
    public void setNro(String nro) {
        this.nro = nro;
    }

    @Override
    public String getPiso() {
        return piso;
    }

    @Override
    public void setPiso(String piso) {
        this.piso = piso;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    @Override
    public String getCp() {
        return cp;
    }

    @Override
    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String getGeo() {
        return geo;
    }

    @Override
    public void setGeo(String geo) {
        this.geo = geo;
    }

    @Override
    public String getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCondicionIVA() {
        return condicioniva;
    }

    public void setCondicionIVA(String condicioniva) {
        this.condicioniva = condicioniva;
    }

    @Override
    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }
}
