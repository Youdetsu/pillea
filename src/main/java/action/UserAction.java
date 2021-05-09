package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class UserAction extends ActionSupport {

    private User user = new User();

    private String page;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String login() {
        ActionContext context = ActionContext.getContext();
        Map request = (Map) context.get("request");
        request.put("request","request122");
        Map<String, Object> session = context.getSession();
        session.put("session","session111");
        System.out.println("login");
        //System.out.println(user.getUserName()+"----");
        return SUCCESS;
    }

    public String regist() {
        System.out.println("regist");
        return SUCCESS;
    }
    public String toPage() {
        System.out.println(page);
        return SUCCESS;
    }
}
