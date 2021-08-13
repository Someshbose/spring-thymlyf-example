package someshbose.github.io.springthymlyfexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import someshbose.github.io.springthymlyfexample.model.Greeting;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String sayHello(Model model){
    int [][] sample= new int[3][3];

    model.addAttribute("name","somesh");
    model.addAttribute("matrix",sample);
    return "hello";
  }

  @GetMapping("/greeting")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new Greeting());
    return "greeting";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "result";
  }
}
