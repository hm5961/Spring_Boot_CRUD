package com.javatodev.api.repository;

import org.hibernate.loader.plan.exec.query.spi.QueryBuildingParameters;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface JpaRepository<T, ID>
    extends PagingAndSortingRepository<T, ID>, QueryBuildingParameters<T> {

}
