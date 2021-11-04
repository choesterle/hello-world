package com.addhelix.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


  //call: http://localhost:8080/addhelix/world

  @RequestMapping(value = "/addhelix/{value}",
          produces = {"application/json"},
          method = RequestMethod.GET)
  public ResponseEntity<String> helloWorld(@PathVariable("value") String value) {
    String response = String.format("Hello dockerized %s", value);
    return ResponseEntity.ok(response);

  }

}
