package com.interviewQuestions;

public class RemoveHeader {
    private static String test = "DB_INDEX,IPV4_ADDR,IP_PFX_LEN,ADDR_STATE,IF_NAME\n" +
            "0,10.240.72.181,22,True,vpn0\n" +
            "1,10.240.139.194,19,True,vpn1\n" +
            "3,10.65.64.179,28,True,ge_0_1_0.18,";
    private static  String test2 ="PRC_UNIT_TYPE,PRC_UNIT_ID,UNIT_ID,FAMILY_TYPE,TYPE_NUM,HW_NAME,VERSION,SERIAL,VENDOR,MNF_DATE,INSTALL_DATE,SERV_DATE,SERV_DATA,POSITION,MNF_DATA\n" +
            "IMP,0,IMP[0],IMP,0x502F,LUA1-N1A,1-1,S623458781,SAMSUNG,2017-04-18,0000-00-00,-,-,ENB[11482]/SHELF[0]/SLOT[1],-,";
    public static void main(String[] args) {
        String value[] = test2.split("\n");
        String newValue ="";
       for(int i=1;i< value.length;i++){
           newValue = newValue + value[i] + "\n";
        }
        System.out.println(newValue);
    }
}
