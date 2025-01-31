package com.example.bms.models;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Date StartTime;
    private Date EndTime;
    private Language language;
    private Auditorium auditorium;

}
