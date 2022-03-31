import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.WorkerJDBCTemplate;
import com.spring.model.Worker;


public class App {
    public static void main(String[] args) throws Exception {
        
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	WorkerJDBCTemplate workderDaoImplemenation = context.getBean("workerJDBCTemplate", WorkerJDBCTemplate.class);
    	
    	Worker worker = new Worker(9, "Shreiya", "Randive", 1520512.0, new java.sql.Date(new Date().getTime()),
    			"Software",
    			"shreiy@gmail.com");
    	
    	workderDaoImplemenation.delete(9);
    	workderDaoImplemenation.add(worker);
        

        Worker worker2 = workderDaoImplemenation.getWorker(1);
        System.out.println(worker2);

        List<Worker> list = workderDaoImplemenation.getWorkers();
        for(Worker worker3 : list) {
        	System.out.println(worker3);
        	
        }

        workderDaoImplemenation
                .update(new Worker(9, "Ashish", "Randive", 1520512.0, new java.sql.Date(new Date().getTime()),
                        "Software",
                        "shreiy@gmail.com"));
        System.out.println(workderDaoImplemenation.getWorker(9));
        context.close();
   }
}
