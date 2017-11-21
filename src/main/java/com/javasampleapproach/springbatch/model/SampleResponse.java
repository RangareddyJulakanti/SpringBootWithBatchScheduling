package com.javasampleapproach.springbatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = SampleResponse.Builder.class)
public class SampleResponse {
    @JsonProperty
    private Status status;
    @JsonProperty
    private ScreenResponse screenResponse;

    public ScreenResponse screenResponse() {
        return screenResponse;
    }

    public Status status() {
        return status;
    }

    private SampleResponse(Builder builder) {
        this.status = builder.status;
        this.screenResponse=builder.screenResponse;
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
    public static class Builder {
        private Status status;
        private ScreenResponse screenResponse;

        public Builder screenResponse(ScreenResponse screenResponse) {
            this.screenResponse = screenResponse;
            return this;
        }

        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        public SampleResponse build() {
            return new SampleResponse(this);
        }
    }
}
