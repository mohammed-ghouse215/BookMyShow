package com.example.bms.models;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
    private Date lockedAt;


}
