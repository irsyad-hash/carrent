package syadtom.carrent.service;

import syadtom.carrent.model.Brand;

import java.util.List;

public interface BrandService {
    Brand create(Brand request);
    List<Brand> getAll();
    Brand getOne(Integer id);
    Brand update(Brand request);
    void delete(Integer id);
}
