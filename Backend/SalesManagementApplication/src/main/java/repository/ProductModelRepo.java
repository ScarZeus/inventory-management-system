package repository;

import model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductModelRepo extends JpaRepository<ProductModel,Long> {
}
