package de.dhbw.mosbach.inf16a.kochbuch.helloworld;

import lombok.Data;
import lombok.NonNull;

/**
 * @author Patrick Hahn
 */

@Data
public class Greeting
{
	@NonNull
	private final long id;
	@NonNull
	private final String content;
}
