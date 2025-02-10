package com.interviewpractice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "student", uniqueConstraints={
        @UniqueConstraint(name = "firstname_lastname_unique", columnNames = {"firstname", "lastname"}),
        @UniqueConstraint(name="rollNo_unique", columnNames = {"rollNo"})
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties("address")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Firstname should not be blank.")
    private String firstname;
    @NotNull
    private String lastname;
    @Column(nullable = false)
    @Min(value = 1, message = "Roll no should be greater than 0.")
    private Long rollNo;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marks_id", referencedColumnName = "id", nullable = false)
    @JsonManagedReference
    private Marks marks;
}
