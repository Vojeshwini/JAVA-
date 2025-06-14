package com.java.xworkz.service;

import com.java.xworkz.dto.ParachutDto;
import com.java.xworkz.repository.ParachutRepo;
import com.java.xworkz.repository.ParachutRepoImpl;

public class ParachutServiceImpl implements ParachutService {
public ParachutServiceImpl(){
    System.out.println("running no arg constrictor in parachutServiceImpl");
}

    @Override
    public boolean save(ParachutDto parachutDto) {

    if(parachutDto!=null){
    String parachutType=parachutDto.getParachutType();
    boolean n_resuable= parachutDto.isN_reusable();
    String deploymentType=parachutDto.getDeploymentType();
    String manufacturedBy=parachutDto.getManufacturedBy();
    long n_capacity=parachutDto.getN_capacity();
    long n_cost=parachutDto.getN_cost();

    if(parachutType!=null){
        System.out.println("valid");
    }else {
        System.out.println("invalid");
        return false;
    }
    if(n_resuable!=false){
        System.out.println("valid");
    }else{
        System.out.println("in valid");
        return false;
    }
    if(deploymentType!=null){
        System.out.println("valid");
    }else {
        System.out.println("in valid");
        return false;
    }
        if(manufacturedBy!=null){
            System.out.println("valid");
        }else {
            System.out.println("in valid");
            return false;
        }
        if(n_capacity!=0){
            System.out.println("valid");
        }else {
            System.out.println("in valid");
            return false;
        }
        if(n_cost!=0){
            System.out.println("valid");
        }else {
            System.out.println("in valid");
            return false;
        }
        ParachutRepo repository = new ParachutRepoImpl();
        return repository.persist(parachutDto);


        }

        return false;
    }
}
