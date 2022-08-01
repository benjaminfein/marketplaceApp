package com.example.marketplaceapp.mapper;

import com.example.marketplaceapp.model.Manager;
import com.example.marketplaceapp.model.ManagerDTO;
import org.mapstruct.factory.Mappers;

public interface ManagerMapper {
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);
    ManagerDTO convert(Manager manager);
}
