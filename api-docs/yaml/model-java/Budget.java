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
    @JsonProperty("amountSpent")
    private Double amountSpent;


    @JsonProperty("account")
    private Account account;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("description")
    private String description;

    @JsonProperty("category")
    private Category category;

    @NotNull
    @JsonProperty("frequency")
    private ScheduledFrequencyEnum frequency;

    @JsonProperty("alertThreshold")
    private Double alertThreshold;

    @JsonProperty("isEnabledAlertPushNotification")
    private boolean enabledAlertPushNotification;

    @JsonProperty("isEnabledAlertMail")
    private boolean enabledAlertMail;

    @JsonProperty("currentStatus")
    private AccountStatusEnum currentStatus;

    @JsonProperty("createdAt")
    private Long createdAt;

    @JsonProperty("updatedAt")
    private Long updatedAt;

    @JsonProperty("createdBy")
    private User createdBy;




}
