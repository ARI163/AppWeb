package com.ariel.appweb;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tareas")
@CrossOrigin

public class TareaController {

    private final TareaRepository repo;

    public TareaController(TareaRepository repo) {
        this.repo = repo;
    }

    // GET -> listar tareas
    @GetMapping
    public List<Tarea> listar() {
        return repo.findAll();
    }

    // POST -> guardar tarea
    @PostMapping
    public Tarea guardar(@RequestBody Tarea tarea) {
        return repo.save(tarea);
    }

    // DELETE -> eliminar tarea
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }


    @PutMapping("/{id}")
public Tarea actualizar(@PathVariable Long id, @RequestBody Tarea nueva) {
    Tarea tarea = repo.findById(id).orElseThrow();

    tarea.setNombre(nueva.getNombre());
    tarea.setCompletado(nueva.isCompletado());

    return repo.save(tarea);
}
}





