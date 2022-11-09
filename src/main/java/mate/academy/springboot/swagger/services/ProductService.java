package mate.academy.springboot.swagger.services;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.swagger.model.Product;
import org.springframework.data.domain.PageRequest;

public interface ProductService {
    Product crete(Product product);

    Product getById(Long id);

    void deleteByIud(Long id);

    Product update(Product product);

    List<Product> getAll(PageRequest pageRequest);

    List<Product> getAllProductWherePriceBetween(BigDecimal from,
                                                 BigDecimal to, PageRequest pageRequest);
}