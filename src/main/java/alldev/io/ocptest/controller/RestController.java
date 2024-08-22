package alldev.io.ocptest.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/find")
    public String getHello(){
        return "Hello World";
    }


}
