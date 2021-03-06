/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.remote.client.messages;

/**
 * Response object for a payment capture request
 */
@SuppressWarnings(value="unused")
public class CapturePreAuthResponse extends BaseResponse {
  private String paymentId;
  private Long amount;
  private Long tipAmount;

  /**
   * Constructor
   *
   * @param success If true then the requested operation succeeded
   * @param result The result of the requested operation
   */
  public CapturePreAuthResponse(boolean success, ResultCode result) {
    super(success, result);
  }

  /**
   * Get the field value
   *
   * @return ID of the pre-auth payment being captured
   */
  public String getPaymentId() {
    return paymentId;
  }

  /**
   * Set the field value
   *
   * @param paymentId Id of the pre-auth payment being captured
   */
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  /**
   * Get the field value
   *
   * @return the base amount of the capture
   */
  public Long getAmount() {
    return amount;
  }

  /**
   * Set the field value
   *
   * @param amount the base amount of the capture
   */
  public void setAmount(long amount) {
    this.amount = amount;
  }

  /**
   * Get the field value
   *
   * @return additional tip amount for the capture
   */
  public long getTipAmount() {
    return tipAmount;
  }

  /**
   * Set the field value
   *
   * @param tipAmount additional tip amount for the capture
   */
  public void setTipAmount(long tipAmount) {
    this.tipAmount = tipAmount;
  }
}