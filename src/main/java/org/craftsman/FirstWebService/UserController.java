package org.craftsman.FirstWebService;

import org.craftsman.FirstWebService.model.DataBase;
import org.craftsman.FirstWebService.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final DataBase db = new DataBase();

    @GetMapping
    public List<User> all() {
        return db.all();
    }

    @GetMapping("/{id}")
    public User FindById(@PathVariable int id) {
        return db
                .findById(id)
                .orElse(null);
    }

    @PostMapping
    public User save(@RequestParam String username, @RequestParam String password) {
        User user = new User(username, password);
        return db.save(user);
    }

}
