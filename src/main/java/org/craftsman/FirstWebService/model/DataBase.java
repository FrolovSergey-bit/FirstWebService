package org.craftsman.FirstWebService.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBase {
    private List<User> users = new ArrayList<>();
    public List<User> all() {
        return users;
    }

    public Optional<User> findById(int id) {
        return users
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public User save(User user) {
        user.setId(nextId());
        users.add(user);
        return user;
    }

    public int nextId() {
        if (users.size() == 0) {
            return 1;
        }
        return users
                .get(users.size() - 1)
                .getId() + 1;

    }
}
