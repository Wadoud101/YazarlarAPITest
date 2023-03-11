package com.yazarlar.yazarlar.bootstraps;

import com.yazarlar.yazarlar.beans.Yazarlar;
import com.yazarlar.yazarlar.repository.YazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class YazarlarBootstraps implements CommandLineRunner {

    @Autowired
    YazarRepository yazarRepository;

    @Override
    public void run(String... args) {
        Yazarlar yazar1 = new Yazarlar();

        yazar1.setYazarAdi("Ahmet");
        yazar1.setDogumTarihi(LocalDate.parse("1999-02-03"));
        yazar1.setSehir("Istanbul");
        yazarRepository.save(yazar1);


        yazarRepository.save(Yazarlar.builder().yazarAdi("Mustafa").dogumTarihi(LocalDate.parse("1900-03-04")).sehir("Ankara").build());
        yazarRepository.save(new Yazarlar(0L, "Sefa", LocalDate.parse("1995-03-03"), "Antalya"));
        yazarRepository.save(new Yazarlar("Orhan"));
    }

}
