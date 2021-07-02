package com.sires.reparaciones.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reparaciones")
public class Reparacion
{
    public  final String ESTADO_TOMADA="TOMADA";
    public final String ESTADO_EN_REPARACION="EN REPARACION";
    public final String ESTADO_REPARADA="REPARADA";
    public final String ESTADO_FINALIZADA="FINALIZADA";
    public final String ESTADO_ENTREGRADA="ENTREGADA";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreparacion")
    private Long id;
    @Column(name="fecha_entrada")
    @NotNull
    private Date fechaentrada= new Date();
    @Column(name="fecha_realizada")
    private Date fecharealizada = null;
    @Column(name="fecha_entregada")
    private Date fechaentrega = null;
    @ManyToOne(optional = true,targetEntity = Cliente.class,fetch = FetchType.LAZY)
    @JoinColumn(name="idcliente",insertable = true,updatable = true)
    private Cliente cliente = null;
    private String estado="";
    @ManyToOne(optional = true,targetEntity = Equipo.class,fetch = FetchType.LAZY)
    @JoinColumn(name="idequipo",insertable = true,updatable = true)
    @NotNull
    private Equipo equipo=null;
    @NotNull
    private String accesorios="";
    @NotNull
    private String problema="";
    @NotNull
    private String tomadopor="";
    private String reparadopor="";
    private String entregadopor="";
    private String retiradapor="";
    private String informeinterno="";
    private boolean engarantia=true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public Date getFecharealizada() {
        return fecharealizada;
    }

    public void setFecharealizada(Date fecharealizada) {
        this.fecharealizada = fecharealizada;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getTomadopor() {
        return tomadopor;
    }

    public void setTomadopor(String tomadopor) {
        this.tomadopor = tomadopor;
    }

    public String getReparadopor() {
        return reparadopor;
    }

    public void setReparadopor(String reparadopor) {
        this.reparadopor = reparadopor;
    }

    public String getEntregadopor() {
        return entregadopor;
    }

    public void setEntregadopor(String entregadopor) {
        this.entregadopor = entregadopor;
    }

    public String getRetiradapor() {
        return retiradapor;
    }

    public void setRetiradapor(String retiradapor) {
        this.retiradapor = retiradapor;
    }

    public String getInformeinterno() {
        return informeinterno;
    }

    public void setInformeinterno(String informeinterno) {
        this.informeinterno = informeinterno;
    }

    public boolean isEngarantia() {
        return engarantia;
    }

    public void setEngarantia(boolean engarantia) {
        this.engarantia = engarantia;
    }

    public String getDatosCliente()
    {
        if(cliente!=null)
            return cliente.getId() + "-" + cliente.getNombre();
        else
            return "";
    }

    public Long getIdCliente()
    {
        if(cliente!=null)
            return cliente.getId();
        else
            return 0L;
    }


}
