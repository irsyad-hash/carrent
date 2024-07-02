package syadtom.carrent.service;

import syadtom.carrent.model.Brand;

import java.util.List;

public interface BrandService {
    List <Brand> getAll();
    Brand create(Brand req);
    Brand getOne(Integer id);
    Brand update(Brand req);
    void delete(Integer id);
}
