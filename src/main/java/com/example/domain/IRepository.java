package com.example.domain;

public interface IRepository<T extends Entity<?>, K extends KeyIdentity<?>> {

    T load(K id);

}
