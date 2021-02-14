package com.azuread.azuread;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naveen Bavu
 */
@RestController

public class HelloResource {

  @RequestMapping("home")
  public String get(@AuthenticationPrincipal(expression = "claims['name']") String name){
    return String.format("Welcome %s! for1 joining first Azure Security Tutorial", name);

  }

}
