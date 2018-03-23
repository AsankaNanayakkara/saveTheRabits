/**
 * Created by Asanka Nanayakkara on 21/03/2018.
 */
package com.save.rabits;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Path("donations")
public class webService {
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getMsg(InputStream inputStream) {
        ObjectMapper objectMapper = new ObjectMapper();
        String output;
        try {
            String json = readString(inputStream);
            donation objDonation = objectMapper.readValue(json, donation.class);

            //Adding to the mock database
            //This option can be replaced with any type of data storage mechanism

            //Encrypting data
            dataSecurity dataSecurity = new dataSecurity();
            dataSecurity.encryptObj(objDonation);

            dataStore.addToList(objDonation);

            output = "{\"success\": true,\"Reference\":\"" + objDonation.getDonatorName() + "\"}";
        }catch (Exception e){
            output = "{\"success\": false}";
        }
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg() {
        String output;
        try {
            dataSecurity dataSecurity = new dataSecurity();

            //Decrypting data before creating the json object
            //Creating json representation of the users
            ObjectMapper objectMapper = new ObjectMapper();
            output = objectMapper.writeValueAsString(dataSecurity.decryptList(dataStore.getDataList()));
        }catch (Exception e){
            System.out.print(e.toString());
            output = "{\"success\": false}";
        }
        return Response.status(200).entity(output).build();
    }

    public String readString(InputStream inputStream){
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
