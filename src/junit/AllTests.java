package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testAdd.class,subTest.class,multTest.class,divTest.class,modTest.class})

public class AllTests {

}
