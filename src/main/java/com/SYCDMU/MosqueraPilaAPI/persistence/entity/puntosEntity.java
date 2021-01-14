package com.SYCDMU.MosqueraPilaAPI.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

//@Getter
//@Setter
//@ToString
@Entity
@Table(name = "puntos")
public class puntosEntity {

    @Id
    @Column(name = "id_registro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    BigInteger idRegistro;

    @Column(name = "id_usuario")
    private
    String idUsuario;

    @Column(name = "id_lider")
    private
    String idLider;

    private String grupo;

    private Integer cantidad;

    private Date fecha;

    private Time hora;

    //relaciones
    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private usuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "id_lider", insertable = false, updatable = false)
    private liderEntity lider;


    public BigInteger getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(BigInteger idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdLider() {
        return idLider;
    }

    public void setIdLider(String idLider) {
        this.idLider = idLider;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "puntosEntity{" +
                "idRegistro=" + idRegistro +
                ", idUsuario='" + idUsuario + '\'' +
                ", idLider='" + idLider + '\'' +
                ", grupo='" + grupo + '\'' +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }
}
