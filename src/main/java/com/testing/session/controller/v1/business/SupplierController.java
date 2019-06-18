package com.testing.session.controller.v1.business;

import com.testing.session.dto.request.ReceiptRequestDto;
import com.testing.session.exception.ResponseDto;
import com.testing.session.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SupplierController {

    @Autowired
    private ReceiptService mReceiptService;


    @PostMapping(value = "/v1/supplier")
    public ResponseEntity createSupplier(ReceiptRequestDto receiptRequestDto) {

        mReceiptService.createReceipt(receiptRequestDto);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setResCode(HttpStatus.CREATED.value());
        responseDto.setBody("Receipt created");
        return new ResponseEntity(responseDto, HttpStatus.OK);
    }

    @PutMapping(value = "/v1/supplier")
    public ResponseEntity updateSupplier(ReceiptRequestDto receiptRequestDto) {

        mReceiptService.editReceipt(receiptRequestDto);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setResCode(HttpStatus.ACCEPTED.value());
        responseDto.setBody("Receipt Updated");
        return new ResponseEntity(responseDto, HttpStatus.OK);
    }

    @GetMapping(value = "/v1/receipt")
    public ResponseEntity getAllReceipt() {

        List list = mReceiptService.getReceipts();

        return new ResponseEntity(list, HttpStatus.OK);
    }

}
