import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GreetingTest {
    @Test
    fun `greet the world`() {
        assertThat(greet()).isEqualTo("Hello, World!")
    }

    @Test
    fun `greet by name`() {
        assertThat(greet("Andrew")).isEqualTo("Hello, Andrew!")
    }
}
