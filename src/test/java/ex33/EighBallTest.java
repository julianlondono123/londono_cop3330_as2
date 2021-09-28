package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EighBallTest {

    @Test
    void random_response() {
    EighBall app = new EighBall();
    assertEquals("Yes", EighBall.random_response() );
    assertEquals("Maybe", EighBall.random_response());
    assertEquals("No", EighBall.random_response() );
    assertEquals("Ask again later", EighBall.random_response() );
    }
}