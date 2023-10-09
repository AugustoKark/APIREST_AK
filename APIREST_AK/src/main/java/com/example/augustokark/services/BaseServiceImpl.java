package com.example.augustokark.services;

import com.example.augustokark.repositories.BaseRepository;
import com.example.augustokark.entities.Base;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository){
        this.baseRepository = baseRepository;
    }


}
