package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Val extends ActionSupport {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void validateLogin() {
        if(username == null || username.length() <= 5) {
            addFieldError("username","长度必须大于5");
        }
    }

    public String login() {
        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> session = actionContext.getSession();
        session.put("user",username);
        return SUCCESS;
    }

    public String regist() {
        return SUCCESS;

    }

}
