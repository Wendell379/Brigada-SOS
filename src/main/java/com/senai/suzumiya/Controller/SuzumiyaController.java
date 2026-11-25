package com.senai.suzumiya.Controller;

import com.senai.suzumiya.Entites.Suzumiya;
import com.senai.suzumiya.Service.ServiceSuzumiya;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class SuzumiyaController {

    private final ServiceSuzumiya serviceSuzumiya;

    public SuzumiyaController(ServiceSuzumiya serviceSuzumiya) {
        this.serviceSuzumiya = serviceSuzumiya;
    }

    @PostMapping
    public String save(@RequestBody Suzumiya suzumiya) {
        return serviceSuzumiya.salvar(suzumiya) + "Suzumiya salva com sucesso";
    }

    @GetMapping
    public List<Suzumiya> listar() {
        return serviceSuzumiya.listar();
    }
}
