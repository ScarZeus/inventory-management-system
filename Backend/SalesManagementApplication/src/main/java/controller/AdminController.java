package controller;

import model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {


    @PostMapping("/addNewEmployee")
    public ResponseEntity<UserModel> addEmployee(@RequestBody UserModel user){
       return null;
    }

}
