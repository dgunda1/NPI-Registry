package org.eurekaclinical.npiregistry.controller;


import java.math.BigDecimal;
import java.util.List; 

import org.eurekaclinical.npiregistry.entity.NPI_DATA;
import org.eurekaclinical.npiregistry.entity.User;
import org.eurekaclinical.npiregistry.repository.NpiRepository;
import org.eurekaclinical.npiregistry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private UserRepository userRepository;
  @Autowired
  private NpiRepository npiRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
  
  @GetMapping(path="/allnpi")
  public @ResponseBody Iterable<NPI_DATA> getAllNpiUsers() {
    // This returns a JSON or XML with the NPI_DATA_TEMP
    return npiRepository.findAll();
  }
  
  @GetMapping(path="/nextValue")
  public @ResponseBody BigDecimal getNextValMySequence() {
    // This returns a JSON or XML with the NPI_DATA_TEMP
    return npiRepository.getNextValMySequence();
  }
    
   @GetMapping(path="/getProviderNPI")
    public @ResponseBody List<Object> getProviderNPI() {
      // This returns a JSON or XML with the NPI_DATA_TEMP
      return npiRepository.getProviderNPI();
   }
  
}