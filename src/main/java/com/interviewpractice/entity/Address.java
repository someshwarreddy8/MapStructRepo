package com.interviewpractice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String area;
    private String mobile;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonIgnore
    @ToString.Exclude
    private List<Student> student;

    @Transient
    private List<Student> studentTransient;
}
