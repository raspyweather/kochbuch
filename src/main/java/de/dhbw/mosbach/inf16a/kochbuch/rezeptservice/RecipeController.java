package de.dhbw.mosbach.inf16a.kochbuch.rezeptservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;

	@GetMapping(value = "/test")
	public List<Recipe> recipe() {
//		Recipe r = new Recipe();
//		r.demodata();
//		recipeRepository.save(r);
		return recipeRepository.findAll();
	}
	
}