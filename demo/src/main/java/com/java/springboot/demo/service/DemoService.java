package com.java.springboot.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    private List<String> js= new ArrayList<>();

    public List<String> getNames(){
        return js;
    }

    public boolean postName(String s){
        js=new ArrayList<>();
        return js.add(s);
    }

    public boolean putName(String s){
        return js.add(s);
    }

    public boolean deleteName(String s){

        return js.remove(s);



    }
}