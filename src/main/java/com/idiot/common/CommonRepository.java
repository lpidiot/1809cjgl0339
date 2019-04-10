package com.idiot.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @auther idiot
 * @date 2018/9/29 - 16:14
 */
@NoRepositoryBean
public interface CommonRepository<T,ID> extends JpaRepository<T,ID>,JpaSpecificationExecutor<T> {

}
