package lk.ijse.gdse.springwebdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class Teacher {

//    @GetMapping
//    void getTeacherData(){
//        System.out.println("Get teacher data");
//    }

    @PostMapping
    void justPost(){
        System.out.println("Just post req");
    }

//    @PostMapping("/{name}")
//    void getValue(@PathVariable("name") String name){
//        System.out.println("Name of teacher : " + name);
//    }

    //path variables
    @PostMapping("/{name}/{position}")
    void getValue(@PathVariable("name") String name, @PathVariable("position") String position){
        System.out.println("Name of "+ position + " : " + name);
    }

    @PostMapping("/{reference:R\\d{4}}")
    void givenReference(@PathVariable ("reference") String reference){
        System.out.println(reference);
    }

    //request parameters
    @PostMapping(params = {"id", "name"})
    void getParameterDetails(@RequestParam("id") String id, @RequestParam("name") String name){
        System.out.println("id : " + id + ", name : " + name);
    }

    @GetMapping(params = {"number"})
    String checkOddOrEven(@RequestParam("number") Integer number){
        return (number % 2 == 0) ? "Even number" : "Odd number";
    }

    //custom headers
    @PutMapping(headers = "X-token")
    String getDetailsFromHeaders(@RequestHeader("X-token") String token){
        return token;
    }
}
