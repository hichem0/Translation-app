package com.rizomm.m2.tp.translation.translation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    @NotBlank
    private String key;
    @NotBlank
    private String value;

//    @NotBlank
//    @ManyToOne
//    private Translation trans_id;


@ManyToOne
@JoinColumn(name="translation_id")
private Translation translation;


}
