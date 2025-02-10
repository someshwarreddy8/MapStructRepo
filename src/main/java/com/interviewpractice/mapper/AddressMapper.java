package com.interviewpractice.mapper;

import com.interviewpractice.entity.Address;
import com.interviewpractice.mapper.mapstruct.AddressMapstruct;
import com.interviewpractice.model.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressMapper {
    @Autowired
    private AddressMapstruct addressMapstruct;

    public AddressDto adderssToAddressDto(Address address) {
        return addressMapstruct.adderssToAddressDto(address);
    }
}
