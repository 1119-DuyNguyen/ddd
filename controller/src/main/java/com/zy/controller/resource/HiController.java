package com.zy.controller.resource;

import com.zy.application.service.event.EventAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
@RequiredArgsConstructor
public class HiController {
    private final EventAppService eventAppService;

    @GetMapping
    public String sayHi() {
        return eventAppService.sayHi("Controller");
    }
}
