package de.resasimy.EveryEasy.Glossary.Controller;

import de.resasimy.EveryEasy.Glossary.Entity.Element;
import de.resasimy.EveryEasy.Glossary.Repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@CrossOrigin
public class ElementController {

    @Autowired
    private ElementRepository elementRepository;

    @PostMapping("/glossary/element")
    public ResponseEntity<Element> addElement(@RequestBody Element element){
        return new ResponseEntity<>(elementRepository.save(element), HttpStatus.CREATED);
    }

    @GetMapping("/glossary/element")
    public ResponseEntity <List<Element>> getAllElements(){
        return new ResponseEntity<>(elementRepository.findByState("public"), HttpStatus.OK); //Just get the public words. Private is Private! :)
    }

    @GetMapping("/glossary/element/{id}")
    public ResponseEntity<Optional<Element>> getElementById(@PathVariable String id){
        return new ResponseEntity<>(elementRepository.findById(id), HttpStatus.OK);
    }

    @PutMapping("/glossary/element")
    public ResponseEntity<Element> editElement(@RequestBody Element element){
        return new ResponseEntity<>(elementRepository.save(element), HttpStatus.CREATED);
    }

    @GetMapping("/glossary/element/private")
    public ResponseEntity<List<Element>> getElementByUser(@RequestBody String email){
        return new ResponseEntity<>(elementRepository.findByCreatedByEmail(email), HttpStatus.OK);
    }
}