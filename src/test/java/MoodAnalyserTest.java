import org.graalvm.compiler.lir.profiling.MoveProfilingPhase_OptionDescriptors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

   @Test
   public void givenMessage_Should_Return_Happy() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood("This is a Happy Message");
      Assert.assertEquals("HAPPY", moodState);
   }

   @Test
   public void givenMessage_Should_Return_Sad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood("This is a Sad Message");
      Assert.assertEquals("HAPPY", moodState);
   }
}


