package syadtom.carrent.controller;

import jdk.jfr.Frequency;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import syadtom.carrent.model.Brand;
import syadtom.carrent.service.BrandService;

import java.util.List;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @PostMapping
    public Brand create(@RequestBody Brand request) {
        return brandService.create(request);
    }

    @GetMapping
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public Brand getOne(@PathVariable Integer id) {
        return brandService.getOne(id);
    }

    @PutMapping
    public Brand update(@RequestBody Brand request) {
        return brandService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        brandService.delete(id);
    }
}
