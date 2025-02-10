package com.interviewpractice.mapper.mapstruct;

import com.interviewpractice.entity.Address;
import com.interviewpractice.model.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapstruct {
    @Mapping(source = "student", target = "student")
    AddressDto adderssToAddressDto(Address address);

}
