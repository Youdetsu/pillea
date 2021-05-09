package action;

import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

public class TagAction implements Action {

    private String username;
    private List<String> list = new ArrayList<>();
    private List<User> user = new ArrayList<>();

    @Override
    public String execute() throws Exception {
        for (int i = 0; i < 10; i++) {
            list.add("str" + i);
        }
        User user = new User();
        user.setUserName("占山");
        User user2 = new User();
        user2.setUserName("里斯");

        this.user.add(user);
        this.user.add(user2);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
