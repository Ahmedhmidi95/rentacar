package soa.if5.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import soa.if5.rentacar.entities.Car;

@RepositoryRestResource
public interface CarsRepositroy extends JpaRepository<Car, Long> {
}
