package com.idiot.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @auther idiot
 * @date 2018/9/29 - 16:22
 */
@Service
public class CommonService<T,ID> {
    @Autowired
    private CommonRepository repository;

    public List<T> findAll(){
        return repository.findAll();
    }

    public T findById(ID id){
        Optional<T> optional = repository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public void save(T model){
        repository.save(model);
    }

    public void delete(T model){
        repository.delete(model);
    }

    public void deleteById(ID id){
        repository.deleteById(id);
    }
    public Page<T> findPage(Pageable pageable){
         return repository.findAll(pageable);
    }

}
