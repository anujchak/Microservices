package com.apiGateWay.apiGateWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
@GetMapping("/userfallback")
public String fallback()
{
	return "user fall back";
}
@GetMapping("/contactfallback")
public String fallbackContact()
{
	return "contact fallback";
}
}
