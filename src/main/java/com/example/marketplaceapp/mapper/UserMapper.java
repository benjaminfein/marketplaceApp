package com.example.marketplaceapp.mapper;

import com.example.marketplaceapp.model.Address;
import com.example.marketplaceapp.model.BasicUser;
import com.example.marketplaceapp.model.Education;
import com.example.marketplaceapp.model.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ManagerMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "user.id", target = "id")
    @Mapping(source = "user.name", target = "firstName")
    @Mapping(source = "education.degreeName", target = "educationalQualification")
    @Mapping(source = "address.city", target = "residentialCity")
    @Mapping(source = "address.country", target = "residentialCountry")
    PersonDTO convert(BasicUser user, Education education, Address address);
}
