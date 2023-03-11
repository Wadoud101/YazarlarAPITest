package com.yazarlar.yazarlar.beans;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Builder
public class Yazarlar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long yazarID;
    @NonNull
    private String yazarAdi;
    private LocalDate dogumTarihi;
    private String sehir;

}
