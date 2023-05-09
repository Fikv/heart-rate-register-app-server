package com.fikv.heartrateregisterapplication.controllers;

import com.fikv.heartrateregisterapplication.dtos.ResultDTO;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import com.fikv.heartrateregisterapplication.serives.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/results")
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;
    private final UserRepository userRepository;

    @PostMapping(path ="/add")
    public ResponseEntity<ResultDTO> saveResult(@RequestBody ResultDTO resultDTO){
        resultService.addResult(resultDTO);
      return ResponseEntity.ok(resultDTO);
    }

//    @GetMapping("/{user}")
//    public ResponseEntity<List<ResultDTO>> getAllResults(@PathVariable String username){
//        return ResponseEntity.ok(resultService.getAll(userRepository.getByUsername));
//    }
}
