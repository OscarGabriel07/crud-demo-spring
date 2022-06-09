package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.RolUsuarioModel;
import com.crud.democrud.repositories.RolUsuarioRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static  org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RolUsuarioServiceTest {
    @Autowired
    RolUsuarioRepository rolUsuarioRepository;

    @Test
    public void testListarRoles(){
        List<RolUsuarioModel> rolUsuarioModels = (List<RolUsuarioModel>) rolUsuarioRepository.findAll();
        assertThat(rolUsuarioModels).size().isGreaterThan(0);
    }
}
