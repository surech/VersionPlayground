package ch.surech.versionplayground.api.customer.repository;

import ch.surech.versionplayground.api.customer.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository für den Zugriff auf die Kundendaten
 */
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
