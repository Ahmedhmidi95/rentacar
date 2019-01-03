package soa.if5.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import soa.if5.rentacar.entities.CarReservation;

@RepositoryRestResource
public interface CarReservationsRepository extends JpaRepository<CarReservation, Long> {
}
