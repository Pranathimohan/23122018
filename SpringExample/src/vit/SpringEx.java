package vit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext p = new ClassPathXmlApplicationContext("beans.xml");
SpringLearn s = (SpringLearn) p.getBean("welcomeMessage");
Spring1 h= (Spring1) p.getBean("come");
s.getMessage();
h.getMsg();
Spring2 j=(Spring2) p.getBean("well");
j.getMsgs();

	}
	

}
