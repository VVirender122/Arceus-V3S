package com.arceus.v3s.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Lightweight liveness endpoint so clients and deployments can check
 * that the backend is running.
 */
@RestController
@RequestMapping("/api")
public class HealthController {

    /** JSON body returned by the health endpoint. */
    public record HealthResponse(String status) {
    }

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP");
    }
}
