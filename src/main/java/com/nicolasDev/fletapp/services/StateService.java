package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.State;
import com.nicolasDev.fletapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates() {
        List<State> stateList = stateRepository.findAll();
        return stateList;
    }

    public void addNew(State state) {
        stateRepository.save(state);
    }

    public Optional<State> findById(Integer id) {
        return stateRepository.findById(id);
    }

    public void update(State state) {
        stateRepository.save(state);
    }

    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }
}
