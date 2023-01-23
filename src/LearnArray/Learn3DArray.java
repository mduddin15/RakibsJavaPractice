package LearnArray;

public class Learn3DArray {


    public static void main(String[] args) {

        String[][][] mobileInfo = new String[2][3][6];

        mobileInfo[0][0][0] = "SL";
        mobileInfo[0][0][1] = "Mobile Type";
        mobileInfo[0][0][2] = "Price";
        mobileInfo[0][0][3] = "Qty";
        mobileInfo[0][0][4] = "Model";
        mobileInfo[0][0][5] = "Amount";


        mobileInfo[0][1][0] = "1";
        mobileInfo[0][1][1] = "Android";
        mobileInfo[0][1][2] = "1200";
        mobileInfo[0][1][3] = "10";
        mobileInfo[0][1][4] = "S20";
        mobileInfo[0][1][5] = "12000";


        mobileInfo[0][2][0] = "2";
        mobileInfo[0][2][1] = "Android";
        mobileInfo[0][2][2] = "1100";
        mobileInfo[0][2][3] = "5";
        mobileInfo[0][2][4] = "S30";
        mobileInfo[0][2][5] = "5500";


        // 2nd Times
        mobileInfo[1][0][0] = "SL";
        mobileInfo[1][0][1] = "Computer Type";
        mobileInfo[1][0][2] = "Price";
        mobileInfo[1][0][3] = "Qty";
        mobileInfo[1][0][4] = "Model";
        mobileInfo[1][0][5] = "Amount";


        mobileInfo[1][1][0] = "101";
        mobileInfo[1][1][1] = "Mac";
        mobileInfo[1][1][2] = "2200";
        mobileInfo[1][1][3] = "3";
        mobileInfo[1][1][4] = "Mac2022";
        mobileInfo[1][1][5] = "6600";


        mobileInfo[1][2][0] = "102";
        mobileInfo[1][2][1] = "Windows";
        mobileInfo[1][2][2] = "1100";
        mobileInfo[1][2][3] = "7";
        mobileInfo[1][2][4] = "Win2022";
        mobileInfo[1][2][5] = "7700";

        System.out.println("*********** For Each loop to iterate all the elements from 3D Array");


        for (String[][] mobile : mobileInfo) {
            // Convert 3D to 2D
            for (String[] mob : mobile) {
                // Convert 2D to 1D
                for (String mo : mob) {
                    System.out.print(mo + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }
}
