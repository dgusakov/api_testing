package org.dgusakov.api_tests;

import org.dgusakov.api_tests.Models.AccountResp;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.gson.*;
import static com.jayway.restassured.RestAssured.get;

import com.jayway.restassured.response.Response;

public class AccountCheckTests {

    private Gson gson = new Gson();
    private Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void checkMultiple() {

        Response resp = get("http://kn-ktapp.herokuapp.com/apitest/accounts");

        AccountResp[] accountsResp = gson.fromJson(resp.asString(), AccountResp[].class);

        for (AccountResp accResp : accountsResp) {
            Assert.assertNotNull(accResp.accountId, "Account field is empty!\n" + gsonBuilder.toJson(accResp));
        }

    }

    @Test
    public void checkSingle() {

        Response resp = get("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678");

        AccountResp accountResp = gson.fromJson(resp.asString(), AccountResp.class);

        Assert.assertNotNull(accountResp.accountId, "Account field is empty!\n" + gsonBuilder.toJson(accountResp));

    }

}
