/* package com.example.demo;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/customer")
    public List<Client> index(){
        return customerRepository.findAll();
    }
    @GetMapping("/customer/{id}"){
        public Client show(@PathVariable String id){
            Integer ClientId = Integer.parseInt(id);
            return customerRepository.findOne(ClientId);
        }
        @GetMapping("/customer/search")
        public List<Client> search(@RequestBody Map<String, String> body){
            String searchTerm = body.get("text");
            return customerRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
        }
        @PostMapping("/customer")
        public Client create(@RequestBody Map<String, String> body){
            String title = body.get("title");
            String content = body.get("content");
            return customerRepository.save(new Client(title, content));
        }

        @PutMapping("/blog/{id}")
        public Client update(@PathVariable String id, @RequestBody Map<String, String> body){
            int blogId = Integer.parseInt(id);
            // getting blog
            Client client = customerRepository.findOne(blogId);
            client.setTitle(client.get("title"));
            client.setContent(client.get("content"));
            return customerRepository.save(client);
        }

        @DeleteMapping("blog/{id}")
        public boolean delete(@PathVariable String id){
            int clientId = Integer.parseInt(id);
            customerRepository.delete(clientId);
            return true;
        }

    }
}
 */