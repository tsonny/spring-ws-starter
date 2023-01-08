package io.typetowrite.springwsstarter.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @GetMapping("v1/user")
    public UserV1 getFirstVersionUser(){
        return new UserV1("Dolly Parton");
    }
    @GetMapping("v2/user")
    public UserV2 getSecondVersionUser(){
        return new UserV2("Dolly", "Parton");
    }
}
