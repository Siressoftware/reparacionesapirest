package com.sires.reparaciones.service.dto;

public class UsuarioDTO
{
    private Integer id;
    private String nombre="";
    private String descripcion="";
    private boolean activado=false;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public boolean isActivado()
    {
        return activado;
    }

    public void setActivado(boolean activado)
    {
        this.activado = activado;
    }
}
