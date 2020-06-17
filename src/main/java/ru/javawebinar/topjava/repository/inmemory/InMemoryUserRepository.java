package ru.javawebinar.topjava.repository.inmemory;

import org.graalvm.compiler.lir.LIRInstruction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.AbstractNamedEntity;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.util.NameComparator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(InMemoryUserRepository.class);
    private Map<Integer, User> repository = new ConcurrentHashMap<>();

    @Override
    public boolean delete(int id) {
        return repository.remove(id)!=null;
    }

    @Override
    public User save(User user) {
        log.info("save {}", user);
        return user;
    }

    @Override
    public User get(int id) {
        return repository.get(id);
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<User>(repository.values());
        Collections.sort(userList, Comparator.comparing(AbstractNamedEntity::getName));
        return userList;
    }

    @Override
    public User getByEmail(String email) {
        for (Map.Entry<Integer, User> entry:repository.entrySet()){
            if (entry.getValue().getEmail().equals(email)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
