package it.italiancoders.mybudget.model.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Builder(builderMethodName = "newBuilder")
@Getter
@Setter
@AllArgsConstructor
public class Budget {

    @JsonProperty("id")
    private String id;

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("amount")
    private Double amount;
    @NotNull
    @JsonProperty("account")
    private Account account;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("description")
    private String description;

    @NotNull
    @JsonProperty("category")
    private Category category;

    @NotNull
    @JsonProperty("frequency")
    private ScheduledFrequencyEnum frequency;

    @JsonProperty("alertThreshold")
    private Double alertThreshold;

    @JsonProperty("isEnableAlertPushNotification")
    private boolean isEnableAlertPushNotification;

    @JsonProperty("isEnableAlertMail")
    private boolean isEnableAlertMail;

    @JsonProperty("monthlyStatus")
    private AccountStatusEnum currentStatus;

    public Budget(){}

}
