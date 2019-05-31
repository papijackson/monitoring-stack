package com.papijackson.personapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {

    private Integer personId;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;
}
