package com.interviewpractice.service;

import com.interviewpractice.entity.Address;
import com.interviewpractice.entity.Student;
import com.interviewpractice.mapper.AddressMapper;
import com.interviewpractice.model.AddressDto;
import com.interviewpractice.repository.AddressRepository;
import com.interviewpractice.repository.StudentRepository;
import com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.java8features.streamsprep.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressMapper addressMapper;

    public List<Address> getEmployee() {
        List<Address> all = addressRepository.findAll();
        System.out.println(all);
        return addressRepository.findAll();

    }

    @Transactional
    public void addAddress(Address address) {

        if (address.getStudentTransient() != null) {
           address.getStudentTransient().forEach(student -> {
               student.setAddress(address);
//               address.getStudent().add(student);
           });

           address.setStudent(address.getStudentTransient());
        }

        Address save = addressRepository.save(address);

    }

    public List<AddressDto> getAllAddress() {
        List<Address> addressList = addressRepository.findAll();
        List<AddressDto> dtoList = addressList.stream().map(addressMapper::adderssToAddressDto).toList();
        return dtoList;
    }
}
