package us.bojie.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import us.bojie.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
