package com.br.agenda.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "startTime", "endTime", "userId", "roomId" })
@Data
public class ReservationDto {

	@JsonProperty("startTime")
	public String startTime;
	@JsonProperty("endTime")
	public String endTime;
	@JsonProperty("userId")
	public Integer userId;
	@JsonProperty("roomId")
	public Integer roomId;

}
