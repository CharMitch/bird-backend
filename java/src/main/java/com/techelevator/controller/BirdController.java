package com.techelevator.controller;


import com.techelevator.dao.BirdDao;
import com.techelevator.model.Bird;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class BirdController {


    private BirdDao birdDao;


    public BirdController(BirdDao birdDao) {
        this.birdDao = birdDao;
    }


    @RequestMapping (path = "/birds/{birdId}", method = RequestMethod.GET)
    public Bird getBird(@PathVariable int birdId){
        Bird bird = birdDao.getBirdById(birdId);
        return bird;

    }





}
