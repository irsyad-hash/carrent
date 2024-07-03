package syadtom.carrent.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import syadtom.carrent.model.Users;
import syadtom.carrent.repository.UsersRepository;
import syadtom.carrent.service.UsersService;

@Service
@RequiredArgsConstructor
public class UsersServiceImp implements UsersService {
    private final UsersRepository userRepository;

    @Override
    public Users create(Users request) {
        return userRepository.save(request);
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getOne(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Users update(Users request) {
        Users users = this.getOne(request.getId());
        users.setName(request.getName());
        users.setBalance(request.getBalance());
        return userRepository.save(users);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}


