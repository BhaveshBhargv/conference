package com.bhavesh.test.services;

import com.bhavesh.test.models.Session;
import com.bhavesh.test.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session getSessionById(long id) {
        return null;
    }

    @Override
    public void create(Session session) {
        sessionRepository.save(session);
    }

    @Override
    public void update(long session_id, String description) {
        Session session = sessionRepository.findById(session_id).get();
        session.setSession_description(description);
        sessionRepository.saveAndFlush(session);
    }

    @Override
    public void delete(long id) {
        Session session = sessionRepository.findById(id).get();
        sessionRepository.delete(session);
    }

}
