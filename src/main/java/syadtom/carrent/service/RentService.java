package syadtom.carrent.service;

import syadtom.carrent.model.Rent;

import java.util.List;

public interface RentService {
    Rent create(Rent request);
    List<Rent> getAll();
    Rent getOne(Integer id);
    Rent update(Rent request);
    void delete(Integer id);
}
