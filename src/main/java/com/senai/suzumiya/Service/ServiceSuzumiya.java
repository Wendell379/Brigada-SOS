package com.senai.suzumiya.Service;

import com.senai.suzumiya.Entites.Suzumiya;
import com.senai.suzumiya.Reposity.RepositySuzumiya;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSuzumiya {

    private final RepositySuzumiya repositySuzumiya;

    public ServiceSuzumiya(RepositySuzumiya repositySuzumiya) {
        this.repositySuzumiya = repositySuzumiya;
    }

    public Suzumiya salvar (Suzumiya suzumiya) {
        return repositySuzumiya.save(suzumiya);
    }

    public List<Suzumiya> listar() {
        return repositySuzumiya.findAll();
    }
}