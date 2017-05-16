/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {
    @Test
    public void should_return_0A0B_when_no_number_is_correct() {
        //then
        validateGuessNumber("1 2 3 4", "5 6 7 8", "0A0B");
    }

    @Test
    public void should_return_1A0B_when_1_is_correct() {
        //given
        String actualAnswerStr = "1 2 3 4";
        String inputAnswerStr = "1 5 6 7";
        String expectValue = "1A0B";

        //then
        validateGuessNumber(actualAnswerStr, inputAnswerStr, expectValue);
    }

    private void validateGuessNumber(String actualAnswerStr, String inputAnswerStr, String expectValue) {
        Answer actualAnswer = Answer.createAnswer(actualAnswerStr);
        Game game = new Game(actualAnswer);
        Answer inputAnswer = Answer.createAnswer(inputAnswerStr);

        //when
        String result = game.guess(inputAnswer);

        //then
        assertThat(result, is(expectValue));
    }
}
