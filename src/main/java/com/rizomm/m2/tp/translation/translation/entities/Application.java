package com.rizomm.m2.tp.translation.translation.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;


    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Translation> translations;


}
