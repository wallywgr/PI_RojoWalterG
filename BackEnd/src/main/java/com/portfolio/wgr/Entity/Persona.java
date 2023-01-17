
package com.portfolio.wgr.Entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumnple con la longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumnple con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "No cumnple con la longitud")
    private String img;  
    
}
