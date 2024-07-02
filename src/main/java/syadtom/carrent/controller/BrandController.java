package syadtom.carrent.controller;

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
    public Brand create(@RequestBody Brand req) {
        return brandService.create(req);
    }

    @GetMapping
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
