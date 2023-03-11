package com.yazarlar.yazarlar.repository;

import com.yazarlar.yazarlar.beans.Yazarlar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YazarRepository extends JpaRepository<Yazarlar, Long> {
}
