package edu.uoc.lti.accesstoken;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONAccessTokenRequestBuilderImpl implements AccessTokenRequestBuilder, Serializable {

  @Override
  public String build(AccessTokenRequest request) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(request);
  }

  @Override
  public String getContentType() {
    return "application/json";
  }

}