package com.bhavesh.test.services;

import com.bhavesh.test.models.Session;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SessionService {

    public List<Session> getAllSessions();
    public Session getSessionById(long id);
    public void create(Session session);

    void update(long session_id, String description);

    void delete(long id);

}
