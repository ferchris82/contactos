package chrisferdev.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer>{
    
}
