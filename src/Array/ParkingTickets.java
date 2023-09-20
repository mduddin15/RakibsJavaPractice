package Array;

public class ParkingTickets {


    // this problem is taken from codelab. problem # 20719.
        public static void main(String[] args) {


            int[] parkingTickets = { 9,2,4,5,2,3,4,5,7,8,2,1 };
            int mostTickets = parkingTickets[0]; // Initialize mostTickets with the first element

            for (int k = 1; k < parkingTickets.length; k++) {
                // Compare the current parkingTickets element with mostTickets
                if (parkingTickets[k] > mostTickets) {
                    mostTickets = parkingTickets[k]; // Update mostTickets if a larger value is found
                }
            }

            System.out.println("The most tickets given out is: " + mostTickets);
        }
    }
