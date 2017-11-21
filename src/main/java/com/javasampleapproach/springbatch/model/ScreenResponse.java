package com.javasampleapproach.springbatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = ScreenResponse.Builder.class)
public class ScreenResponse {
    @JsonProperty
    private String esbRqstId;
    @JsonProperty
    private ResponsePep responsePep;

    public String esbRqstId() {
        return esbRqstId;
    }

    public ResponsePep responsePep() {
        return responsePep;
    }

    public ScreenResponse(Builder builder) {
        this.esbRqstId = builder.esbRqstId;
        this.responsePep = builder.responsePep;
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
    public static class Builder {
        private String esbRqstId;
        private ResponsePep responsePep;

        public Builder esbRqstId(String esbRqstId) {
            this.esbRqstId = esbRqstId;
            return this;
        }

        public Builder responsePep(ResponsePep responsePep) {
            this.responsePep = responsePep;
            return this;
        }

        public ScreenResponse build() {
            return new ScreenResponse(this);
        }
    }
}
