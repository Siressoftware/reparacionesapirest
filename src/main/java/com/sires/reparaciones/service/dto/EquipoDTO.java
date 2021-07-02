package com.sires.reparaciones.service.dto;

import com.sires.reparaciones.domain.Cliente;

import javax.persistence.*;
import java.util.Date;

public class EquipoDTO
{

    private Long id;
    private String tipoequipo="";
    private String marca="";
    private String modelo="";

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
}
