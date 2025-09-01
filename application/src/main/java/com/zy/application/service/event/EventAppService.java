package com.zy.application.service.event;

import com.zy.domain.repository.HiDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface EventAppService {
    String sayHi(String who);
}

@Service
@RequiredArgsConstructor
class EventAppServiceDefault implements EventAppService {

    private final HiDomainRepository hiDomainRepository;
    @Override
    public String sayHi(String who) {
        return hiDomainRepository.sayHi(who);
    }
}