package com.testing.session.controller.v1;


import com.testing.session.exception.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Define the log object for this class
    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @GetMapping(value = "ping")
    public ResponseEntity demo(){
        try {
            //float a=10/0;
            ResponseDto dto = new ResponseDto();
            dto.setResCode(HttpStatus.OK.value());
            dto.setBody("pinging...");
            return new ResponseEntity(dto, HttpStatus.OK);
        }
        catch (Exception e){
            log.error(e.getMessage());
            ResponseDto dto = new ResponseDto();
            dto.setResCode(HttpStatus.BAD_REQUEST.value());
            dto.setBody("Bad Request");
            return new ResponseEntity(dto, HttpStatus.OK);
        }

    }




}
