package com.testing.session.controller.v1.business;

import com.testing.session.dto.request.StudentRequestDto;
import com.testing.session.exception.ResponseDto;
import com.testing.session.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StudentController {

    @Autowired
    private StudentService mStudentService;

    @PostMapping(value = "/v1/student")
    public ResponseEntity createStudent(@RequestBody StudentRequestDto requestDto) {

        mStudentService.createStudent(requestDto);
        ResponseDto dto = new ResponseDto();
        dto.setBody("Student Created");
        dto.setResCode(HttpStatus.CREATED.value());
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    @PutMapping(value = "/v1/student")
    public ResponseEntity updateStudent(@RequestBody StudentRequestDto requestDto) {

        mStudentService.editStudent(requestDto);
        ResponseDto dto = new ResponseDto();
        dto.setBody("Student Updated");
        dto.setResCode(HttpStatus.ACCEPTED.value());
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/v1/student")
    public ResponseEntity getAllStudent() {

        List list = mStudentService.getStudents();

        return new ResponseEntity(list, HttpStatus.OK);
    }


}
