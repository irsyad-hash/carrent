package syadtom.carrent.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import syadtom.carrent.model.Rent;
import syadtom.carrent.repository.RentRepository;
import syadtom.carrent.service.RentService;

import java.util.List;

@Service
@AllArgsConstructor
public class RentServiceImpl implements RentService {

    @Override
    public Rent create(Rent request) {
        return null;
    }

    @Override
    public List<Rent> getAll() {
        return List.of();
    }

    @Override
    public Rent getOne(Integer id) {
        return null;
    }

    @Override
    public Rent update(Rent request) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
