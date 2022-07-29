package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wood {
	private Long id;

    private boolean coniferous;

    private String colour;

    private String name;

    private int age;

    private int weight;

    private boolean artificial;

    private boolean soft;
}
