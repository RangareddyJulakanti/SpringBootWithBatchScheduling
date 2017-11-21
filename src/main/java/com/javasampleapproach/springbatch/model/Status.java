package com.javasampleapproach.springbatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Status.Builder.class)
public class Status {
    @JsonProperty
    private String code;
    @JsonProperty
    private String description;
    public String code(){
        return code;
    }
    public String description(){
        return description;
    }


    private  Status(Builder builder) {
        this.code=builder.code;
        this.description=builder.description;
    }

    @JsonPOJOBuilder(buildMethodName = "build",withPrefix = "")
    public static class Builder{
        private String code;
        private String description;

        public Builder code(String code){
            this.code=code;
            return this;
        }
        public Builder description(String description){
            this.description=description;
            return this;
        }
        public Status build(){
            return new Status(this);
        }
    }

}
