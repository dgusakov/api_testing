package org.dgusakov.api_tests.Models;


import com.google.gson.annotations.SerializedName;


public class AccountResp {

    @SerializedName("design_url")
    public String designUrl;

    @SerializedName("transactions_total_amount")
    public Integer transactionsTotalAmount;

    @SerializedName("tariff_avg_month_balance")
    public Integer tariffAvgMonthBalance;

    @SerializedName("type")
    public Integer type;

    @SerializedName("closing_date")
    public String closingDate;

    @SerializedName("partial_withdraw_available")
    public Integer partialWithdrawAvailable;

    @SerializedName("refill_available")
    public Integer refillAvailable;

    @SerializedName("blocked_amount")
    public Double blockedAmount;

    @SerializedName("scheme_id")
    public String schemeId;

    @SerializedName("pan")
    public String pan;

    @SerializedName("account_id")
    public Integer accountId;

    @SerializedName("title_small")
    public String titleSmall;

    @SerializedName("title")
    public String title;

    @SerializedName("balance")
    public Double balance;

    @SerializedName("currency")
    public String currency;

    @SerializedName("isSalary")
    public Boolean isSalary;

}