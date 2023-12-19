package auca.com.warehousesyst.controller;

import auca.com.warehousesyst.exception.ResourseNotFoundException;
import auca.com.warehousesyst.model.Client;
import auca.com.warehousesyst.model.Product;
import auca.com.warehousesyst.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping
    public List<Client> getAllclients(){
        return clientRepository.findAll();
    }

    @PostMapping
    public Client createClient (@RequestBody Client client){

        return clientRepository.save(client);
    }
    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(@PathVariable long id){
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourseNotFoundException("Client not exist with id:" +id));
        return ResponseEntity.ok(client);
    }
    @PutMapping("{id}")
    public ResponseEntity<Client> updateClient(@PathVariable long id, @RequestBody Client clientDetails){
        Client updateClient = clientRepository.findById(id)
                .orElseThrow(() -> new ResourseNotFoundException("Product not exist with id:" +id));

        updateClient.setEmail(clientDetails.getEmail());
        updateClient.setProduct(clientDetails.getProduct());
        updateClient.setUprice(clientDetails.getUprice());
        updateClient.setQuantity(clientDetails.getQuantity());
        updateClient.setTotal(clientDetails.getTotal());

        clientRepository.save(updateClient);
        return ResponseEntity.ok(updateClient);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteClient (@PathVariable long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourseNotFoundException("Client not exist with id: "+id));
        clientRepository.delete(client);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
