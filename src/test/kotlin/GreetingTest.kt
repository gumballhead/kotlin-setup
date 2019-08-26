import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingTest {
    @Test
    fun `greet the world`() {
        assertEquals("Hello, World!", greet())
    }

    @Test
    fun `greet by name`() {
        assertEquals("Hello, Andrew!", greet("Andrew"))
    }
}
