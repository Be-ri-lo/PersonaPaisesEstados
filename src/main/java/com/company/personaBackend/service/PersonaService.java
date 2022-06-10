package com.company.personaBackend.service;

import com.company.personaBackend.model.Persona;
import com.company.personaBackend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PersonaService implements PersonaRepository{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public List<Persona> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Persona> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Persona> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Persona> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }

    @Override
    public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Persona> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Persona> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Persona> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Persona getOne(Long aLong) {
        return null;
    }

    @Override
    public Persona getById(Long aLong) {
        return null;
    }

    @Override
    public Persona getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Persona> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Persona> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Persona> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Persona, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
