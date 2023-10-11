package com.techelevator.controller;



import com.techelevator.dao.BirdDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Bird;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
// @PreAuthorize("isAuthenticated()")

public class BirdController {


    private BirdDao birdDao;

    private UserDao userDao;


    public BirdController(BirdDao birdDao, UserDao userDao) {
        this.birdDao = birdDao;
        this.userDao = userDao;
    }


    @RequestMapping (path = "/birds/{birdId}", method = RequestMethod.GET)
    public Bird getBird(@PathVariable int birdId){
        Bird bird = birdDao.getBirdById(birdId);
        return bird;

    }





}
