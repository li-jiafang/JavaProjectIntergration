package learning00;

/**
 * @author: ljf
 * @create: 2021/5/10 12:34
 * @description:
 **/
public class UserController {

    @Autowired01
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void run(){
        userService.run();
    }
}
