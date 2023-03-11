package com.yazarlar.yazarlar.controllers;


import com.yazarlar.yazarlar.beans.Yazarlar;
import com.yazarlar.yazarlar.repository.YazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeControllers {

    @Autowired
    YazarRepository yazarRepository;

    @GetMapping
    public List<Yazarlar> getAllYazarlar(){
        return yazarRepository.findAll();

    }

    @GetMapping("/api")
    public Yazarlar getAllYazarById(@PathVariable Long id){
        return yazarRepository.findById(id).get();

    }

}
