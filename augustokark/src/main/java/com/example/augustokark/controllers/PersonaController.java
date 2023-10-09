package com.example.augustokark.controllers;

import com.example.augustokark.entities.Persona;
import com.example.augustokark.services.PersonaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.augustokark.controllers.BaseControllerImpl;


@RestController
@CrossOrigin (origins = "*" ) // podemos utilizar esta anotacion para que el navegador no nos bloquee el acceso a la api
@RequestMapping(path = "api/v1/personas") // con esto le decimos que todas las rutas de este controlador van a empezar con api/v1/personas
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

//    private PersonaServiceImpl personaServiceImpl;
//    public PersonaController(PersonaServiceImpl personaServiceImpl) {
//        this.personaServiceImpl = personaServiceImpl;
//    }

//    @GetMapping("")
//    public ResponseEntity<?> getAll() {
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findAll());
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getOne(@PathVariable Long id){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findById(id));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
//        }
//    }
//    @PostMapping("")
//    public ResponseEntity<?> save(@RequestBody Persona entity) {
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.save(entity));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intentaaa mas tarde.\"}");
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity) {
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.update(id, entity));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id) {
//        try{
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaServiceImpl.delete(id));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
//        }
//    }

}
