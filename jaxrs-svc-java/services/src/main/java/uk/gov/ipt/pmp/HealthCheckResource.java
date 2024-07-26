package uk.gov.ipt.pmp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HealthCheckResource {
    @GetMapping("/health")
        public ResponseEntity healthCheck() {
            return ResponseEntity.ok("Service is up and running");
    }

}
