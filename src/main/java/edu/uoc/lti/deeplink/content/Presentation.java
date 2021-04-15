package edu.uoc.lti.deeplink.content;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashMap;

/**
 * @author Created by xaracil@uoc.edu
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ToString
public class Presentation {
	@JsonProperty("document_target")
	private String documentTarget;
	private int width;
	private int height;
	@JsonProperty("return_url")
	private String returnUrl;
	@JsonProperty("locale")
	private String locale;

	// Required in Canvas
	private LinkedHashMap errors;
	private String validation_context;
}
