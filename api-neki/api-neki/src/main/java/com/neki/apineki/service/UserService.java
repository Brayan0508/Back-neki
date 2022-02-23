package com.neki.apineki.service;

import com.neki.apineki.DTO.UserDTO;
import com.neki.apineki.DTO.UserInserirDTO;
import com.neki.apineki.model.UserModel;
import com.neki.apineki.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> pesquisarTodos(){
     List<UserModel> userlist=userRepository.findAll();
     List<UserDTO> userdtolista = new ArrayList<UserDTO>();

     for (UserModel usuarios:userlist){
         UserDTO userDTO = new UserDTO(usuarios);
         userdtolista.add(userDTO);
     }

     return userdtolista;

    }

    public Optional<UserModel> pesquisaUsuario(Integer id){
        if (!userRepository.existsById(id)){
            throw new IllegalArgumentException("usuario não encontrado");
        }
        return userRepository.findById(id);

    }
    public UserDTO inserirUsuario(UserInserirDTO userInserirDTO){
        UserModel userModel = new UserModel(userInserirDTO);
        userModel.setLastLoginDate(LocalDate.now());
        userRepository.save(userModel);

        return new UserDTO(userModel);

    }
    public void deletarUsuario(Integer id){
        userRepository.deleteById(id);
    }
}
