package mate.academy.springboot.swagger.repository;

import java.math.BigDecimal;
import mate.academy.springboot.swagger.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to, PageRequest pageRequest);
}
