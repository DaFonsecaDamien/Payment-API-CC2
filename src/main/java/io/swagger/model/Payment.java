package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BuyerInfo;
import io.swagger.model.CreditCardInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T20:27:40.761Z[GMT]")


public class Payment   {
  @JsonProperty("buyer_info")
  private BuyerInfo buyerInfo = null;

  @JsonProperty("checkout_id")
  private String checkoutId = null;

  @JsonProperty("credit_card_info")
  private CreditCardInfo creditCardInfo = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public Payment buyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

  /**
   * Get buyerInfo
   * @return buyerInfo
   **/
  @Schema(description = "")
  
    @Valid
    public BuyerInfo getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public Payment checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * A globally unique ID for this checkout
   * @return checkoutId
   **/
  @Schema(description = "A globally unique ID for this checkout")
  
    public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Payment creditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
   **/
  @Schema(description = "")
  
    @Valid
    public CreditCardInfo getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public Payment amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The transaction amount of the order
   * @return amount
   **/
  @Schema(description = "The transaction amount of the order")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Payment currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the order
   * @return currency
   **/
  @Schema(example = "EUR", description = "The currency for the order")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.buyerInfo, payment.buyerInfo) &&
        Objects.equals(this.checkoutId, payment.checkoutId) &&
        Objects.equals(this.creditCardInfo, payment.creditCardInfo) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.currency, payment.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerInfo, checkoutId, creditCardInfo, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
