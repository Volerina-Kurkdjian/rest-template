package com.example.rest.template;


import com.example.rest.template.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

    @Autowired
    RestTemplateService restTemplateService;

    @GetMapping("/{id}")
    public String getTemplate(@PathVariable(name="id") int id){
      return  restTemplateService.getPost(id);
    }

    @PostMapping()
    public String postTemplate(){
        return restTemplateService.createPost();
    }
}
