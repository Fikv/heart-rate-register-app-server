package com.fikv.heartrateregisterapplication.controllers;

import com.fikv.heartrateregisterapplication.dtos.ResultDTO;
import com.fikv.heartrateregisterapplication.dtos.SearchDatesDTO;
import com.fikv.heartrateregisterapplication.entities.Result;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import com.fikv.heartrateregisterapplication.serives.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @PostMapping("/getFromDates")
    public ResponseEntity<List<Result>> getAllResults(@RequestBody SearchDatesDTO searchDatesDTO){
        return ResponseEntity.ok(resultService.getAllResults(searchDatesDTO));
    }
}
