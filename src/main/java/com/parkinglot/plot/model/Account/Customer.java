package com.parkinglot.plot.model.Account;

import com.parkinglot.plot.model.Address;
import com.parkinglot.plot.model.Vehicle.Vehicle;
import lombok.Data;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Data
public class Customer {
    private String name;
    private String id;
    private Address address;
    private String email;
    private String contactNumber;
    private Vehicle vehicle;
}
