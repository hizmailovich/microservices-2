package com.solvd.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("author_service_route",
                        route -> route.path("/author-service/**")
                                .filters(filter -> filter.stripPrefix(1))
                                .uri("lb://author-service"))
                .route("book_service_route",
                        route -> route.path("/book-service/**")
                                .filters(filter -> filter.stripPrefix(1))
                                .uri("lb://book-service"))
                .build();
    }

}
