package com.neki.apineki.controler;

import com.neki.apineki.DTO.UserDTO;
import com.neki.apineki.DTO.UserInserirDTO;
import com.neki.apineki.model.UserModel;
import com.neki.apineki.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserControler {
    @Autowired
    UserService userService;
    @GetMapping("/listar")
    public ResponseEntity<List<UserDTO>>listar(){
        List<UserDTO> users=userService.pesquisarTodos();
        return  ResponseEntity.ok().body(users);
    }
    @GetMapping("/listar/{id}")
    public ResponseEntity <Object>buscarPorId(@PathVariable Integer id){
        Optional<UserModel> user= userService.pesquisaUsuario(id);
        return  ResponseEntity.ok().body(user);

    }
    @PostMapping("/inserir")
    public ResponseEntity <Object>inserir(@RequestBody UserInserirDTO userInserirDTO){
        UserDTO user = userService.inserirUsuario(userInserirDTO);
        return ResponseEntity.ok().body(user);

    }
    @DeleteMapping("/deletar/{id}")
    public void deletar (@PathVariable Integer id){
        userService.deletarUsuario(id);
    }

}
