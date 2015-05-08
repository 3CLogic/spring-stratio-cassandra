package stratiopoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc.cassandra.CassandraConfig;
import com.poc.cassandra.Poet;
import com.poc.cassandra.SimplePoetRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CassandraConfig.class)
public class TestCassandra {

	@Autowired
	private SimplePoetRepository simplePoetRepository;
	
	@Test
	public void testName() throws Exception {
		simplePoetRepository.save(new Poet("1234567890", "David", 40)); 		 
	    assertEquals(40,simplePoetRepository.findOne("1234567890").getAge()); 
	}

}
