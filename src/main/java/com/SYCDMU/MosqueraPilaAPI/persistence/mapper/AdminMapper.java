package com.SYCDMU.MosqueraPilaAPI.persistence.mapper;

import com.SYCDMU.MosqueraPilaAPI.domain.Admin;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.administradorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    @Mappings({
            @Mapping(source = "cedula", target ="id"),
            @Mapping(source = "nombres", target ="names"),
            @Mapping(source = "apellidos", target ="lastnames"),
            @Mapping(source = "correo", target ="email"),
            @Mapping(source = "contrasena", target ="password")
    })
    Admin toAdmin(administradorEntity administrador);

    List<Admin> toAdmins(List<administradorEntity> administradores);

    @InheritInverseConfiguration
    @Mappings({
            //@Mapping(target = "logCreacion", ignore = true),
            //@Mapping(target = "usuarios", ignore = true)
    })
    administradorEntity toAdministrador(Admin admin);
}
