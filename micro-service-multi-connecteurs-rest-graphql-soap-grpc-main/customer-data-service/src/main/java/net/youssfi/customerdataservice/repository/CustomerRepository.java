package net.elhakki.customerdataservice.repository;

import net.elhakki.customerdataservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
