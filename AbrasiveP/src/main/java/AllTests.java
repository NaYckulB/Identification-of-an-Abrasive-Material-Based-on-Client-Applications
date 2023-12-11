import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.NayckulB.abrasive.WebControllerTest;
import com.NayckulB.abrasive.service.AbrasiveMaterialServiceTest;

@Suite
@SelectClasses({
    WebControllerTest.class,
    AbrasiveMaterialServiceTest.class
   
})
public class AllTests {

}