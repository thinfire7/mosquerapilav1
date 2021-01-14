package com.SYCDMU.MosqueraPilaAPI.persistence.mapper;

import com.SYCDMU.MosqueraPilaAPI.domain.CreationLog;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logCreacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CreationLogMapper {
    @Mappings({
            @Mapping(source = "idCreacion", target = "id"),
            @Mapping(source = "idAdmin", target = "adminId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "fecCreacion", target = "creationDate"),
            @Mapping(source = "hora", target = "hour")
    })
    CreationLog toCreationLog(logCreacionEntity logCreacionEntity);

    @InheritInverseConfiguration
    logCreacionEntity toLogCreacionEntity(CreationLog creationLog);
}
