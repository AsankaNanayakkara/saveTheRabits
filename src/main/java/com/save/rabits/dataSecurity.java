package com.save.rabits;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asanka Nanayakkara on 21/03/2018.
 */
public class dataSecurity {
    private final static String seed = "QuickBrownFoxJumpOverTheLazyDog";

    public String encrypt(String data) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(seed);
        return encryptor.encrypt(data);
    }

    public String decrypt(String data) {
        StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
        decryptor.setPassword(seed);

        return decryptor.decrypt(data);
    }

    public List<donation> decryptList(List<donation> donationList) {
        List<donation> newList = new ArrayList<donation>();
        for (donation donationObj : donationList) {
            newList.add(decryptObj(donationObj));
        }
        return newList;
    }

    public donation decryptObj(donation objDonation) {
        donation newObject = new donation();
        newObject.setDonatorName(decrypt(objDonation.getDonatorName()));
        newObject.setEmail(decrypt(objDonation.getEmail()));
        newObject.setPhone(decrypt(objDonation.getPhone()));
        newObject.setAmount(decrypt(objDonation.getAmount()));

        return newObject;
    }

    public void encryptObj(donation objDonation) {
        objDonation.setDonatorName(encrypt(objDonation.getDonatorName()));
        objDonation.setEmail(encrypt(objDonation.getEmail()));
        objDonation.setPhone(encrypt(objDonation.getPhone()));
        objDonation.setAmount(encrypt(objDonation.getAmount()));
    }
}
