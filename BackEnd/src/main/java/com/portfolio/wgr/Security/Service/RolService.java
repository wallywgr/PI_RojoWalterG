
package com.portfolio.wgr.Security.Service;

import com.portfolio.wgr.Security.Entity.Rol;
import com.portfolio.wgr.Security.Enums.RolNombre;
import com.portfolio.wgr.Security.Repository.iRolRepository;
import java.util.Optional;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
