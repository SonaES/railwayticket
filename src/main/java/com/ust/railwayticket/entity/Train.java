package com.ust.railwayticket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private String passengerName;
    private String TrainName;
}
