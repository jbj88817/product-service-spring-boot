package us.bojie.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import us.bojie.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
