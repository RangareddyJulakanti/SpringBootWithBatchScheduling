package com.javasampleapproach.springbatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = ResponsePep.Builder.class)
public class ResponsePep {
    @JsonProperty
    private String pepMessage;
    @JsonProperty
    private String pepChkId;
    @JsonProperty
    private String portfolioMonitor;

    public String pepMessage() {
        return pepMessage;
    }

    public String pepChkId() {
        return pepChkId;
    }

    public String portfolioMonitor() {
        return portfolioMonitor;
    }

    public ResponsePep(Builder builder) {
        this.pepChkId = builder.pepChkId;
        this.pepMessage = builder.pepMessage;
        this.portfolioMonitor = builder.portfolioMonitor;
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
    public static class Builder {
        private String pepMessage;
        private String pepChkId;
        private String portfolioMonitor;

        public Builder pepMessage(String pepMessage) {
            this.pepMessage = pepMessage;
            return this;
        }

        public Builder pepChkId(String pepChkId) {
            this.pepChkId = pepChkId;
            return this;
        }

        public Builder portfolioMonitor(String portfolioMonitor) {
            this.portfolioMonitor = portfolioMonitor;
            return this;
        }

        public ResponsePep build() {
            return new ResponsePep(this);
        }
    }
}
