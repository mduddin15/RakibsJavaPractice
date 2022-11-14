package MathProblems;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathProblemTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - Execute once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - Executed before each test method in this class");
    }

    @Test
    @Order(5)
    void getMaxTest() {
        int a = 20;
        int b = 30;
        int mx = BasicMathProblem.getMax(a, b);
        assertEquals(30, mx);
        System.out.println("5");
    }

    @Test
    @Order(4)
    void getMinTest() {
        int x = 30;
        int y = 100;
        int min = BasicMathProblem.getMin(x, y);
        assertEquals(30, min);
        System.out.println("4");
    }

    @Test
    void getMaxTest2(){

        int x= 5000;
        int y = 60000000;
        int r = 234324;
        int z = 4345223;

        int Max = BasicMathProblem.getMax(x,y,r,z);
        assertEquals(60000000, Max);

    }

    @Test
    @Order(1)
    void getGradeTestF(){
        int n = 33;
       char c = BasicMathProblem.getGrade(n);
        assertEquals('F', c);
        System.out.println("1");
    }

    @Test
    @Order(3)
    void getGradeTestD(){
        int m= 51;
        int y= 59;
        char c = BasicMathProblem.getGrade(m);
        assertEquals('D', c);

        char T = BasicMathProblem.getGrade(y);
        assertEquals('D', T);
        System.out.println("3");

    }

    @Test
    @Order(6)
    void getGradeTestB(){
        int R= 63;
        int S= 69;
        char Q = BasicMathProblem.getGrade(R);
        assertEquals('B', Q);

        char QT = BasicMathProblem.getGrade(S);
        assertEquals('B', QT);
        System.out.println("6");

    }

    @Test
    @Order(2)
    void getGradeTestA(){
        int u = 71;
        char c = BasicMathProblem.getGrade(u);
        assertEquals('A', c);
        System.out.println("2");


    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - This method is called after all test methods.");
    }

}