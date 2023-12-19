package auca.com.warehousesyst.repository;

import auca.com.warehousesyst.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
