import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class GreetingTest {
    @Test
    fun greetsWorldByDefault() {
        assertThat(greet(), equalTo("Hello, World!"))
    }

    @Test
    fun greetsByName() {
        assertThat(greet("Andrew"), equalTo("Hello, Andrew!"))
    }
}

