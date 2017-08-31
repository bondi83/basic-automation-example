package Helper;

import java.util.*;

public class Products {
    //Upfront 6M
    public static final String NU_Mobile_Suite_V3_Upfront_6M="NU Mobile Suite V3 - Upfront 6M";
    public static final String NU_IT_Suite_V3_Upfront_6M="NU IT Suite V2 - Upfront 6M";
    public static final String NU_Business_Suite_V3_Upfront_6M="NU Business Suite - Upfront 6M";
    public static final String NU_Cloud_Suite_V3_Upfront_6M="NU Cloud Suite V2 - Upfront 6M";
    public static final String NU_Web_Suite_V3_Upfront_6M="NU Web Suite V3 - Upfront 6M";

    //Upfront 12M
    public static final String NU_All_Suite_V2_Upfront_12M="NU All Suite V2 - Upfront 12M";

    //Financed 12m
    public static final String NU_Mobile_Suite_V3_Financed_12M="NU Mobile Suite V3 - Financed 12M";
    public static final String NU_IT_Suite_V3_Financed_12M="NU IT Suite V2 - Financed 12M";
    public static final String NU_Business_Suite_V3_Financed_12M="NU Business Suite - Financed 12M";
    public static final String NU_Cloud_Suite_V3_Financed_12M="NU Cloud Suite V2 - Financed 12M";
    public static final String NU_Web_Suite_V3_Financed_12M="NU Web Suite V3 - Financed 12M";

    public Set<String> getUpfrontProducts(){
        Set<String> products=new HashSet<String>();
        products.add(NU_Mobile_Suite_V3_Upfront_6M);
        products.add(NU_All_Suite_V2_Upfront_12M);
        products.add(NU_Business_Suite_V3_Upfront_6M);
        products.add(NU_Cloud_Suite_V3_Upfront_6M);
        products.add(NU_IT_Suite_V3_Upfront_6M);
        products.add(NU_Web_Suite_V3_Upfront_6M);
        return products;
    }

}
