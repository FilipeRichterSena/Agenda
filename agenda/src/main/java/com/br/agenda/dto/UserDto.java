package com.br.agenda.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "email" })
@Data
public class UserDto {

	@JsonProperty("id")
	public Integer id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("email")
	public String email;

}