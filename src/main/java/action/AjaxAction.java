package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.HashMap;
import java.util.Map;

public class AjaxAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    private Map<String,Object> map ;

    public String returnJson() {
        map = new HashMap<>();
        map.put("name","张三");
        map.put("age","23");
        return SUCCESS;
    }
    public String returnUserJson() {
        map = new HashMap<>();
        map.put("name",user.getUserName());
        map.put("phone",user.getPhone());
        System.out.println(user);
        return SUCCESS;
    }
    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        return user;
    }
}
