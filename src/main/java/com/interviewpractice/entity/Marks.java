package com.interviewpractice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long telugu;
    private Long hindi;
    @Column(nullable = false)
    private Long english;

    @OneToOne(mappedBy = "marks", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private Student student;

}
