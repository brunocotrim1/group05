package com.computacao.nuvem.peoplemicroservice.controller;

import com.computacao.nuvem.peoplemicroservice.model.Person;
import com.computacao.nuvem.peoplemicroservice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @PutMapping("/updatePerson")
    public ResponseEntity<?> updatePerson(@RequestBody Person person) {
        return peopleService.managePerson(person);
    }

    @GetMapping("/findByPrimaryName")
    public ResponseEntity<?> findByPrimaryName(@RequestParam("name") String name) {
        return peopleService.findByPrimaryName(name);
    }

    @GetMapping("/findByBirthYear")
    public ResponseEntity<?> findByYear(@RequestParam("page") int page, @RequestParam("birthYear") String birthYear) {
        return peopleService.findByYear(birthYear, page);
    }

    @GetMapping("/getCrewByTitle")
    public ResponseEntity<?> getCrewByTitle(@RequestParam("titleid") String titleid) {
        return peopleService.getCrewByTitle(titleid);
    }

}
