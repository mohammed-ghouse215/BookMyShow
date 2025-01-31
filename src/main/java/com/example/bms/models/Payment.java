package com.example.bms.models;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Payment extends BaseModel{
   private Ticket ticket;
   private int amount;
   private PaymentStatus paymentStatus;
   private PaymentType paymentType;
   private Date time;
   private String refId;
   private PaymentProvider paymentProvider;
   


}
