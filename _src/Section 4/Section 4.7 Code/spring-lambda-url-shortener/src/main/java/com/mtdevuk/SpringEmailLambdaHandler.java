package com.mtdevuk;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.mtdevuk.functiontypes.EmailDetails;

public class SpringEmailLambdaHandler extends SpringBootRequestHandler<EmailDetails, Boolean> {
}
