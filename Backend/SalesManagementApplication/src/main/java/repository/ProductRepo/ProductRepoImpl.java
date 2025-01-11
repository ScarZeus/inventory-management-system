package repository.ProductRepo;

import model.ProductModel;

import java.util.List;

public class ProductRepoImpl implements ProductRepoInterface<ProductModel,Long>{
    @Override
    public ProductModel save(ProductModel productEntity) {
        return null;
    }

    @Override
    public List<ProductModel> saveAll(List<ProductModel> productEntity) {
        return null;
    }

    @Override
    public void delete(ProductModel productEntity) {

    }

    @Override
    public ProductModel update(ProductModel productEntity) {
        return null;
    }

    @Override
    public List<ProductModel> findAll(Long productId) {
        return null;
    }

    @Override
    public List<ProductModel> findById(Long productId) {
        return null;
    }
}
