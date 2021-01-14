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
@ToString
@Entity
@Table(name = "log_creacion")
public class logCreacionEntity {

    @Id
    @Column(name = "id_creacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    BigInteger idCreacion;

    @Column(name = "id_admin")
    private
    String idAdmin;

    @Column(name = "id_usuario")
    private
    String idUsuario;

    @Column(name = "fec_creacion")
    private
    Date fecCreacion;

    private Time hora;


    //relacion
    @ManyToOne
    @JoinColumn(name = "id_admin", insertable = false, updatable = false)
    private administradorEntity administradorEntity;


    public BigInteger getIdCreacion() {
        return idCreacion;
    }

    public void setIdCreacion(BigInteger idCreacion) {
        this.idCreacion = idCreacion;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
