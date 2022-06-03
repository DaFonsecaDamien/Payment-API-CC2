package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentOrders
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T20:27:40.761Z[GMT]")


public class PaymentOrders   {
  @JsonProperty("payment_orders_id")
  private String paymentOrdersId = null;

  public PaymentOrders paymentOrdersId(String paymentOrdersId) {
    this.paymentOrdersId = paymentOrdersId;
    return this;
  }

  /**
   * Get paymentOrdersId
   * @return paymentOrdersId
   **/
  @Schema(description = "")
  
    public String getPaymentOrdersId() {
    return paymentOrdersId;
  }

  public void setPaymentOrdersId(String paymentOrdersId) {
    this.paymentOrdersId = paymentOrdersId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOrders paymentOrders = (PaymentOrders) o;
    return Objects.equals(this.paymentOrdersId, paymentOrders.paymentOrdersId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrdersId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOrders {\n");
    
    sb.append("    paymentOrdersId: ").append(toIndentedString(paymentOrdersId)).append("\n");
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
