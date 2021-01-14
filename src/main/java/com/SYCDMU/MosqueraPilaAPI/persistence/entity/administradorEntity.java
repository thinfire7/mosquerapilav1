package com.SYCDMU.MosqueraPilaAPI.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

//@Getter
//@Setter
@ToString
@Entity
@Table(name = "administrador")
public class administradorEntity {

    @Id
    @Column(name = "cedula")
    //@GeneratedValue(strategy = GenerationType.IDENTITY) para las llaves primarias
    private String  cedula;

    private String nombres;

    private String apellidos;

    private String correo;

    private String contrasena;

    @OneToMany(mappedBy = "administradorEntity")
    private List<logCreacionEntity> logCreacion;

    @OneToMany(mappedBy = "adminEntity")
    private List<usuarioEntity> usuarios;


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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /*
    public List<logCreacionEntity> getLogCreacion() {
        return logCreacion;
    }

    public void setLogCreacion(List<logCreacionEntity> logCreacion) {
        this.logCreacion = logCreacion;
    }

    public List<usuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<usuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }*/
}
