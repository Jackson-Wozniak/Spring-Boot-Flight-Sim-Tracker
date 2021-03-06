package com.example.SpringBootFlightLog.entity;

import javax.persistence.*;

@Entity(name = "flight")
@Table(name = "flight")
@SuppressWarnings("unused")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "departure")
    private String departureAirport;

    @Column(name = "destination")
    private String destinationAirport;

    @Column(name = "plane")
    private String plane;

    public Flight(){

    }

    public Flight(String departureAirport, String destinationAirport, String plane) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.plane = plane;
    }

    public Long getId(){
        return id;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }
}
