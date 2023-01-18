package com.mlieshoff.backend.service;

import com.mlieshoff.backend.dao.Dao;

class ServiceImpl implements Service {

    private final Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String fooBar() {
        return "foo" + dao.bar();
    }

}
