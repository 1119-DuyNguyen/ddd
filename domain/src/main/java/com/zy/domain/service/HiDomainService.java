package com.zy.domain.service;

import com.zy.domain.repository.HiDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface HiDomainService {
    String sayHi(String who);
}

@Service
@RequiredArgsConstructor
class HiDomainServiceDefault implements HiDomainService {
    private final HiDomainRepository hiDomainRepository;

    @Override
    public String sayHi(String who) {
        return hiDomainRepository.sayHi(who);
    }
}
