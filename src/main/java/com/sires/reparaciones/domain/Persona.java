package com.sires.reparaciones.domain;

public interface Persona
{
    public Long getId();
    public void setId(Long xId);
    public String getLocalidad();
    public void setLocalidad(String xLocalidad);
    public String getProvincia();
    public void setProvincia(String xProvincia);
    public String getDpto();
    public void setDpto(String xDpto);
    public String getPiso();
    public void setPiso(String xPiso);
    public String getCp();
    public void setCp(String xCp);
    public String getCalle();
    public void setCalle(String xCalle);
    public String getNro();
    public void setNro(String xNro);
    public String getCuit();
    public void setCuit(String xCuit);
    public String getCondicionIVA();
    public void setCondicionIVA(String xCondicionIVA);
    public String getGeo();
    public void setGeo(String xGeo);
    public String getTelefono();
    public void setTelefono(String xTelefono);
    public String getCelular();
    public void setCelular(String xCelular);
    public String getMail();
    public void setMail(String xEmail);
    public String getObservaciones();
    public void setObservaciones(String xObservaciones);
}
