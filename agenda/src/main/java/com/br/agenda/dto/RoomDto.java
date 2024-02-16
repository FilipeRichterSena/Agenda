
package com.br.agenda.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "capacity" })
@Data
public class RoomDto {

	@JsonProperty("id")
	public Integer id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("capacity")
	public Integer capacity;

}