package com.techelevator.dao;

import com.techelevator.model.Bird;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcBirdDao implements BirdDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcBirdDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Bird getBirdById(int birdId) {
        Bird bird = null;
        String sql = "";



        return bird;
    }

//    public List<Bird> getBirds() {
//
//        return birds;
//    }


//    public List<Bird> getBirdsByZip(int zipCode){
//
//        return birdsByZip;
//    }
}
