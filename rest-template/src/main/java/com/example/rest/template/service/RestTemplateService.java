package com.example.rest.template.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestTemplateService {

    @Autowired
    private RestTemplate restTemplate;


    //GET
    public String getPost(int id){
        String url="https://jsonplaceholder.typicode.com/posts/"+id;
        return restTemplate.getForObject(url,String.class);
    }


    //POST
    public String createPost(){
        String url="https://jsonplaceholder.typicode.com/posts";

        Map<String,String> request=new HashMap<>();
        request.put("title","foo");
        request.put("body","bar");
        request.put("userId","1");

        return restTemplate.postForObject(url,request,String.class);
    }

    //PUT
    public ResponseEntity<String> getPostEntity(int id){
        String url="https://jsonplaceholder.typicode.com/posts/"+id;
        return restTemplate.getForEntity(url,String.class);
    }


}
