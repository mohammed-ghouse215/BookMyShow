package com.example.bms.models;

import java.sql.Date;

import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    

}
