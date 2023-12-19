package auca.com.warehousesyst.repository;

import auca.com.warehousesyst.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
