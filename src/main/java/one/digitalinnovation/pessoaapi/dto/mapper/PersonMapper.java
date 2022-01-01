package one.digitalinnovation.pessoaapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import one.digitalinnovation.pessoaapi.dto.request.PersonDTO;
import one.digitalinnovation.pessoaapi.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}