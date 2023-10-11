package com.techelevator.model;

import java.util.Date;

public class Bird {

    private int bird_id;
    private String bird_name;
    private double number_of_sightings;
    private Date most_recent_sighting;
    private int zip_code;
    private String bird_image;


    public Bird(int bird_id, String bird_name, double number_of_sightings, Date most_recent_sighting, int zip_code, String bird_image) {
        this.bird_id = bird_id;
        this.bird_name = bird_name;
        this.number_of_sightings = number_of_sightings;
        this.most_recent_sighting = most_recent_sighting;
        this.zip_code = zip_code;
        this.bird_image = bird_image;
    }

    public Bird(){

    }

    public int getBird_id() {
        return bird_id;
    }

    public void setBird_id(int bird_id) {
        this.bird_id = bird_id;
    }

    public String getBird_name() {
        return bird_name;
    }

    public void setBird_name(String bird_name) {
        this.bird_name = bird_name;
    }

    public double getNumber_of_sightings() {
        return number_of_sightings;
    }

    public void setNumber_of_sightings(double number_of_sightings) {
        this.number_of_sightings = number_of_sightings;
    }

    public Date getMost_recent_sighting() {
        return most_recent_sighting;
    }

    public void setMost_recent_sighting(Date most_recent_sighting) {
        this.most_recent_sighting = most_recent_sighting;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getBird_image() {
        return bird_image;
    }

    public void setBird_image(String bird_image) {
        this.bird_image = bird_image;
    }
}
