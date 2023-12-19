package auca.com.warehousesyst.repository;

import auca.com.warehousesyst.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
