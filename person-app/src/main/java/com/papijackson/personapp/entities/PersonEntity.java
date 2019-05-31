package com.papijackson.personapp.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 *
 */
@Data
@Entity
@Table(name = "PERSON")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer personId;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;
}
