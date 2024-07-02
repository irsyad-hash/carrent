package syadtom.carrent.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import syadtom.carrent.model.Brand;
import syadtom.carrent.repository.BrandRepository;
import syadtom.carrent.service.BrandService;
import java.util.List;

public class BrandServiceImpl {
    @Service
    @RequiredArgsConstructor
    public class BrandServiceImp implements BrandService {
        private final BrandRepository brandRepository;

        @Override
        public List<Brand> getAll() {
            return brandRepository.findAll();
        }

        @Override
        public Brand create(Brand req) {
            return brandRepository.save(req);
        }

        @Override
        public Brand getOne(Integer id) {
            return brandRepository.findById(id).orElse(null);
        }

        @Override
        public Brand update(Brand req) {
            return brandRepository.save(req);
        }

        @Override
        public void delete(Integer id) {
            brandRepository.deleteById(id);
        }
    }
}
