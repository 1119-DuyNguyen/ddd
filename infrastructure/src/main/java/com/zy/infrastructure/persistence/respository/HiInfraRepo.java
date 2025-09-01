package com.zy.infrastructure.persistence.respository;

import com.zy.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Component;

@Component
public class HiInfraRepo implements HiDomainRepository {

    @Override
    public String sayHi(String who) {
        return "Hello, " + who + "! This is HiInfraRepo.";
    }
}
