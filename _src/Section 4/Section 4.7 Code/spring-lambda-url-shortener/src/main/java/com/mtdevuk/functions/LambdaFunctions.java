package com.mtdevuk.functions;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.mtdevuk.functiontypes.EmailDetails;

public interface LambdaFunctions {
	@LambdaFunction(functionName="SendShortcodeEmail")
    Boolean sendShortcodeGeneratedEmail(EmailDetails emailDetails);
}
