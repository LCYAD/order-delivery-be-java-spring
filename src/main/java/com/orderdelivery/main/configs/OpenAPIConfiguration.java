package com.orderdelivery.main.configs;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
			title = "Order Delivery POC BE",
			description = "The backend server for the Order Delivery POC"
		),
		servers = @Server(url = "http://localhost:8080")
)
public class OpenAPIConfiguration {
}