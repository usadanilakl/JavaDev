package com.ui.spring_js.data_generator;

import com.ui.spring_js.entity.Loto;
import com.ui.spring_js.repository.LotoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataGenerator {
    private final LotoRepo lotoRepo;

    public void generateLotos(){
        lotoRepo.save(new Loto(1234L, "Work"));
        lotoRepo.save(new Loto(4321L, "Weld"));
        lotoRepo.save(new Loto(2134L, "Inspect"));
        lotoRepo.save(new Loto(4123L, "Fix"));
        lotoRepo.save(new Loto(3412L, "Build"));
        lotoRepo.save(new Loto(2341L, "Rebuild"));
        lotoRepo.save(new Loto(2413L, "Install"));
    }

}
