package com.cartridge.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartridge.demo.entities.detailSupplement;

@Repository("detailsupplementRepository")
public interface DetailSupplementRepository extends JpaRepository<detailSupplement, Integer> {

}
