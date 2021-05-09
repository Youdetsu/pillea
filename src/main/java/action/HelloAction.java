package action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    private String name;
    private String age;

    @Override
    public String execute() throws Exception {
        System.out.println("name:"+name);
        age="12";
        return SUCCESS;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
