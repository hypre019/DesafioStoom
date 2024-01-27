package com.amorim.teststoom.controller;

import com.amorim.teststoom.domain.brand.Brand;
import com.amorim.teststoom.domain.brand.BrandDTO;
import com.amorim.teststoom.services.BrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    private final BrandService service;

    public BrandController(BrandService service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Brand> insert(@RequestBody BrandDTO branddata){
        Brand newBrand = this.service.insert(branddata);
        return ResponseEntity.ok().body(newBrand);
    }
    @GetMapping
    public ResponseEntity<List<Brand>> getAll(){
        List<Brand> brand = this.service.getAll();
        return ResponseEntity.ok().body(brand);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Brand> update(@PathVariable("id")Long id, @RequestBody BrandDTO branddata){
        Brand updateBrand = this.service.update(id, branddata);
        return ResponseEntity.ok().body(updateBrand);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Brand> delete(@PathVariable("id")Long id){
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
