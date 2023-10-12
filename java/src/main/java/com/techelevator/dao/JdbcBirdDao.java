package com.techelevator.dao;

import com.techelevator.model.Bird;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class JdbcBirdDao implements BirdDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcBirdDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Bird getBirdById(int birdId) {
        Bird bird = null;
        String sql = "SELECT bird_id, bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image " +
                "FROM birds " +
                "WHERE bird_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, birdId);
        if (results.next()) {
            bird = mapRowToBird(results);
        }

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





    private Bird mapRowToBird(SqlRowSet rs) {
        Bird bird = new Bird();
        bird.setBird_id(rs.getInt("bird_id"));
        bird.setBird_name(rs.getString("bird_name"));
        bird.setNumber_of_sightings(rs.getInt("number_of_sightings"));
        bird.setMost_recent_sighting(rs.getDate("most_recent_sighting"));
        bird.setZip_code(rs.getInt("zip_code"));
        bird.setBird_image(rs.getString("bird_image"));

        return bird;
    }

}
