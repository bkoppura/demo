package io.conektto.ecomapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.conektto.ecomapi.model.Location;

public interface LocationRepository extends JpaRepository<Location,Long>{

}
