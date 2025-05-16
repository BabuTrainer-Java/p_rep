package spring_json_xml_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
    private ProductRepository repository;

	public Product save(Product product) {
        return repository.save(product);
    }
	  public Product findById(Long id) {
	        return repository.findById(id)
	       .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
	    }

	  public List<Product> findAll() {
	        return repository.findAll();
	    }

	


}
