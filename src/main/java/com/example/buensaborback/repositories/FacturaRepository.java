package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long> {
}
