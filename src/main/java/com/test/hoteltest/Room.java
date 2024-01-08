package com.test.hoteltest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String roomNumber;


    private String type;


    private Double price;


    private Boolean isAvailable;

    // Standard constructors, getters, and setters

    public Room() {
    }

    public Room(String roomNumber, String type, Double price, Boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Room(int id, String roomNumber, String type, double price, boolean isAvailable) {
        this.id = Long.valueOf(id);
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }


    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }



}
