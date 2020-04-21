import org.junit.Test
import kotlin.test.assertEquals

class main {

    @Test
    fun nameTest(){
      assertEquals("Hi Gustavo", test())
    }


    fun test(name:String = "Gustavo"): String{

        return "Hi $name"
    }

}