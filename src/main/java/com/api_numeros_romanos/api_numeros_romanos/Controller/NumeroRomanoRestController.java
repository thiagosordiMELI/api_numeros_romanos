package com.api_numeros_romanos.api_numeros_romanos.Controller;

import com.api_numeros_romanos.api_numeros_romanos.Model.Romano;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomanoRestController {

    @GetMapping("/{numero_decimal}")
    public ResponseEntity<Romano> converteDecimalParaRomano(@PathVariable int numero_decimal){
        return new ResponseEntity(new Romano(numero_decimal), HttpStatus.OK);
    }
}
