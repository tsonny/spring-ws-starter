package io.typetowrite.springwsstarter.versioning;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class VersionController {
    private MessageSource messageSource;

    public VersionController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("v1/user")
    public UserV1 getFirstVersionUser() {
        return new UserV1("Dolly Parton");
    }

    @GetMapping("v2/user")
    public UserV2 getSecondVersionUser() {
        return new UserV2("Dolly", "Parton");
    }

    @GetMapping(path = "/user", params = "version=1")
    public UserV1 getFirstVersionPath() {
        return new UserV1("Betty Ruble");
    }

    @GetMapping(path = "/user", params = "version=2")
    public UserV2 getSecondVersionPath() {
        return new UserV2("Betty", "Ruble");
    }

    @GetMapping(path = "/user/header", headers = "X-API-VERSION=1")
    public UserV1 getFirstVersionHeader() {
        return new UserV1("Holly GoLightly");
    }

    @GetMapping(path = "/user/header", headers = "X-API-VERSION=2")
    public UserV2 getSecondVersionHeader() {
        return new UserV2("Holly", "GoLightly");
    }

    @GetMapping(value = "/user/accept", produces = "application/io.typetowrite.app-v1+json")
    public UserV1 getFirstVersionAccept() {
        return new UserV1("Taylor Swift");
    }

    @GetMapping(value = "/user/accept", produces = "application/io.typetowrite.app-v2+json")
    public UserV2 getSecondVersionAccept() {
        return new UserV2("Taylor", "Swift");
    }

    @GetMapping("/user/greeting")
    public String getGreeting() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(
                "good.morning.message",
                null,
                "Default Message",
                locale);
    }
}

