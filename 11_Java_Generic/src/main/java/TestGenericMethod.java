import org.junit.jupiter.api.Test;

/**
 * @author: ljf
 * @create: 2021-04-07 13:56
 * @description:
 **/
public class TestGenericMethod {




    @Test
    void test1(){

        People people = new People();
        people.setName("god");
        //
        people.setMail("11；12；13；14；15；16；17；18；36；37；43；44；45；46；47");
        people.setNum(0);

        System.out.println(test11(people));




    }


    public <T> T test11(T t){
        if (t instanceof People){
            People people = (People) t;
            String mail = people.getMail()==null?"": people.getMail();
            if (mail.contains("；")){
                mail = mail.replace("；", ";");
            }
            people.setMail(mail);
            return (T) people;
        }
        return t;
    }




}
