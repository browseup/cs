package io.khasang.cs.dao.impl;

import io.khasang.cs.entity.Cat;

import java.util.List;

public interface CatDao {
    Cat getCatById(int id);

    List<Cat> getCatList();
}
