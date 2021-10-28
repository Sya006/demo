package com.example.demo.service;

import com.example.demo.entity.Release;
import com.example.demo.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
     private  ReleaseRepository realeaserepository ;

    @Override
    public Iterable<Release> ListRelease() { return realeaserepository.findAll() ; }


}
