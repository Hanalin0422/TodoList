package com.todolist.todolist.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer{

    // CORS 로 인해 다른 도메인에서 오는 것을 접근하는 걸 허락해주기 위한 설정들.
    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/**") // 모든 경로를 열어줄거다
            .allowedOrigins("http://localhost:3000") // 다른 도메인이라도 접근을 허락하겠다
            .allowedMethods(
                HttpMethod.GET.name,
                HttpMethod.POST.name,
                HttpMethod.PUT.name,
                HttpMethod.DELETE.name,
            )
    }
}