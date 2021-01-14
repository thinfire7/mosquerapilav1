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
@Table(name = "log_consultas")
public class logConsultasEntity {

    @Id
    @Column(name = "id_consulta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    BigInteger idConsulta;

    @Column(name = "id_usuario")
    private
    String idUsuario;

    @Column(name = "fec_consulta")
    private
    Date fecConsulta;

    private Time hora;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private usuarioEntity user;


    public BigInteger getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(BigInteger idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecConsulta() {
        return fecConsulta;
    }

    public void setFecConsulta(Date fecConsulta) {
        this.fecConsulta = fecConsulta;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
