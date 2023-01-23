package LearnArray;

public class DuplicateWordAndReverseByKrishna {

        public static void main(String[] args) {

            String x = new String("The area of Dhaka has been inhabited since the first millennium. An early modern city developed from the 17th century as a provincial capital and commercial center of the Mughal Empire. Dhaka was the capital of a proto-industrialised Mughal Bengal for 75 years (1608–39 and 1660–1704). It was the hub of the muslin trade in Bengal and one of the most prosperous cities in the world. The Mughal city was named Jahangirnagar (City of Jahangir) in honor of the erstwhile ruling emperor Jahangir. The city's wealthy Mughal elite included princes and the sons of Mughal emperors. The pre-colonial city's glory peaked in the 17th and 18th centuries when it was home to merchants from across Eurasia. The Port of Dhaka was a major trading post for both riverine and seaborne trade. The Mughals decorated the city with well-laid gardens, tombs, mosques, palaces and forts. The city was once called the Venice of the East. Under British rule, the city saw the introduction of electricity, railways, cinemas, Western-style universities and colleges and a modern water supply. It became an important administrative and educational center in the British Raj, as the capital of Eastern Bengal and Assam province after 1905. In 1947, after the end of British rule, the city became the administrative capital of East Pakistan. It was declared the legislative capital of Pakistan in 1962. In 1971, after the Liberation War, it became the capital of independent Bangladesh. In 2008, Dhaka celebrated 400 years as a municipal city.");
            int count;
            x = x.toLowerCase();
            String[] w = x.split(" ");

            for (int i = 0; i < w.length; i++) {
                System.out.print(w[i] + " ,");
            }
            System.out.println();

            for (int i = 0; i < w.length; i++) {
                count = 1;
                for (int j = i + 1; j < w.length; j++) {

                    if (w[i].equals(w[j])) {
                        count= count+1;
                        w[j] = "";
                    }
                }
                //System.out.println("String i= " + i + " " + Arrays.toString(w)); // for debug

                if (count > 1 && w[i] != "") {
                    System.out.println();
                    System.out.println("duplicate word is " + w[i]);


                    String rev = "";
                    for (int r = w[i].length() - 1; r >= 0; r = r - 1) {
                        rev = rev + w[i].charAt(r);
                    }

                    System.out.println("reverse string is: " + rev);

                }
            }
        }
}

