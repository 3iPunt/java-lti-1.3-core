package edu.uoc.lti.deeplink.content;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@Getter
@Setter
@Builder
public class Custom {
	private String quiz_id;
	private String duedate;
}
