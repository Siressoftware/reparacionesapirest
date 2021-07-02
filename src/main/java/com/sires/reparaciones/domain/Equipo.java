package com.sires.reparaciones.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="equipo")
public class Equipo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idequipo")
    private Long id;
    @Column(name="tipo_equipo")
    private String tipoequipo="";
    private String marca="";
    private String modelo="";
    @Column(name="fecha_ingreso")
    private Date fechaingreso= new Date();
    @ManyToOne(targetEntity = Cliente.class,fetch = FetchType.LAZY)
    @JoinColumn(name="idcliente",insertable = false,updatable = false)
    private Cliente cliente = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoequipo() {
        return tipoequipo;
    }

    public void setTipoequipo(String tipoequipo) {
        this.tipoequipo = tipoequipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
