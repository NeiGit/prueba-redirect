package com.redirect;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/redirect")
public class RedirectController {
    private static final String HTTP_REGEX = "^https?://.*";
    private static final String HTTP = "http://";

    @PostMapping
    ModelAndView postData (@RequestBody LinkCatalog linkCatalog) {
        String link = linkCatalog.getLink();
        if (!link.matches(HTTP_REGEX)) {
            link = HTTP + link;
        } else {
            link = link;
        }
        return new ModelAndView("redirect:" + link);
    }
}
