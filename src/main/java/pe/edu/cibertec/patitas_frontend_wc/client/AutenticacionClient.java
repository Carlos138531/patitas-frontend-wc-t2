package pe.edu.cibertec.patitas_frontend_wc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.patitas_frontend_wc.config.FeignClientConfig;
import pe.edu.cibertec.patitas_frontend_wc.dto.LogoutRequestDTO;
import pe.edu.cibertec.patitas_frontend_wc.dto.LogoutResponseDTO;


@FeignClient(name = "logout", url = "http://localhost:8081/autenticacion", configuration = FeignClientConfig.class)
public interface AutenticacionClient {

    @PostMapping("/logout")
    ResponseEntity<LogoutResponseDTO> login(@RequestBody LogoutRequestDTO logoutRequestDTO);

}
