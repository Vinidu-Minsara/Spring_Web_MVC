package lk.ijse.gdse.springwebdemo.controller;

import lk.ijse.gdse.springwebdemo.model.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
public class Student {

    @GetMapping
    String healthTest(){
        return "Hello Student";
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    StudentDTO checkConsume(@RequestBody StudentDTO student){
//        System.out.println(student);
//        return student;
//    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<StudentDTO> checkConsume(@RequestBody StudentDTO student){
        System.out.println(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }  
}
