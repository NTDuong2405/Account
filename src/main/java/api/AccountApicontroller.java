package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AccountService;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/accounts")
public class AccountApicontroller {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam String username,@RequestParam String password){
        accountService.login(username,password);
                return "index";
    }
}
