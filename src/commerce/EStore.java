package commerce;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EStore {
    private String storeName;
    private Set<User> registeredUsers = new HashSet<>();
    private Collection<Category> categories = new HashSet<>();

    public EStore(String storeName, Set<User> registeredUsers) {
        this.storeName = storeName;
        this.registeredUsers = registeredUsers;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Set<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(Set<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
}
