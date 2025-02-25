package com.cybersoft.demoapi08.controller;


import com.cybersoft.demoapi08.request.UpdateUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @RequestParam : Quy định tham số client truyền lên cho toàn bộ phương thức
     *    - Chỉ với phương thức GET : cách test sẽ điền tham số trên trình duyệt
     * - khác phương thức GET đều là tham số truyền ngầm, để test được thì sử dụng tab body trong postman.
       + json : chọn raw
       + ko phải json chọn form-data hoặc url encoded ( cái này ko có file)
     @RequestBody : tham số truyền lên là dạng json

     @PathVariable: tham số đóng vai trò như đường dẫn



     */





    @GetMapping //Lấy dữ liệu
    public ResponseEntity<?> getUser(@RequestParam String username,
                                     @RequestParam String password) {

        return new ResponseEntity<>("Get User " + username + " - " + password, HttpStatus.OK);
    }

    @PostMapping //Thêm dữ liệu
    public ResponseEntity<?> insertUser(@RequestParam String email,
                                        @RequestParam String phone,
                                        @RequestParam int age) {

        return new ResponseEntity<>("Insert User " + email + " - " + phone, HttpStatus.OK);
    }
@GetMapping("/{userId}")
public ResponseEntity<?> getDetailUser( @PathVariable String userId) {

        return new ResponseEntity<>("Get user detail" + userId ,HttpStatus.OK);
}

@PutMapping
//public ResponseEntity<?> updateUser(@RequestBody List<UpdateUserRequest> userRequest){

    public ResponseEntity<?> updateUser(@RequestBody UpdateUserRequest userRequest){
        return new ResponseEntity<>("Update User: " +userRequest.getEmail(),HttpStatus.OK);
}


}
