import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class GreetingTest {
    @Test
    fun `greet the world`() {
        assertThat(greet(), equalTo("Hello, World!"))
    }

    @Test
    fun `greet by name`() {
        assertThat(greet("Andrew"), equalTo("Hello, Andrew!"))
    }
}
