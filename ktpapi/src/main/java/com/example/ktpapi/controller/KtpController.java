package com.example.ktpapi.controller;

import com.example.ktpapi.dto.KtpDTO;
import com.example.ktpapi.entity.Ktp;
import com.example.ktpapi.service.KtpService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ktp")
@CrossOrigin
public class KtpController {

    private final KtpService service;

    public KtpController(KtpService service){
        this.service = service;
    }

    @PostMapping
    public Ktp create(@RequestBody KtpDTO dto){
        return service.create(dto);
    }

    @GetMapping
    public List<Ktp> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Ktp getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Ktp update(@PathVariable Integer id, @RequestBody KtpDTO dto){
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}