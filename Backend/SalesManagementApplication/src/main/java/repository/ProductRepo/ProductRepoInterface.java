package repository.ProductRepo;

import java.util.List;

public interface ProductRepoInterface<T,ID> {
    T save(T entity);
    List<T> saveAll(List<T> entity);
    void delete(T entity);
    T update(T entity);
    List<T> findAll(ID id);
    List<T> findById(ID id);
}
