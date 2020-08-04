import com.google.shinyay.model.Employee
import com.google.shinyay.model.Gender
import org.junit.Assert
import org.junit.Test

class ScopeTest {

    @Test
    fun testApplyFunction() {
        val employee: Employee = Employee("Shinya", lastName = "Yanagihara", id = 1)
            .apply {
                age = 40
                gender = Gender.MALE
            }
        Assert.assertEquals(40, employee.age)
        Assert.assertEquals(Gender.MALE, employee.gender)
    }

    @Test
    fun testLetFunction() {
        val employee: Employee = Employee("Shinya", "Yanagihara", 2)
            .let {
                it.age = 30
                it.gender = Gender.MALE
                it
            }
    }
}