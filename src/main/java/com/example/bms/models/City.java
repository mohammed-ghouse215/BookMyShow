package com.example.bms.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City extends BaseModel{
    private String name;
    private List<Theatre> theatres;



}
