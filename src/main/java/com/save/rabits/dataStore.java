package com.save.rabits;
/**
 * Created by Asanka Nanayakkara on 21/03/2018.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asanka Nanayakkara on 20/03/2018.
 */
public class dataStore {
    private static List<donation> dataList = new ArrayList<donation>();
    private static dataStore ourInstance = new dataStore();

    public static dataStore getInstance() {
        return ourInstance;
    }

    public static List<donation> getDataList()
    {
        return dataList;
    }

    public static void addToList(donation objDonation){
        dataList.add(objDonation);
    }

    private dataStore() {
    }
}
