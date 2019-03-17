package datasource;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 测试数据源
 * @author root
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:spring-ibatis.xml"
})
public class TestDataSource {
	
	
	@Autowired
	private DataSource dataSource;
	
	
	@Test
	public void testNotNull() {
		assertNotNull(dataSource);
	}
	
	

}
