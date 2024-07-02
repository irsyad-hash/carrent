package syadtom.carrent.controller;

import java.util.List;

import syadtom.carrent.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import syadtom.carrent.model.Users;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    // C2RUD
    @PostMapping
    public Users create(@RequestBody Users request) {
        return usersService.create(request);
    }

    @GetMapping
    public List<Users> getAll() {
        return usersService.getAll();
    }

    @GetMapping("/{id}")
    public Users getOne(@PathVariable Integer id) {
        return usersService.getOne(id);
    }

    @PutMapping
    public Users update(@RequestBody Users request) {
        return usersService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usersService.delete(id);
    }

}
