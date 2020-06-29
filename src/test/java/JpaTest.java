import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cxp.MySpringBootApplication;
import com.cxp.domain.Spitter;
import com.cxp.repository.SpitterRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class JpaTest {
	@Autowired
	private SpitterRepository repository;
	
	@Test
	public void test() {
		List<Spitter> list = repository.findAll();
		for (Spitter spitter : list) {
			System.out.println(spitter.toString());
		}
	}
}
