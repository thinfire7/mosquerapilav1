package com.SYCDMU.MosqueraPilaAPI.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

//@Getter
//@Setter
@ToString
@Entity
@Table(name = "lider")
public class liderEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "id_lider", unique = true, nullable = false)
    private String idLider;

    private String grupo;

    private char rol;

    @Column(name = "fec_vincu")
    private
    Date fecVincu;

    @OneToMany(mappedBy = "lider")
    private List<puntosEntity> puntos;

    //relaciones
    @OneToOne
    @JoinColumn(name = "idLider", insertable = false, updatable = false)
    private usuarioEntity usuarioEntity;


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

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public Date getFecVincu() {
        return fecVincu;
    }

    public void setFecVincu(Date fecVincu) {
        this.fecVincu = fecVincu;
    }
}
