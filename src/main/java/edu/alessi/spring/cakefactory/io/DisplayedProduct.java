package edu.alessi.spring.cakefactory.io;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import edu.alessi.spring.cakefactory.model.Product;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * TODO: put comment here 
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
@RequiredArgsConstructor
public class DisplayedProduct {

	public static final String DEFAULT_GRID_IMAGE = "http://placehold.it/700x400";
	public static final String IMAGE_FOLDER = "images";
	
	@NonNull
	private final Product product;
	
	public String priceToDisplay() {
		double priceToFormat = this.product.getPriceLeastMonetaryUnit() / 100D;
		return NumberFormat.getCurrencyInstance(Locale.UK).format(priceToFormat);		
	}
	
	public String name() {
		return this.product.getName();
	}
	
	public String defaultImage() {
		return DEFAULT_GRID_IMAGE;
	}
	
	public String imagePath() {
		String path = String.format("/%s/%s", IMAGE_FOLDER, this.product.getImageFile());
		return StringUtils.isBlank(this.product.getImageFile()) ? "" : path;  
	}
	
	public static DisplayedProduct convertToDisplayForm(final Product product) {
		if (product == null) {
			return null;
		}
		return new DisplayedProduct(product);
	}
	
	public static List<DisplayedProduct> convertToDisplayForm(final List<Product> products) {
		if (CollectionUtils.isEmpty(products)) {
			return Collections.emptyList();
		}
		return products.stream().map(p -> new DisplayedProduct(p)).collect(Collectors.toUnmodifiableList());
	}
	
}
