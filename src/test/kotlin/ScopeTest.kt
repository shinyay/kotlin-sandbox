import com.google.shinyay.model.Employee
import com.google.shinyay.model.Gender
import org.junit.Assert
import org.junit.Test

class ScopeTest {

    @Test
    fun testApplyFunction() {
        val employee: Employee = Employee("Rei", lastName = "Ayanami", id = 1)
            .apply {
                age = 14
                gender = Gender.FEMALE
            }
        Assert.assertEquals(14, employee.age)
        Assert.assertEquals(Gender.FEMALE, employee.gender)
    }

    @Test
    fun testLetFunction() {
        val employee: Employee = Employee("Shinji", "Ikari", 2)
            .let {
                it.age = 14
                it.gender = Gender.MALE
                it
            }
        Assert.assertEquals(14, employee.age)
        Assert.assertEquals(Gender.MALE, employee.gender)
    }

    @Test
    fun testRunFunction() {
        val employee: Employee = Employee("Asuka", "Soryu", 3)
            .run {
                age = 14
                gender = Gender.FEMALE
                this
            }
        Assert.assertEquals(14, employee.age)
        Assert.assertEquals(Gender.FEMALE, employee.gender)
    }

    @Test
    fun testAlsoFunction() {
        val employee: Employee = Employee("Toji", "Suzuhara", 4)
            .also {
                it.age = 14
                it.gender = Gender.MALE
            }
            .also {
                Assert.assertEquals(14, it.age)
                Assert.assertEquals(Gender.MALE, it.gender)
            }
    }
}