package com.java8;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {
    static String test1 = "[ eNB_11482 ] RTRV-SYSIP-INFO\n" +
            "   KET034 2021-10-28 THU 06:37:01\n" +
            "  M1939 RETRIEVE SYSTEM IP INFORMATION : COMPLD\n" +
            "   -----------------------------------------------------------------\n" +
            "   DB_INDEX   IPV4_ADDR        IP_PFX_LEN   ADDR_STATE   IF_NAME    \n" +
            "   -----------------------------------------------------------------\n" +
            "   0          10.240.72.181    22           True         vpn0       \n" +
            "   1          10.240.139.194   19           True         vpn1       \n" +
            "   3          10.65.64.179     28           True         ge_0_1_0.18\n" +
            "   -----------------------------------------------------------------\n" +
            "   COUNT = 3";

    public static String getRequiredString(String test) {
        int index = test.indexOf("DB_INDEX");
        String req = test.substring(index);
        return req;
    }

    public static void main(String[] args) {
        String requiredString = getRequiredString(test1);
//        System.out.println(requiredString);
        List finalList = new ArrayList();
        String strArray[] = requiredString.split("\n");

        //For skipping the header and dash in the required String
        //We also skipped count value at the end of the output by using this loop.
        for (int i = 2; i < strArray.length - 2; i++) {

            // This is to trim any trailing spaces.
            String temp = strArray[i].trim();
            String row[] = temp.trim().split("[\\s\\t]");
            List rowList = new ArrayList();

            for (String s : row) {
                String strReq = s.trim();

                //This is to prevent any empty string to be inserted into List.
                if (!s.isEmpty())
                    rowList.add(s);
            }

            //Adding the above computed row in the final list.
            finalList.add(rowList);

        }

        //This block is just to print the result.
        for (Object list : finalList) {
            List l = (List) list;
            for (Object sublist : l) {
                System.out.print(sublist + " ");
            }
            System.out.println();
        }
    }
}
