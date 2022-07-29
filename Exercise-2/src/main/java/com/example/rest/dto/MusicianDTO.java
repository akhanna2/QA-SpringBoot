package com.example.rest.dto;

import com.example.persistence.domain.Band;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MusicianDTO {

    private Long id;

    private String name;

    private Integer strings;

    private String type;

    private Band band;

}
