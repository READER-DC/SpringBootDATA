package edu.tacos.repository;

import java.util.Optional;

import edu.tacos.TacoOrder;

public interface OrderRepository {

  TacoOrder save(TacoOrder order);

  Optional<TacoOrder> findById(Long id);

}
