package com.cybersoft.demoapi08.controller;

import com.cybersoft.demoapi08.entity.BaiVietEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baiviet")
public class BaiVietController {

    @GetMapping
    public ResponseEntity<BaiVietEntity> getAllBaiViet(){

        BaiVietEntity baivietEntity = new BaiVietEntity();
        baivietEntity.setTieuDe("Tieu de");
        baivietEntity.setNoiDung("Noi Dung");

        return new ResponseEntity<>( baivietEntity, HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<String> insertBaiViet(){
        return new ResponseEntity<>( "hello insert data", HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<String> updateBaiViet(){
        return new ResponseEntity<>("hello update data", HttpStatus.OK);
    }

}
