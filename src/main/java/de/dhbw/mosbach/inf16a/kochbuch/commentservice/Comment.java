package de.dhbw.mosbach.inf16a.kochbuch.commentservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.dhbw.mosbach.inf16a.kochbuch.rezeptservice.Recipe;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Alexander Krieg
 * @author Patrick Eichert
 * @author Theresa Reus
 * @author Thomas Hörner
 */

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "commentId", nullable = false)
	private long id;

	@NonNull
	private String text;

	@NonNull
	private Date creationDate;

	@NonNull
	private Long userID;

	@JsonIgnore
	@NonNull
	@ManyToOne
	@JoinColumn(name = "rezeptId")
	private Recipe recipe;
}