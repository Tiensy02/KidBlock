package com.javaSpring.KidBlock.Controller.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.javaSpring.KidBlock.Applications.Interface.BlockService;

@Component
public class BlockConfig {
    @Autowired
    BlockService blockService;

    @Scheduled(fixedRate = 86400, initialDelay = 86400)
    public void updateBlockTimeEdit() {
        blockService.updateDateAllBlock();
    }
}
