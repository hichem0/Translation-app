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

public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer Id;
    @NotBlank
    private String language;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Entry> entries;

}
