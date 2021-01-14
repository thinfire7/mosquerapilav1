package com.SYCDMU.MosqueraPilaAPI.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

//@Getter
//@Setter
@ToString
@Entity
@Table(name = "usuario")
public class usuarioEntity {

    @Id
    @Column(name = "cedula")
    private
    String cedula;

    private String nombres;

    private String apellidos;

    private Integer edad;

    private String genero;

    @Column(name = "fecha_nacimiento")
    private
    Date fecNacimiento;

    private String universidad;

    private String carrera;

    private Integer semestre;

    private String direccion;

    private String correo;

    private Integer estrato;

    private String contrasena;

    @Column(name = "estado_benef")
    private
    boolean estadoBenef;

    @Column(name = "grupo_etnico")
    private
    String grupoEtnico;

    private Integer hijos;

    @Column(name = "cedula_admin")
    private
    String cedulaAdmin;

    @Column(name = "estado_civil")
    private
    String estadoCivil;



    //relaciones
    @ManyToOne
    @JoinColumn(name = "cedula_admin", insertable = false, updatable = false)
    private administradorEntity adminEntity;

    @OneToMany(mappedBy = "usuario")
    private List<puntosEntity> puntos;

    @OneToMany(mappedBy = "user")
    private List<logConsultasEntity> consultas;

    @OneToOne(mappedBy = "usuarioEntity")
    private liderEntity lider;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstadoBenef() {
        return estadoBenef;
    }

    public void setEstadoBenef(boolean estadoBenef) {
        this.estadoBenef = estadoBenef;
    }

    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(String grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public Integer getHijos() {
        return hijos;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }

    public String getCedulaAdmin() {
        return cedulaAdmin;
    }

    public void setCedulaAdmin(String cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /*
    public administradorEntity getAdminEntity() {
        return adminEntity;
    }

    public void setAdminEntity(administradorEntity adminEntity) {
        this.adminEntity = adminEntity;
    }*/
}
