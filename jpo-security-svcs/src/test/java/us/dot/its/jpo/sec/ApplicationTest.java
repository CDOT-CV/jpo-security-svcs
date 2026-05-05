package us.dot.its.jpo.sec;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;

public class ApplicationTest {

   @Test
   public void test() {
      try (MockedStatic<SpringApplication> mocked = mockStatic(SpringApplication.class)) {
         Application.main(new String[] { "testArg" });
         mocked.verify(() -> SpringApplication.run(any(Class.class), any(String[].class)));
      }
   }
}