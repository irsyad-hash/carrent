package syadtom.carrent.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import syadtom.carrent.model.Brand;
import syadtom.carrent.repository.BrandRepository;
import syadtom.carrent.service.BrandService;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;


    @Override
    public Brand create(Brand request) {
        return brandRepository.save(request);
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getOne(Integer id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public Brand update(Brand request) {
        Brand brand = this.getOne(request.getId());
        brand.setName(request.getName());
        return brandRepository.save(brand);
    }

    @Override
    public void delete(Integer id) {
        brandRepository.deleteById(id);
    }
}
