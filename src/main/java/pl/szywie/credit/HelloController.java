package pl.szywie.credit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    NameProvider nameProvider;

    public HelloController(NameProvider nameProvider){
        this.nameProvider = nameProvider;
    }
    @GetMapping("/names")
    List<String> names(){
        return nameProvider.allNames();
    }
}
