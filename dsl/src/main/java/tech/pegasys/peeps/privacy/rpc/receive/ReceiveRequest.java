/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.peeps.privacy.rpc.receive;

import tech.pegasys.peeps.privacy.model.OrionKey;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiveRequest {

  private final String to;
  private final OrionKey key;

  public ReceiveRequest(final String to, final OrionKey key) {
    this.to = to;
    this.key = key;
  }

  @JsonGetter("to")
  public String getTo() {
    return to;
  }

  @JsonGetter("key")
  public OrionKey getKey() {
    return key;
  }
}
