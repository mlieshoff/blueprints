package com.mlieshoff.blueprint.service;

import com.mlieshoff.blueprint.dao.ExampleDao;

import org.springframework.stereotype.Service;

import java.util.List;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class ExampleServiceImpl implements ExampleService {

    private final ExampleDao exampleDao;

    @Override
    public List<ExampleServiceDto> list() {
        return exampleDao.list().stream().map(ExampleServiceMapper.INSTANCE::exampleDaoDtoToExampleServiceDto).toList();
    }
}
