package com.javasampleapproach.springbatch.controller;

import com.javasampleapproach.springbatch.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(path = "/testRestClient", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    SampleResponse getSampleResponse(@RequestBody SampleRequest sampleRequest) {
    String response=   restTemplate.getForObject("http://services.groupkt.com/country/get/all",String.class);
        return new SampleResponse.Builder()
                .status(new Status.Builder().code("200").description("Success").build())
                .screenResponse(new ScreenResponse.Builder()
                        .esbRqstId("HRCU28687372513790126")
                        .responsePep(new ResponsePep.Builder()
                                .pepChkId("HRCU1867833")
                                .pepMessage("IN_REVIEW")
                                .portfolioMonitor("true")
                                .build()
                        )
                        .build()
                )
                .build();
    }
}
