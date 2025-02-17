package com.crm.crm.repository;
//Pritam bhai
import com.crm.crm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository <Product,Long> {

}
