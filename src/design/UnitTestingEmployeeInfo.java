package design;

import org.junit.Assert;
import org.junit.Test;


public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


    }

    @Test
    public void testSetName() {
        try {
            EmployeeInfo e1 = new EmployeeInfo("Ashraful");

            Assert.assertEquals("Ashraful", e1.employeeName());
        } catch (Exception e){

        }
    }



    @Test
    public void testIsOnlyCharacterTrue(){
        Boolean x = EmployeeInfo.isOnlyCharacter("Rakib");
        Assert.assertEquals(true, x);
    }

    @Test
    public void testIsOnlyCharacterFalse(){
        Boolean x = EmployeeInfo.isOnlyCharacter("Rakib123");
        Assert.assertEquals(false, x);
    }
    @Test
    public void  testSetIdSuccess(){
        EmployeeInfo e2 = null;
        try {
            e2 = new EmployeeInfo("Ashraful");
        } catch (NameNotValidException e) {
            throw new RuntimeException(e);
        }
        e2.setId(342);
    }

    @Test
    public void  testSetIdFailure(){
        EmployeeInfo e2 = null;
        try {
            e2 = new EmployeeInfo("Ashraful");
        } catch (NameNotValidException e) {
            throw new RuntimeException(e);
        }
        e2.setId(1222);
    }
    @Test
    public void testSetSalary(){
        EmployeeInfo e2 = null;
        try {
            e2 = new EmployeeInfo("Ashraful");
        } catch (NameNotValidException e) {
            throw new RuntimeException(e);
        }
        e2.setSalary(4000);

    }

}
