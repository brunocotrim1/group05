package com.computacao.nuvem.tittlesmicroservice.model;

import com.computacao.nuvem.tittlesmicroservice.model.converter.StringListConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Crew {
    @Id
    @Column(name = "tconst")
    private String id;
    @Convert(converter = StringListConverter.class)
    @Column(length = 65535)
    private List<Person> directors;
    @Column(length = 65535)
    @Convert(converter = StringListConverter.class)
    private List<String> writers;
}
