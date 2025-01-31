package com.example.bms.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends BaseModel{
   private String name;
   private String description;
   private List<Language> languages;
}
