package com.connecto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    private String chargerType;
    
    private String power;
    
    private Double pricePerKwh;
    
    private Double rating;
    
    private Boolean available = true;
    
    // Constructors
    public Station() {}
    
    public Station(String name, String chargerType, String power, Double pricePerKwh, Double rating) {
        this.name = name;
        this.chargerType = chargerType;
        this.power = power;
        this.pricePerKwh = pricePerKwh;
        this.rating = rating;
    }
    
    // Getters/Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getChargerType() { return chargerType; }
    public void setChargerType(String chargerType) { this.chargerType = chargerType; }
    
    public String getPower() { return power; }
    public void setPower(String power) { this.power = power; }
    
    public Double getPricePerKwh() { return pricePerKwh; }
    public void setPricePerKwh(Double pricePerKwh) { this.pricePerKwh = pricePerKwh; }
    
    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
    
    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }
}

