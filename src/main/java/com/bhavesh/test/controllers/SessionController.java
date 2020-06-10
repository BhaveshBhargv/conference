package com.bhavesh.test.controllers;


import com.bhavesh.test.models.Session;
import com.bhavesh.test.services.SessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionServiceImpl sessionServiceImpl;

    @GetMapping
    public List<Session> goHome(){

        return sessionServiceImpl.getAllSessions();
    }

    @PostMapping
    @RequestMapping(path = "/create")
    public void create(@RequestBody final Session session){
        sessionServiceImpl.create(session);
    }

    @PostMapping
    @RequestMapping(path = "/updateDescription")
    public void update(@RequestParam("session_id") long session_id, @RequestParam("session_description") String description){
        sessionServiceImpl.update(session_id, description);
    }

    @PostMapping
    @RequestMapping(path = "/delete")
    public void delete(@RequestParam("id") long session_id){
        sessionServiceImpl.delete(session_id);
    }
}
