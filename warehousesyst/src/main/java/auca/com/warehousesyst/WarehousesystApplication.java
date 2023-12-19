package auca.com.warehousesyst;

import auca.com.warehousesyst.model.Admin;
import auca.com.warehousesyst.model.Client;
import auca.com.warehousesyst.model.Product;
import auca.com.warehousesyst.repository.AdminRepository;
import auca.com.warehousesyst.repository.ClientRepository;
import auca.com.warehousesyst.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarehousesystApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WarehousesystApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
//		Product product = new Product();
//		product.setName("Biscuit");
//		product.setDescription("Good");
//		product.setQuantity(5);
//		product.setPrice(500);
//		productRepository.save(product);
//
//		Product product1 = new Product();
//		product1.setName("Juice");
//		product1.setDescription("Good");
//		product1.setQuantity(10);
//		product1.setPrice(5000);
//		productRepository.save(product1);

//		Admin admin = new Admin();
//		admin.setEmail("cmadaoua@gmail.com");
//		admin.setPassword("Madaoua12?");
//		adminRepository.save(admin);

//		Client client = new Client();
//		client.setEmail("madaoua@gmail");
//		client.setProduct("Juice");
//		client.setUprice(5000);
//		client.setQuantity(2);
//		client.setTotal(10000);
//		clientRepository.save(client);



	}


}
