import com.springmvc.config.MvcConfig;
import com.springmvc.service.DemoService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/6/28
 * Time: 9:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;
    @Autowired
    private DemoService demoService;
    @Autowired
    WebApplicationContext webApplicationContext;
    @Autowired
    MockHttpSession mockHttpSession;
    @Autowired
    MockHttpServletRequest mockHttpServletRequest;

    @Before
    public  void setup(){
        this.mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
