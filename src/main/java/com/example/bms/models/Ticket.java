package com.example.bms.models;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Ticket extends BaseModel{
   private List<Seat> seats;
   private Auditorium auditorium;
   private Show show;
   private int amount;
   private TicketStatus ticketStatus;
   private List<Payment> payments;
   private Date timeOfBookng;
   
}
