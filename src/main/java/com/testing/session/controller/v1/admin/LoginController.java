package com.testing.session.controller.v1.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    //@Autowired
    //private UserLoginService mUserLoginService;

    /*@PostMapping(value = "v1/userLogin")
    public ResponseEntity userLogin(@Valid @RequestBody UserLoginRequestDto userLoginRequestDto) {
        UserLoginResponseDto dto = mUserLoginService.userLogin(userLoginRequestDto);

        return new ResponseEntity(dto, HttpStatus.OK);
    }*/
}
