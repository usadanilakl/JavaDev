package com.ui.spring_js.controller;

import com.ui.spring_js.entity.Loto;
import com.ui.spring_js.repository.LotoRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lotos-api")
@AllArgsConstructor
public class LotoRestController {
    private final LotoRepo lotoRepo;
    @GetMapping("/")
    public ResponseEntity<List<Loto>> getLotos(){
        return ResponseEntity.ok(lotoRepo.findAll());
    }
}
