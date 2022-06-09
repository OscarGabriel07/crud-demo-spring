package com.crud.democrud.repositories;

import com.crud.democrud.models.RolUsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolUsuarioRepository extends CrudRepository<RolUsuarioModel, Long> {
}
