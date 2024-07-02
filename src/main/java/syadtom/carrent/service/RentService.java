package syadtom.carrent.service;

import syadtom.carrent.model.Rent;

public interface RentService {
    Rent create(Rent req);
    Rent getAll();

}
